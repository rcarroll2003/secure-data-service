//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.17 at 02:49:01 PM EDT 
//


package org.slc.sli.test.edfi.entitiesR1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This entity is a subelement of a learning
 * 				objective
 * 				consisting of a precise statement of the expectation of a
 * 				student's
 * 				proficiency.
 * 			
 * 
 * <p>Java class for learningStandard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="learningStandard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="learningStandardId" type="{}learningStandardId"/>
 *         &lt;element name="description" type="{}description"/>
 *         &lt;element name="contentStandard" type="{}contentStandardType"/>
 *         &lt;element name="gradeLevel" type="{}gradeLevelType"/>
 *         &lt;element name="subjectArea" type="{}academicSubjectType"/>
 *         &lt;element name="courseTitle" type="{}courseTitle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "learningStandard", propOrder = {
    "learningStandardId",
    "description",
    "contentStandard",
    "gradeLevel",
    "subjectArea",
    "courseTitle"
})
public class LearningStandard {

    @XmlElement(required = true)
    protected LearningStandardId learningStandardId;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected ContentStandardType contentStandard;
    @XmlElement(required = true)
    protected GradeLevelType gradeLevel;
    @XmlElement(required = true)
    protected AcademicSubjectType subjectArea;
    protected String courseTitle;

    /**
     * Gets the value of the learningStandardId property.
     * 
     * @return
     *     possible object is
     *     {@link LearningStandardId }
     *     
     */
    public LearningStandardId getLearningStandardId() {
        return learningStandardId;
    }

    /**
     * Sets the value of the learningStandardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningStandardId }
     *     
     */
    public void setLearningStandardId(LearningStandardId value) {
        this.learningStandardId = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the contentStandard property.
     * 
     * @return
     *     possible object is
     *     {@link ContentStandardType }
     *     
     */
    public ContentStandardType getContentStandard() {
        return contentStandard;
    }

    /**
     * Sets the value of the contentStandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentStandardType }
     *     
     */
    public void setContentStandard(ContentStandardType value) {
        this.contentStandard = value;
    }

    /**
     * Gets the value of the gradeLevel property.
     * 
     * @return
     *     possible object is
     *     {@link GradeLevelType }
     *     
     */
    public GradeLevelType getGradeLevel() {
        return gradeLevel;
    }

    /**
     * Sets the value of the gradeLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link GradeLevelType }
     *     
     */
    public void setGradeLevel(GradeLevelType value) {
        this.gradeLevel = value;
    }

    /**
     * Gets the value of the subjectArea property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicSubjectType }
     *     
     */
    public AcademicSubjectType getSubjectArea() {
        return subjectArea;
    }

    /**
     * Sets the value of the subjectArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicSubjectType }
     *     
     */
    public void setSubjectArea(AcademicSubjectType value) {
        this.subjectArea = value;
    }

    /**
     * Gets the value of the courseTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseTitle() {
        return courseTitle;
    }

    /**
     * Sets the value of the courseTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseTitle(String value) {
        this.courseTitle = value;
    }

}
