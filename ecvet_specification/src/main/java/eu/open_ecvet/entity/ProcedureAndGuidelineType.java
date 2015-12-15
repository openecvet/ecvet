//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.12.15 um 05:07:17 PM CET 
//


package eu.open_ecvet.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für procedureAndGuidelineType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="procedureAndGuidelineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}ecvetElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="assessment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="validation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="recognition" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "procedureAndGuidelineType", propOrder = {
    "assessment",
    "validation",
    "recognition"
})
@Entity
@Table(indexes = {

}, uniqueConstraints = {

}, name = "procedureAndGuideline")
public class ProcedureAndGuidelineType
    extends EcvetElement
    implements Serializable
{

    @XmlElement(required = true)
    protected String assessment;
    @XmlElement(required = true)
    protected String validation;
    @XmlElement(required = true)
    protected String recognition;

    /**
     * Ruft den Wert der assessment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessment() {
        return assessment;
    }

    /**
     * Legt den Wert der assessment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessment(String value) {
        this.assessment = value;
    }

    /**
     * Ruft den Wert der validation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidation() {
        return validation;
    }

    /**
     * Legt den Wert der validation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidation(String value) {
        this.validation = value;
    }

    /**
     * Ruft den Wert der recognition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecognition() {
        return recognition;
    }

    /**
     * Legt den Wert der recognition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecognition(String value) {
        this.recognition = value;
    }

}
