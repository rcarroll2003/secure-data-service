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
 * 
 * 				This entity represents any program designed to work
 * 				in conjunction with or to supplement the main
 * 				academic program.
 * 				Programs may provide instruction, training, services or benefits
 * 				through federal,
 * 				state, or local agencies. Programs may also include
 * 				organized extracurricular activities for students.
 * 			
 * 
 * <p>Java class for program complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="program">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="programId" type="{http://slc-sli/ed-org/0.1}programId" minOccurs="0"/>
 *         &lt;element name="programType" type="{http://slc-sli/ed-org/0.1}programType"/>
 *         &lt;element name="programSponsor" type="{http://slc-sli/ed-org/0.1}programSponsorType" minOccurs="0"/>
 *         &lt;element name="services" type="{http://slc-sli/ed-org/0.1}serviceDescriptorReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="staffAssociations" type="{http://slc-sli/ed-org/0.1}staffProgramAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "program", propOrder = {
    "programId",
    "programType",
    "programSponsor",
    "services",
    "staffAssociations"
})
public class Program {

    protected String programId;
    @XmlElement(required = true)
    protected ProgramType programType;
    protected ProgramSponsorType programSponsor;
    protected List<ServiceDescriptorReferenceType> services;
    protected List<StaffProgramAssociation> staffAssociations;

    /**
     * Gets the value of the programId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramId() {
        return programId;
    }

    /**
     * Sets the value of the programId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramId(String value) {
        this.programId = value;
    }

    /**
     * Gets the value of the programType property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramType }
     *     
     */
    public ProgramType getProgramType() {
        return programType;
    }

    /**
     * Sets the value of the programType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramType }
     *     
     */
    public void setProgramType(ProgramType value) {
        this.programType = value;
    }

    /**
     * Gets the value of the programSponsor property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramSponsorType }
     *     
     */
    public ProgramSponsorType getProgramSponsor() {
        return programSponsor;
    }

    /**
     * Sets the value of the programSponsor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramSponsorType }
     *     
     */
    public void setProgramSponsor(ProgramSponsorType value) {
        this.programSponsor = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the services property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceDescriptorReferenceType }
     * 
     * 
     */
    public List<ServiceDescriptorReferenceType> getServices() {
        if (services == null) {
            services = new ArrayList<ServiceDescriptorReferenceType>();
        }
        return this.services;
    }

    /**
     * Gets the value of the staffAssociations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the staffAssociations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStaffAssociations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StaffProgramAssociation }
     * 
     * 
     */
    public List<StaffProgramAssociation> getStaffAssociations() {
        if (staffAssociations == null) {
            staffAssociations = new ArrayList<StaffProgramAssociation>();
        }
        return this.staffAssociations;
    }

}
