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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                     ANNEX II ECVET — PRINCIPLES AND TECHNICAL SPECIFICATIONS -- ECVET tools and methodology comprise the description of qualifi­cations in terms of units of learning outcomes with associated points, a transfer and accumulation process andcomplementary documents such as learning agreements, transcripts of records and ECVET users’ guides. TODO: own type with file attachments
 *                 
 * 
 * <p>Java-Klasse für complementaryDocumentListType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="complementaryDocumentListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="learningAgreementList" type="{}learningAgreementListType"/&gt;
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
@XmlType(name = "complementaryDocumentListType", propOrder = {
    "learningAgreementList",
    "transcriptionOfRecords",
    "userGuide"
})
public class ComplementaryDocumentListType
    implements Serializable
{

    @XmlElement(required = true)
    protected LearningAgreementListType learningAgreementList;
    @XmlElement(required = true)
    protected String transcriptionOfRecords;
    @XmlElement(required = true)
    protected String userGuide;

    /**
     * Ruft den Wert der learningAgreementList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LearningAgreementListType }
     *     
     */
    public LearningAgreementListType getLearningAgreementList() {
        return learningAgreementList;
    }

    /**
     * Legt den Wert der learningAgreementList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningAgreementListType }
     *     
     */
    public void setLearningAgreementList(LearningAgreementListType value) {
        this.learningAgreementList = value;
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
