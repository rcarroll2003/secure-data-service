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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * GradebookEntry
 * 				This entity represents a teacherís assignment, homework, or classroom assessment to be recorded in a gradebook.
 * 				This is similar to a studentGradebookEntry, but this entity represents the assessment/evaluation, not the grade a student received.
 * 				Limitations: None
 * 			
 * 
 * <p>Java class for gradebookEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gradebookEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gradebookEntryType" type="{http://slc-sli/ed-org/0.1}gradebookEntryType"/>
 *         &lt;element name="dateAssigned" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="description" type="{http://slc-sli/ed-org/0.1}description" minOccurs="0"/>
 *         &lt;element name="studentGradebookEntries" type="{http://slc-sli/ed-org/0.1}studentGradebookEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gradebookEntry", propOrder = {
    "gradebookEntryType",
    "dateAssigned",
    "description",
    "studentGradebookEntries"
})
public class GradebookEntry {

    @XmlElement(required = true)
    protected String gradebookEntryType;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected String dateAssigned;
    protected String description;
    protected List<StudentGradebookEntry> studentGradebookEntries;

    /**
     * Gets the value of the gradebookEntryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGradebookEntryType() {
        return gradebookEntryType;
    }

    /**
     * Sets the value of the gradebookEntryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGradebookEntryType(String value) {
        this.gradebookEntryType = value;
    }

    /**
     * Gets the value of the dateAssigned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateAssigned() {
        return dateAssigned;
    }

    /**
     * Sets the value of the dateAssigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateAssigned(String value) {
        this.dateAssigned = value;
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
     * Gets the value of the studentGradebookEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studentGradebookEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudentGradebookEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudentGradebookEntry }
     * 
     * 
     */
    public List<StudentGradebookEntry> getStudentGradebookEntries() {
        if (studentGradebookEntries == null) {
            studentGradebookEntries = new ArrayList<StudentGradebookEntry>();
        }
        return this.studentGradebookEntries;
    }

}
