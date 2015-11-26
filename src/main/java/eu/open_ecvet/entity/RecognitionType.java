//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.11.26 um 05:01:19 PM CET 
//


package eu.open_ecvet.entity;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für recognitionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="recognitionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="competentInstitutionURI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="certificateTemplate" type="{}fileDataType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recognitionType", propOrder = {
    "title",
    "competentInstitutionURI",
    "certificateTemplate"
})
public class RecognitionType
    implements Serializable
{

    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String competentInstitutionURI;
    @XmlElement(required = true)
    protected FileDataType certificateTemplate;
    @XmlAttribute(name = "URI")
    protected String uri;

    /**
     * Ruft den Wert der title-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Legt den Wert der title-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Ruft den Wert der competentInstitutionURI-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompetentInstitutionURI() {
        return competentInstitutionURI;
    }

    /**
     * Legt den Wert der competentInstitutionURI-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompetentInstitutionURI(String value) {
        this.competentInstitutionURI = value;
    }

    /**
     * Ruft den Wert der certificateTemplate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FileDataType }
     *     
     */
    public FileDataType getCertificateTemplate() {
        return certificateTemplate;
    }

    /**
     * Legt den Wert der certificateTemplate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FileDataType }
     *     
     */
    public void setCertificateTemplate(FileDataType value) {
        this.certificateTemplate = value;
    }

    /**
     * Ruft den Wert der uri-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURI() {
        return uri;
    }

    /**
     * Legt den Wert der uri-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURI(String value) {
        this.uri = value;
    }

}
