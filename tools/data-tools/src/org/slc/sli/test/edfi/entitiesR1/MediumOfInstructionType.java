//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.17 at 02:49:01 PM EDT 
//


package org.slc.sli.test.edfi.entitiesR1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mediumOfInstructionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="mediumOfInstructionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Televised"/>
 *     &lt;enumeration value="Telepresence/video conference"/>
 *     &lt;enumeration value="Videotaped/prerecorded video"/>
 *     &lt;enumeration value="Other technology-based instruction"/>
 *     &lt;enumeration value="Technology-based instruction in classroom"/>
 *     &lt;enumeration value="Correspondence instruction"/>
 *     &lt;enumeration value="Face-to-face instruction"/>
 *     &lt;enumeration value="Virtual/On-line Distance learning"/>
 *     &lt;enumeration value="Center-based instruction"/>
 *     &lt;enumeration value="Independent study"/>
 *     &lt;enumeration value="Internship"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "mediumOfInstructionType")
@XmlEnum
public enum MediumOfInstructionType {

    @XmlEnumValue("Televised")
    TELEVISED("Televised"),
    @XmlEnumValue("Telepresence/video conference")
    TELEPRESENCE_VIDEO_CONFERENCE("Telepresence/video conference"),
    @XmlEnumValue("Videotaped/prerecorded video")
    VIDEOTAPED_PRERECORDED_VIDEO("Videotaped/prerecorded video"),
    @XmlEnumValue("Other technology-based instruction")
    OTHER_TECHNOLOGY_BASED_INSTRUCTION("Other technology-based instruction"),
    @XmlEnumValue("Technology-based instruction in classroom")
    TECHNOLOGY_BASED_INSTRUCTION_IN_CLASSROOM("Technology-based instruction in classroom"),
    @XmlEnumValue("Correspondence instruction")
    CORRESPONDENCE_INSTRUCTION("Correspondence instruction"),
    @XmlEnumValue("Face-to-face instruction")
    FACE_TO_FACE_INSTRUCTION("Face-to-face instruction"),
    @XmlEnumValue("Virtual/On-line Distance learning")
    VIRTUAL_ON_LINE_DISTANCE_LEARNING("Virtual/On-line Distance learning"),
    @XmlEnumValue("Center-based instruction")
    CENTER_BASED_INSTRUCTION("Center-based instruction"),
    @XmlEnumValue("Independent study")
    INDEPENDENT_STUDY("Independent study"),
    @XmlEnumValue("Internship")
    INTERNSHIP("Internship"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    MediumOfInstructionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MediumOfInstructionType fromValue(String v) {
        for (MediumOfInstructionType c: MediumOfInstructionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
