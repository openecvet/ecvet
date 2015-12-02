//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.12.02 um 04:40:14 PM CET 
//


package eu.open_ecvet.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *     &lt;extension base="{}ecvetElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="competentInstitutionURI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="certificateTemplate" type="{}certificateTemplateType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recognitionType", propOrder = {
    "competentInstitutionURI",
    "certificateTemplate"
})
@Entity
@Table(indexes = {

}, uniqueConstraints = {

}, name = "recognition")
public class RecognitionType
    extends EcvetElement
    implements Serializable
{

    @XmlElement(required = true)
    protected String competentInstitutionURI;
    @XmlElement(required = true)
    @OneToOne(targetEntity = CertificateTemplateType.class, cascade = {

    })
    protected CertificateTemplateType certificateTemplate;

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
     *     {@link CertificateTemplateType }
     *     
     */
    public CertificateTemplateType getCertificateTemplate() {
        return certificateTemplate;
    }

    /**
     * Legt den Wert der certificateTemplate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateTemplateType }
     *     
     */
    public void setCertificateTemplate(CertificateTemplateType value) {
        this.certificateTemplate = value;
    }

}
