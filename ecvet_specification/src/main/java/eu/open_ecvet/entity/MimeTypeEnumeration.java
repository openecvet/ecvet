//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.02.03 um 02:03:38 PM CET 
//


package eu.open_ecvet.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für mimeTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="mimeTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="image/jpeg"/&gt;
 *     &lt;enumeration value="image/pjpeg"/&gt;
 *     &lt;enumeration value="image/png"/&gt;
 *     &lt;enumeration value="image/x-png"/&gt;
 *     &lt;enumeration value="application/pdf"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "mimeTypeEnumeration")
@XmlEnum
public enum MimeTypeEnumeration {

    @XmlEnumValue("image/jpeg")
    IMAGE_JPEG("image/jpeg"),
    @XmlEnumValue("image/pjpeg")
    IMAGE_PJPEG("image/pjpeg"),
    @XmlEnumValue("image/png")
    IMAGE_PNG("image/png"),
    @XmlEnumValue("image/x-png")
    IMAGE_X_PNG("image/x-png"),
    @XmlEnumValue("application/pdf")
    APPLICATION_PDF("application/pdf");
    private final String value;

    MimeTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MimeTypeEnumeration fromValue(String v) {
        for (MimeTypeEnumeration c: MimeTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
