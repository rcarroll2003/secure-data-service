//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.31 at 10:43:34 AM EDT 
//


package org.slc.sli.test.edfi.entitiesR1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The total credits required in subject to graduate.
 * 				Only those courses
 * 				identified as a high school course requirement are
 * 				eligible to meet subject
 * 				credit
 * 				requirements.
 * 			
 * 
 * <p>Java class for creditsBySubject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creditsBySubject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subjectArea" type="{http://slc-sli/ed-org/0.1}descriptorReferenceType"/>
 *         &lt;element name="credits" type="{http://slc-sli/ed-org/0.1}credits"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creditsBySubject", propOrder = {
    "subjectArea",
    "credits"
})
public class CreditsBySubject {

    @XmlElement(required = true)
    protected DescriptorReferenceType subjectArea;
    @XmlElement(required = true)
    protected Credits credits;

    /**
     * Gets the value of the subjectArea property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptorReferenceType }
     *     
     */
    public DescriptorReferenceType getSubjectArea() {
        return subjectArea;
    }

    /**
     * Sets the value of the subjectArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptorReferenceType }
     *     
     */
    public void setSubjectArea(DescriptorReferenceType value) {
        this.subjectArea = value;
    }

    /**
     * Gets the value of the credits property.
     * 
     * @return
     *     possible object is
     *     {@link Credits }
     *     
     */
    public Credits getCredits() {
        return credits;
    }

    /**
     * Sets the value of the credits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Credits }
     *     
     */
    public void setCredits(Credits value) {
        this.credits = value;
    }

}
