//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.06 at 10:00:50 AM EST 
//


package org.slc.sli.test.edfi.entities;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Additional credits or units of value awarded for the completion of a course (e.g., AP, IB, Dual credits)
 * 
 * <p>Java class for AdditionalCredits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalCredits">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Credit">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="AdditionalCreditType" use="required" type="{http://ed-fi.org/0100}AdditionalCreditType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalCredits", propOrder = {
    "credit"
})
public class AdditionalCredits {

    @XmlElement(name = "Credit", required = true)
    protected BigDecimal credit;
    @XmlAttribute(name = "AdditionalCreditType", required = true)
    protected AdditionalCreditType additionalCreditType;

    /**
     * Gets the value of the credit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCredit() {
        return credit;
    }

    /**
     * Sets the value of the credit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCredit(BigDecimal value) {
        this.credit = value;
    }

    /**
     * Gets the value of the additionalCreditType property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalCreditType }
     *     
     */
    public AdditionalCreditType getAdditionalCreditType() {
        return additionalCreditType;
    }

    /**
     * Sets the value of the additionalCreditType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalCreditType }
     *     
     */
    public void setAdditionalCreditType(AdditionalCreditType value) {
        this.additionalCreditType = value;
    }

}
