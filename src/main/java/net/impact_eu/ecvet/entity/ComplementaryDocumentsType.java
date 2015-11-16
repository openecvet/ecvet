//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.11.12 um 05:29:51 PM CET 
//


package net.impact_eu.ecvet.entity;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                     ANNEX II ECVET — PRINCIPLES AND TECHNICAL SPECIFICATIONS -- ECVET tools and methodology comprise the description of qualifi­cations in terms of units of learning outcomes with associated points, a transfer and accumulation process andcomplementary documents such as learning agreements, transcripts of records and ECVET users’ guides. TODO: own type with file attachments
 *                 
 * 
 * <p>Java-Klasse für complementaryDocumentsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="complementaryDocumentsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="learningAgreements" type="{}learningAgreementsType"/&gt;
 *         &lt;element name="transcriptionOfRecords" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userGuide" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complementaryDocumentsType", propOrder = {
    "learningAgreements",
    "transcriptionOfRecords",
    "userGuide"
})
public class ComplementaryDocumentsType
    implements Serializable
{

    @XmlElement(required = true)
    protected LearningAgreementsType learningAgreements;
    @XmlElement(required = true)
    protected String transcriptionOfRecords;
    @XmlElement(required = true)
    protected String userGuide;

    /**
     * Ruft den Wert der learningAgreements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LearningAgreementsType }
     *     
     */
    public LearningAgreementsType getLearningAgreements() {
        return learningAgreements;
    }

    /**
     * Legt den Wert der learningAgreements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningAgreementsType }
     *     
     */
    public void setLearningAgreements(LearningAgreementsType value) {
        this.learningAgreements = value;
    }

    /**
     * Ruft den Wert der transcriptionOfRecords-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranscriptionOfRecords() {
        return transcriptionOfRecords;
    }

    /**
     * Legt den Wert der transcriptionOfRecords-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranscriptionOfRecords(String value) {
        this.transcriptionOfRecords = value;
    }

    /**
     * Ruft den Wert der userGuide-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserGuide() {
        return userGuide;
    }

    /**
     * Legt den Wert der userGuide-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserGuide(String value) {
        this.userGuide = value;
    }

}
