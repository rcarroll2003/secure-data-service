//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.05.31 at 09:35:49 AM EDT 
//


package org.slc.sli.test.edfi.entities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This association indicates the school(s) to which a teacher provides instructional services to.
 * 
 * <p>Java class for TeacherSchoolAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TeacherSchoolAssociation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TeacherReference" type="{http://ed-fi.org/0100}StaffReferenceType"/>
 *         &lt;element name="SchoolReference" type="{http://ed-fi.org/0100}EducationalOrgReferenceType" maxOccurs="unbounded"/>
 *         &lt;element name="ProgramAssignment" type="{http://ed-fi.org/0100}ProgramAssignmentType"/>
 *         &lt;element name="InstructionalGradeLevels" type="{http://ed-fi.org/0100}GradeLevelsType"/>
 *         &lt;element name="AcademicSubjects" type="{http://ed-fi.org/0100}AcademicSubjectsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TeacherSchoolAssociation", propOrder = {
    "teacherReference",
    "schoolReference",
    "programAssignment",
    "instructionalGradeLevels",
    "academicSubjects"
})
public class TeacherSchoolAssociation {

    @XmlElement(name = "TeacherReference", required = true)
    protected StaffReferenceType teacherReference;
    @XmlElement(name = "SchoolReference", required = true)
    protected List<EducationalOrgReferenceType> schoolReference;
    @XmlElement(name = "ProgramAssignment", required = true)
    protected ProgramAssignmentType programAssignment;
    @XmlElement(name = "InstructionalGradeLevels", required = true)
    protected GradeLevelsType instructionalGradeLevels;
    @XmlElement(name = "AcademicSubjects", required = true)
    protected AcademicSubjectsType academicSubjects;

    /**
     * Gets the value of the teacherReference property.
     * 
     * @return
     *     possible object is
     *     {@link StaffReferenceType }
     *     
     */
    public StaffReferenceType getTeacherReference() {
        return teacherReference;
    }

    /**
     * Sets the value of the teacherReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaffReferenceType }
     *     
     */
    public void setTeacherReference(StaffReferenceType value) {
        this.teacherReference = value;
    }

    /**
     * Gets the value of the schoolReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schoolReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchoolReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EducationalOrgReferenceType }
     * 
     * 
     */
    public List<EducationalOrgReferenceType> getSchoolReference() {
        if (schoolReference == null) {
            schoolReference = new ArrayList<EducationalOrgReferenceType>();
        }
        return this.schoolReference;
    }

    /**
     * Gets the value of the programAssignment property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramAssignmentType }
     *     
     */
    public ProgramAssignmentType getProgramAssignment() {
        return programAssignment;
    }

    /**
     * Sets the value of the programAssignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramAssignmentType }
     *     
     */
    public void setProgramAssignment(ProgramAssignmentType value) {
        this.programAssignment = value;
    }

    /**
     * Gets the value of the instructionalGradeLevels property.
     * 
     * @return
     *     possible object is
     *     {@link GradeLevelsType }
     *     
     */
    public GradeLevelsType getInstructionalGradeLevels() {
        return instructionalGradeLevels;
    }

    /**
     * Sets the value of the instructionalGradeLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link GradeLevelsType }
     *     
     */
    public void setInstructionalGradeLevels(GradeLevelsType value) {
        this.instructionalGradeLevels = value;
    }

    /**
     * Gets the value of the academicSubjects property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicSubjectsType }
     *     
     */
    public AcademicSubjectsType getAcademicSubjects() {
        return academicSubjects;
    }

    /**
     * Sets the value of the academicSubjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicSubjectsType }
     *     
     */
    public void setAcademicSubjects(AcademicSubjectsType value) {
        this.academicSubjects = value;
    }

}
