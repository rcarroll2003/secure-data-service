//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.05 at 01:12:38 PM EST 
//


package org.slc.sli.sample.entitiesR1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Encapsulates the possible attributes that can be used to lookup the identity of course offerings.
 * 
 * <p>Java class for CourseOfferingIdentityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CourseOfferingIdentityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocalCourseCode" type="{http://ed-fi.org/0100}LocalCourseCode"/>
 *         &lt;element name="CourseCode" type="{http://ed-fi.org/0100}CourseCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Term" type="{http://ed-fi.org/0100}TermType"/>
 *         &lt;element name="SchoolYear" type="{http://ed-fi.org/0100}SchoolYearType"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="StateOrganizationId" type="{http://ed-fi.org/0100}IdentificationCode"/>
 *           &lt;element name="EducationOrgIdentificationCode" type="{http://ed-fi.org/0100}EducationOrgIdentificationCode" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CourseOfferingIdentityType", propOrder = {
    "localCourseCode",
    "courseCode",
    "term",
    "schoolYear",
    "stateOrganizationIdOrEducationOrgIdentificationCode"
})
public class CourseOfferingIdentityType {

    @XmlElement(name = "LocalCourseCode", required = true)
    protected String localCourseCode;
    @XmlElement(name = "CourseCode")
    protected List<CourseCode> courseCode;
    @XmlElement(name = "Term", required = true)
    protected TermType term;
    @XmlElement(name = "SchoolYear", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolYear;
    @XmlElements({
        @XmlElement(name = "StateOrganizationId", type = String.class),
        @XmlElement(name = "EducationOrgIdentificationCode", type = EducationOrgIdentificationCode.class)
    })
    protected List<Object> stateOrganizationIdOrEducationOrgIdentificationCode;

    /**
     * Gets the value of the localCourseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalCourseCode() {
        return localCourseCode;
    }

    /**
     * Sets the value of the localCourseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalCourseCode(String value) {
        this.localCourseCode = value;
    }

    /**
     * Gets the value of the courseCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the courseCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCourseCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CourseCode }
     * 
     * 
     */
    public List<CourseCode> getCourseCode() {
        if (courseCode == null) {
            courseCode = new ArrayList<CourseCode>();
        }
        return this.courseCode;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link TermType }
     *     
     */
    public TermType getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermType }
     *     
     */
    public void setTerm(TermType value) {
        this.term = value;
    }

    /**
     * Gets the value of the schoolYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolYear() {
        return schoolYear;
    }

    /**
     * Sets the value of the schoolYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolYear(String value) {
        this.schoolYear = value;
    }

    /**
     * Gets the value of the stateOrganizationIdOrEducationOrgIdentificationCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stateOrganizationIdOrEducationOrgIdentificationCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStateOrganizationIdOrEducationOrgIdentificationCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link EducationOrgIdentificationCode }
     * 
     * 
     */
    public List<Object> getStateOrganizationIdOrEducationOrgIdentificationCode() {
        if (stateOrganizationIdOrEducationOrgIdentificationCode == null) {
            stateOrganizationIdOrEducationOrgIdentificationCode = new ArrayList<Object>();
        }
        return this.stateOrganizationIdOrEducationOrgIdentificationCode;
    }

}
