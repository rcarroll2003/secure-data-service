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
import javax.xml.bind.annotation.XmlType;


/**
 * This educational entity represents the collection
 *                 of student grades for courses taken during a grading period.
 *             
 * 
 * <p>Java class for reportCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reportCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="grades" type="{http://slc-sli/ed-org/0.1}grade" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="studentCompetency" type="{http://slc-sli/ed-org/0.1}studentCompetency" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="gpaGivenGradingPeriod" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="gpaCumulative" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="numberOfDaysAbsent" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numberOfDaysInAttendance" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numberOfDaysTardy" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="gradingPeriod" type="{http://slc-sli/ed-org/0.1}gradingPeriod" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reportCard", propOrder = {
    "grades",
    "studentCompetency",
    "gpaGivenGradingPeriod",
    "gpaCumulative",
    "numberOfDaysAbsent",
    "numberOfDaysInAttendance",
    "numberOfDaysTardy",
    "gradingPeriod"
})
public class ReportCard {

    protected List<Grade> grades;
    protected List<StudentCompetency> studentCompetency;
    protected double gpaGivenGradingPeriod;
    protected double gpaCumulative;
    protected Integer numberOfDaysAbsent;
    protected Integer numberOfDaysInAttendance;
    protected Integer numberOfDaysTardy;
    protected GradingPeriod gradingPeriod;

    /**
     * Gets the value of the grades property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grades property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrades().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Grade }
     * 
     * 
     */
    public List<Grade> getGrades() {
        if (grades == null) {
            grades = new ArrayList<Grade>();
        }
        return this.grades;
    }

    /**
     * Gets the value of the studentCompetency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studentCompetency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudentCompetency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudentCompetency }
     * 
     * 
     */
    public List<StudentCompetency> getStudentCompetency() {
        if (studentCompetency == null) {
            studentCompetency = new ArrayList<StudentCompetency>();
        }
        return this.studentCompetency;
    }

    /**
     * Gets the value of the gpaGivenGradingPeriod property.
     * 
     */
    public double getGpaGivenGradingPeriod() {
        return gpaGivenGradingPeriod;
    }

    /**
     * Sets the value of the gpaGivenGradingPeriod property.
     * 
     */
    public void setGpaGivenGradingPeriod(double value) {
        this.gpaGivenGradingPeriod = value;
    }

    /**
     * Gets the value of the gpaCumulative property.
     * 
     */
    public double getGpaCumulative() {
        return gpaCumulative;
    }

    /**
     * Sets the value of the gpaCumulative property.
     * 
     */
    public void setGpaCumulative(double value) {
        this.gpaCumulative = value;
    }

    /**
     * Gets the value of the numberOfDaysAbsent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfDaysAbsent() {
        return numberOfDaysAbsent;
    }

    /**
     * Sets the value of the numberOfDaysAbsent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfDaysAbsent(Integer value) {
        this.numberOfDaysAbsent = value;
    }

    /**
     * Gets the value of the numberOfDaysInAttendance property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfDaysInAttendance() {
        return numberOfDaysInAttendance;
    }

    /**
     * Sets the value of the numberOfDaysInAttendance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfDaysInAttendance(Integer value) {
        this.numberOfDaysInAttendance = value;
    }

    /**
     * Gets the value of the numberOfDaysTardy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfDaysTardy() {
        return numberOfDaysTardy;
    }

    /**
     * Sets the value of the numberOfDaysTardy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfDaysTardy(Integer value) {
        this.numberOfDaysTardy = value;
    }

    /**
     * Gets the value of the gradingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link GradingPeriod }
     *     
     */
    public GradingPeriod getGradingPeriod() {
        return gradingPeriod;
    }

    /**
     * Sets the value of the gradingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link GradingPeriod }
     *     
     */
    public void setGradingPeriod(GradingPeriod value) {
        this.gradingPeriod = value;
    }

}
