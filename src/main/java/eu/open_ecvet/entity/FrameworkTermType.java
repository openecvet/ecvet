//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.11.27 um 08:10:16 PM CET 
//


package eu.open_ecvet.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für frameworkTermType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="frameworkTermType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="all"/&gt;
 *     &lt;enumeration value="knowledge"/&gt;
 *     &lt;enumeration value="skills"/&gt;
 *     &lt;enumeration value="competences"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "frameworkTermType")
@XmlEnum
public enum FrameworkTermType {

    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("knowledge")
    KNOWLEDGE("knowledge"),
    @XmlEnumValue("skills")
    SKILLS("skills"),
    @XmlEnumValue("competences")
    COMPETENCES("competences");
    private final String value;

    FrameworkTermType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FrameworkTermType fromValue(String v) {
        for (FrameworkTermType c: FrameworkTermType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
