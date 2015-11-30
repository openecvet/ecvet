//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.11.30 um 04:09:30 PM CET 
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
 * <p>Java-Klasse für evaluationsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="evaluationsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}ecvetElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="assessmentList" type="{}assessmentListType"/&gt;
 *         &lt;element name="validationList" type="{}validationListType"/&gt;
 *         &lt;element name="recognitionList" type="{}recognitionListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "evaluationsType", propOrder = {
    "assessmentList",
    "validationList",
    "recognitionList"
})
@Entity
@Table(indexes = {

}, uniqueConstraints = {

}, name = "evaluations")
public class EvaluationsType
    extends EcvetElement
    implements Serializable
{

    @XmlElement(required = true)
    @OneToOne(targetEntity = AssessmentListType.class, cascade = {

    })
    protected AssessmentListType assessmentList;
    @XmlElement(required = true)
    @OneToOne(targetEntity = ValidationListType.class, cascade = {

    })
    protected ValidationListType validationList;
    @XmlElement(required = true)
    @OneToOne(targetEntity = RecognitionListType.class, cascade = {

    })
    protected RecognitionListType recognitionList;

    /**
     * Ruft den Wert der assessmentList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentListType }
     *     
     */
    public AssessmentListType getAssessmentList() {
        return assessmentList;
    }

    /**
     * Legt den Wert der assessmentList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentListType }
     *     
     */
    public void setAssessmentList(AssessmentListType value) {
        this.assessmentList = value;
    }

    /**
     * Ruft den Wert der validationList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValidationListType }
     *     
     */
    public ValidationListType getValidationList() {
        return validationList;
    }

    /**
     * Legt den Wert der validationList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationListType }
     *     
     */
    public void setValidationList(ValidationListType value) {
        this.validationList = value;
    }

    /**
     * Ruft den Wert der recognitionList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RecognitionListType }
     *     
     */
    public RecognitionListType getRecognitionList() {
        return recognitionList;
    }

    /**
     * Legt den Wert der recognitionList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RecognitionListType }
     *     
     */
    public void setRecognitionList(RecognitionListType value) {
        this.recognitionList = value;
    }

}
