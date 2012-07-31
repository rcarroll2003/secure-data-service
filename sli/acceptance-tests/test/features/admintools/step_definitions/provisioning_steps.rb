=begin

Copyright 2012 Shared Learning Collaborative, LLC

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

=end


require "selenium-webdriver"
require "json"
require 'approval'
require 'mongo'

require_relative "../../utils/sli_utils.rb"
require_relative "../../utils/selenium_common.rb"
require "date"

SAMPLE_DATA_SET1_CHOICE = "ed_org_STANDARD-SEA"
SAMPLE_DATA_SET2_CHOICE = "ed_org_IL-SUNSET"
CUSTOM_DATA_SET_CHOICE = "custom"

Given /^LDAP and email server has been setup and running$/ do
  @ldap = LDAPStorage.new(PropLoader.getProps['ldap_hostname'], PropLoader.getProps['ldap_port'], 
                          PropLoader.getProps['ldap_base'], PropLoader.getProps['ldap_admin_user'], 
                          PropLoader.getProps['ldap_admin_pass'])
   @email_sender_name= "Administrator"
     @email_sender_address= "noreply@slidev.org"
      @email_conf = {
       :host => PropLoader.getProps['email_smtp_host'],
       :port => PropLoader.getProps['email_smtp_port'],
       :sender_name => @email_sender_name,
       :sender_email_addr => @email_sender_address
     }
  
   @edorgId =  "Test_Ed_Org"
   @email = "devldapuser_#{Socket.gethostname}@slidev.org"
end

Given /^there is a production account in ldap for vendor "([^"]*)"$/ do |vendor|
  @sandboxMode=false
  ApprovalEngine.init(@ldap,Emailer.new(@email_conf),nil,true)
  @tenantId = @email
  remove_user(@email)
  sleep(1)

  user_info = {
      :first => "Provision",
      :last => "test",
       :email => @email,
       :emailAddress => @email,
       :password => "test1234",
       :emailtoken => "token",
       :vendor => vendor,
       :status => "submitted",
       :homedir => "/dev/null",
       :uidnumber => "500",
       :gidnumber => "500",
       :tenant => @tenantId,
       :edorg => @edorgId
   }

  ApprovalEngine.add_disabled_user(user_info)
  ApprovalEngine.change_user_status(@email, ApprovalEngine::ACTION_ACCEPT_EULA)
  user_info = ApprovalEngine.get_user(@email)
  ApprovalEngine.verify_email(user_info[:emailtoken])
  #ApprovalEngine.change_user_status(@email, ApprovalEngine::ACTION_APPROVE)
end

When /^I go to the provisioning application$/ do
  url = PropLoader.getProps['admintools_server_url']+"/landing_zone"
  @driver.get(url)
end

Then /^I can only enter a custom high\-level ed\-org$/ do
  lower_timeout_for_same_page_validation
  assertWithWait("Custom data choice does not exist") {@driver.find_element(:id, CUSTOM_DATA_SET_CHOICE) != nil}
  assert(@driver.find_elements(:id, SAMPLE_DATA_SET1_CHOICE).empty?, "Sample data choices exist on production")
  assert(@driver.find_elements(:id, SAMPLE_DATA_SET2_CHOICE).empty?, "Sample data choices exist on production")
  reset_timeouts_to_default
end

When /^I set the custom high\-level ed\-org to "([^"]*)"$/ do |arg1|
  @driver.find_element(:id, "custom_ed_org").send_keys arg1
end

When /^I select the first sample data set$/ do
  @driver.find_element(:id, SAMPLE_DATA_SET1_CHOICE).click
end

When /^I click the Provision button$/ do
  @driver.find_element(:id, "provisionButton").click
end

Then /^I get the success message$/ do
  assertWithWait("No success message") {@driver.find_element(:id, "successMessage") != nil}
end

Then /^I check to find if default roles were created for the tenant$/ do
  @conn             = Mongo::Connection.new('localhost', 27017)
  @db               = @conn['sli']
  @roles_collection = @db.collection('roles')
  
  @result = "true"
  @roles_collection.find.each do |row|
    if row['metaData']['tenantId'] == 'Macro Corp'
      @result = "false" unless @row['body']['roles'].size == 4        
    end
  end
  assert(@result == "true", "Failed to initialize default roles correctly.")
end

Given /^there is a sandbox account in ldap for vendor "([^"]*)"$/ do |vendor|
  @sandboxMode=true
  ApprovalEngine.init(@ldap,Emailer.new(@email_conf),nil,@sandboxMode)
  @tenantId = @email
remove_user(@email)
sleep(1)

  user_info = {
      :first => "Provision",
      :last => "test",
       :email => @email,
       :emailAddress => @email,
       :password => "test1234",
       :emailtoken => "token",
       :vendor => vendor,
       :status => "submitted",
       :homedir => "changeit",
       :uidnumber => "500",
       :gidnumber => "500",
       :tenant => @tenantId
   }

  ApprovalEngine.add_disabled_user(user_info)
  ApprovalEngine.change_user_status(@email, ApprovalEngine::ACTION_ACCEPT_EULA)
  user_info = ApprovalEngine.get_user(@email)
  ApprovalEngine.verify_email(user_info[:emailtoken])
end

Then /^I can select between the the high level ed\-org of the sample data sets or enter a custom high\-level ed\-org$/ do
  assertWithWait("Sample data choice does not exist") {@driver.find_element(:id, SAMPLE_DATA_SET1_CHOICE) != nil}
  #assertWithWait("Sample data choice does not exist") {@driver.find_element(:id, SAMPLE_DATA_SET2_CHOICE) != nil}
  assertWithWait("Custom data choice does not exist") {@driver.find_element(:id, CUSTOM_DATA_SET_CHOICE) != nil}
end

Then /^I get a already provisioned message$/ do
  assertWithWait("No already provisioned message") {@driver.find_element(:id, "alreadyProvisioned") != nil}
end
def remove_user(email)
  if ApprovalEngine.user_exists?(email)
  ApprovalEngine.remove_user(email)
  end
end

When /^I fill in the rsa key with "(.*?)"$/ do |arg1|
  @driver.find_element(:id, "addKeyBtn").click
  sleep 1
  @driver.find_element(:id, "public_key").send_keys (arg1)
end

Then /^I get an rsa key error message$/ do
  sleep 3
  assertWithWait("Your key was not recognized. The SLC uses RFC4716 format for RSA keys. If you used another format, please covert your key to this format.")  {@driver.find_element(:id, "rsa_validation_error_text")}
end

