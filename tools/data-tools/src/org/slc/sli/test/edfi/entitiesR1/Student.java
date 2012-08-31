//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.31 at 10:43:34 AM EDT 
//


package org.slc.sli.test.edfi.entitiesR1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This entity represents an individual for whom
 * 				instruction, services
 * 				and/or care are provided in an early childhood,
 * 				elementary or secondary educational
 * 				program under the jurisdiction of
 * 				a school, education agency, or other
 * 				institution or program. A student
 * 				is a person who has been enrolled in a school or
 * 				other educational institution.
 * 			
 * 
 * <p>Java class for student complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="student">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="studentUniqueStateId" type="{http://slc-sli/ed-org/0.1}uniqueStateIdentifier"/>
 *         &lt;element name="name" type="{http://slc-sli/ed-org/0.1}name"/>
 *         &lt;element name="otherName" type="{http://slc-sli/ed-org/0.1}otherName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://slc-sli/ed-org/0.1}sexType"/>
 *         &lt;element name="birthData" type="{http://slc-sli/ed-org/0.1}birthData"/>
 *         &lt;element name="telephone" type="{http://slc-sli/ed-org/0.1}telephone" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="electronicMail" type="{http://slc-sli/ed-org/0.1}electronicMail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="profileThumbnail" type="{http://slc-sli/ed-org/0.1}profileThumbnail" minOccurs="0"/>
 *         &lt;element name="hispanicLatinoEthnicity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="oldEthnicity" type="{http://slc-sli/ed-org/0.1}oldEthnicityType" minOccurs="0"/>
 *         &lt;element name="race" type="{http://slc-sli/ed-org/0.1}raceItemType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="economicDisadvantaged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="schoolFoodServicesEligibility" type="{http://slc-sli/ed-org/0.1}schoolFoodServicesEligibilityType" minOccurs="0"/>
 *         &lt;element name="studentCharacteristics" type="{http://slc-sli/ed-org/0.1}studentCharacteristic" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="limitedEnglishProficiency" type="{http://slc-sli/ed-org/0.1}limitedEnglishProficiencyType" minOccurs="0"/>
 *         &lt;element name="languages" type="{http://slc-sli/ed-org/0.1}languageItemType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="homeLanguages" type="{http://slc-sli/ed-org/0.1}languageItemType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="disabilities" type="{http://slc-sli/ed-org/0.1}disability" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="section504Disabilities" type="{http://slc-sli/ed-org/0.1}section504DisabilityItemType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="specialEducationAttributes" type="{http://slc-sli/ed-org/0.1}studentSpecialEdAttributes" minOccurs="0"/>
 *         &lt;element name="displacementStatus" type="{http://slc-sli/ed-org/0.1}displacementStatusType" minOccurs="0"/>
 *         &lt;element name="learningStyles" type="{http://slc-sli/ed-org/0.1}learningStyles" minOccurs="0"/>
 *         &lt;element name="studentIndicators" type="{http://slc-sli/ed-org/0.1}studentIndicator" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="assessments" type="{http://slc-sli/ed-org/0.1}studentAssessment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="disciplineIncidents" type="{http://slc-sli/ed-org/0.1}disciplineIncident" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="programs" type="{http://slc-sli/ed-org/0.1}studentProgram" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cohorts" type="{http://slc-sli/ed-org/0.1}studentCohort" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "student", propOrder = {
    "studentUniqueStateId",
    "name",
    "otherName",
    "sex",
    "birthData",
    "telephone",
    "electronicMail",
    "profileThumbnail",
    "hispanicLatinoEthnicity",
    "oldEthnicity",
    "race",
    "economicDisadvantaged",
    "schoolFoodServicesEligibility",
    "studentCharacteristics",
    "limitedEnglishProficiency",
    "languages",
    "homeLanguages",
    "disabilities",
    "section504Disabilities",
    "specialEducationAttributes",
    "displacementStatus",
    "learningStyles",
    "studentIndicators",
    "assessments",
    "disciplineIncidents",
    "programs",
    "cohorts"
})
public class Student {

    @XmlElement(required = true)
    protected String studentUniqueStateId;
    @XmlElement(required = true)
    protected Name name;
    protected List<OtherName> otherName;
    @XmlElement(required = true)
    protected SexType sex;
    @XmlElement(required = true)
    protected BirthData birthData;
    protected List<Telephone> telephone;
    protected List<ElectronicMail> electronicMail;
    protected String profileThumbnail;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean hispanicLatinoEthnicity;
    protected OldEthnicityType oldEthnicity;
    protected List<RaceItemType> race;
    protected Boolean economicDisadvantaged;
    protected SchoolFoodServicesEligibilityType schoolFoodServicesEligibility;
    protected List<StudentCharacteristic> studentCharacteristics;
    protected LimitedEnglishProficiencyType limitedEnglishProficiency;
    protected List<LanguageItemType> languages;
    protected List<LanguageItemType> homeLanguages;
    protected List<Disability> disabilities;
    protected List<Section504DisabilityItemType> section504Disabilities;
    protected StudentSpecialEdAttributes specialEducationAttributes;
    protected String displacementStatus;
    protected LearningStyles learningStyles;
    protected List<StudentIndicator> studentIndicators;
    protected List<StudentAssessment> assessments;
    protected List<DisciplineIncident> disciplineIncidents;
    protected List<StudentProgram> programs;
    protected List<StudentCohort> cohorts;

    /**
     * Gets the value of the studentUniqueStateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentUniqueStateId() {
        return studentUniqueStateId;
    }

    /**
     * Sets the value of the studentUniqueStateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentUniqueStateId(String value) {
        this.studentUniqueStateId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the otherName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherName }
     * 
     * 
     */
    public List<OtherName> getOtherName() {
        if (otherName == null) {
            otherName = new ArrayList<OtherName>();
        }
        return this.otherName;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link SexType }
     *     
     */
    public SexType getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link SexType }
     *     
     */
    public void setSex(SexType value) {
        this.sex = value;
    }

    /**
     * Gets the value of the birthData property.
     * 
     * @return
     *     possible object is
     *     {@link BirthData }
     *     
     */
    public BirthData getBirthData() {
        return birthData;
    }

    /**
     * Sets the value of the birthData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BirthData }
     *     
     */
    public void setBirthData(BirthData value) {
        this.birthData = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Telephone }
     * 
     * 
     */
    public List<Telephone> getTelephone() {
        if (telephone == null) {
            telephone = new ArrayList<Telephone>();
        }
        return this.telephone;
    }

    /**
     * Gets the value of the electronicMail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electronicMail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectronicMail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectronicMail }
     * 
     * 
     */
    public List<ElectronicMail> getElectronicMail() {
        if (electronicMail == null) {
            electronicMail = new ArrayList<ElectronicMail>();
        }
        return this.electronicMail;
    }

    /**
     * Gets the value of the profileThumbnail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileThumbnail() {
        return profileThumbnail;
    }

    /**
     * Sets the value of the profileThumbnail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileThumbnail(String value) {
        this.profileThumbnail = value;
    }

    /**
     * Gets the value of the hispanicLatinoEthnicity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHispanicLatinoEthnicity() {
        return hispanicLatinoEthnicity;
    }

    /**
     * Sets the value of the hispanicLatinoEthnicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHispanicLatinoEthnicity(Boolean value) {
        this.hispanicLatinoEthnicity = value;
    }

    /**
     * Gets the value of the oldEthnicity property.
     * 
     * @return
     *     possible object is
     *     {@link OldEthnicityType }
     *     
     */
    public OldEthnicityType getOldEthnicity() {
        return oldEthnicity;
    }

    /**
     * Sets the value of the oldEthnicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link OldEthnicityType }
     *     
     */
    public void setOldEthnicity(OldEthnicityType value) {
        this.oldEthnicity = value;
    }

    /**
     * Gets the value of the race property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the race property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RaceItemType }
     * 
     * 
     */
    public List<RaceItemType> getRace() {
        if (race == null) {
            race = new ArrayList<RaceItemType>();
        }
        return this.race;
    }

    /**
     * Gets the value of the economicDisadvantaged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEconomicDisadvantaged() {
        return economicDisadvantaged;
    }

    /**
     * Sets the value of the economicDisadvantaged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEconomicDisadvantaged(Boolean value) {
        this.economicDisadvantaged = value;
    }

    /**
     * Gets the value of the schoolFoodServicesEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolFoodServicesEligibilityType }
     *     
     */
    public SchoolFoodServicesEligibilityType getSchoolFoodServicesEligibility() {
        return schoolFoodServicesEligibility;
    }

    /**
     * Sets the value of the schoolFoodServicesEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolFoodServicesEligibilityType }
     *     
     */
    public void setSchoolFoodServicesEligibility(SchoolFoodServicesEligibilityType value) {
        this.schoolFoodServicesEligibility = value;
    }

    /**
     * Gets the value of the studentCharacteristics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studentCharacteristics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudentCharacteristics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudentCharacteristic }
     * 
     * 
     */
    public List<StudentCharacteristic> getStudentCharacteristics() {
        if (studentCharacteristics == null) {
            studentCharacteristics = new ArrayList<StudentCharacteristic>();
        }
        return this.studentCharacteristics;
    }

    /**
     * Gets the value of the limitedEnglishProficiency property.
     * 
     * @return
     *     possible object is
     *     {@link LimitedEnglishProficiencyType }
     *     
     */
    public LimitedEnglishProficiencyType getLimitedEnglishProficiency() {
        return limitedEnglishProficiency;
    }

    /**
     * Sets the value of the limitedEnglishProficiency property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitedEnglishProficiencyType }
     *     
     */
    public void setLimitedEnglishProficiency(LimitedEnglishProficiencyType value) {
        this.limitedEnglishProficiency = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageItemType }
     * 
     * 
     */
    public List<LanguageItemType> getLanguages() {
        if (languages == null) {
            languages = new ArrayList<LanguageItemType>();
        }
        return this.languages;
    }

    /**
     * Gets the value of the homeLanguages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the homeLanguages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHomeLanguages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageItemType }
     * 
     * 
     */
    public List<LanguageItemType> getHomeLanguages() {
        if (homeLanguages == null) {
            homeLanguages = new ArrayList<LanguageItemType>();
        }
        return this.homeLanguages;
    }

    /**
     * Gets the value of the disabilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disabilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisabilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Disability }
     * 
     * 
     */
    public List<Disability> getDisabilities() {
        if (disabilities == null) {
            disabilities = new ArrayList<Disability>();
        }
        return this.disabilities;
    }

    /**
     * Gets the value of the section504Disabilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the section504Disabilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSection504Disabilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Section504DisabilityItemType }
     * 
     * 
     */
    public List<Section504DisabilityItemType> getSection504Disabilities() {
        if (section504Disabilities == null) {
            section504Disabilities = new ArrayList<Section504DisabilityItemType>();
        }
        return this.section504Disabilities;
    }

    /**
     * Gets the value of the specialEducationAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link StudentSpecialEdAttributes }
     *     
     */
    public StudentSpecialEdAttributes getSpecialEducationAttributes() {
        return specialEducationAttributes;
    }

    /**
     * Sets the value of the specialEducationAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentSpecialEdAttributes }
     *     
     */
    public void setSpecialEducationAttributes(StudentSpecialEdAttributes value) {
        this.specialEducationAttributes = value;
    }

    /**
     * Gets the value of the displacementStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplacementStatus() {
        return displacementStatus;
    }

    /**
     * Sets the value of the displacementStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplacementStatus(String value) {
        this.displacementStatus = value;
    }

    /**
     * Gets the value of the learningStyles property.
     * 
     * @return
     *     possible object is
     *     {@link LearningStyles }
     *     
     */
    public LearningStyles getLearningStyles() {
        return learningStyles;
    }

    /**
     * Sets the value of the learningStyles property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningStyles }
     *     
     */
    public void setLearningStyles(LearningStyles value) {
        this.learningStyles = value;
    }

    /**
     * Gets the value of the studentIndicators property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studentIndicators property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudentIndicators().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudentIndicator }
     * 
     * 
     */
    public List<StudentIndicator> getStudentIndicators() {
        if (studentIndicators == null) {
            studentIndicators = new ArrayList<StudentIndicator>();
        }
        return this.studentIndicators;
    }

    /**
     * Gets the value of the assessments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudentAssessment }
     * 
     * 
     */
    public List<StudentAssessment> getAssessments() {
        if (assessments == null) {
            assessments = new ArrayList<StudentAssessment>();
        }
        return this.assessments;
    }

    /**
     * Gets the value of the disciplineIncidents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disciplineIncidents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisciplineIncidents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisciplineIncident }
     * 
     * 
     */
    public List<DisciplineIncident> getDisciplineIncidents() {
        if (disciplineIncidents == null) {
            disciplineIncidents = new ArrayList<DisciplineIncident>();
        }
        return this.disciplineIncidents;
    }

    /**
     * Gets the value of the programs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the programs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrograms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudentProgram }
     * 
     * 
     */
    public List<StudentProgram> getPrograms() {
        if (programs == null) {
            programs = new ArrayList<StudentProgram>();
        }
        return this.programs;
    }

    /**
     * Gets the value of the cohorts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cohorts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCohorts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudentCohort }
     * 
     * 
     */
    public List<StudentCohort> getCohorts() {
        if (cohorts == null) {
            cohorts = new ArrayList<StudentCohort>();
        }
        return this.cohorts;
    }

}
