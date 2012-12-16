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

require_relative "baseEntity.rb"

# creates staff cohort association
class StaffCohortAssociation < BaseEntity
  attr_accessor :staff, :cohort, :begin_date, :end_date, :access

  def initialize(staff_id, cohort, access, begin_date, end_date = begin_date >> 12)
    @staff = staff_id
    @cohort = cohort
    @access = access
    @begin_date = begin_date
    @end_date = end_date
  end

end
