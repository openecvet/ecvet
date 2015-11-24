//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.11.24 um 08:34:47 PM CET 
//


package eu.open_ecvet.entity;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                     According to: C 155/14 Annex 1 - Definitions (e) -- ‘Competent institution’ means an institution which is responsible for designing and awarding qualifications or recognising units or other functions linked to ECVET, such as allocation of ECVET points to qualifications and units, assessment, validation and recognition of learning outcomes, under the rules and practices of participating countries
 *                 
 * 
 * <p>Java-Klasse für competentInstitutionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="competentInstitutionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="partners" type="{}partnersType"/&gt;
 *         &lt;element name="legislation" type="{}legislationType"/&gt;
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
@XmlType(name = "competentInstitutionType", propOrder = {
    "title",
    "partners",
    "legislation"
})
public class CompetentInstitutionType
    implements Serializable
{

    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected PartnersType partners;
    @XmlElement(required = true)
    protected LegislationType legislation;
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
     * Ruft den Wert der partners-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PartnersType }
     *     
     */
    public PartnersType getPartners() {
        return partners;
    }

    /**
     * Legt den Wert der partners-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnersType }
     *     
     */
    public void setPartners(PartnersType value) {
        this.partners = value;
    }

    /**
     * Ruft den Wert der legislation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LegislationType }
     *     
     */
    public LegislationType getLegislation() {
        return legislation;
    }

    /**
     * Legt den Wert der legislation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LegislationType }
     *     
     */
    public void setLegislation(LegislationType value) {
        this.legislation = value;
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
