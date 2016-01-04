//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.12.17 um 02:48:56 PM CET 
//


package eu.open_ecvet.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für attachmentType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="attachmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}ecvetElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attachmentUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idrefToken" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="idref" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attachmentType", propOrder = {
    "attachmentUrl",
    "idrefToken"
})
@Entity
@Table(indexes = {

}, uniqueConstraints = {

}, name = "attachment")
public class AttachmentType
    extends EcvetElement
    implements Serializable
{

    @XmlElement(required = true)
    protected String attachmentUrl;
    @XmlElement(required = true)
    protected String idrefToken;
    @XmlAttribute(name = "idref", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    @Transient
    protected Object idref;

    /**
     * Ruft den Wert der attachmentUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentUrl() {
        return attachmentUrl;
    }

    /**
     * Legt den Wert der attachmentUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentUrl(String value) {
        this.attachmentUrl = value;
    }

    /**
     * Ruft den Wert der idrefToken-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdrefToken() {
        return idrefToken;
    }

    /**
     * Legt den Wert der idrefToken-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdrefToken(String value) {
        this.idrefToken = value;
    }

    /**
     * Ruft den Wert der idref-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIdref() {
        return idref;
    }

    /**
     * Legt den Wert der idref-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIdref(Object value) {
        this.idref = value;
    }

}
