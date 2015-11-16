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
 * <p>Java-Klasse für achievementType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="achievementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="assessments" type="{}assessmentsType"/&gt;
 *         &lt;element name="validations" type="{}validationsType"/&gt;
 *         &lt;element name="recognitions" type="{}recognitionsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "achievementType", propOrder = {
    "assessments",
    "validations",
    "recognitions"
})
public class AchievementType
    implements Serializable
{

    @XmlElement(required = true)
    protected AssessmentsType assessments;
    @XmlElement(required = true)
    protected ValidationsType validations;
    @XmlElement(required = true)
    protected RecognitionsType recognitions;

    /**
     * Ruft den Wert der assessments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentsType }
     *     
     */
    public AssessmentsType getAssessments() {
        return assessments;
    }

    /**
     * Legt den Wert der assessments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentsType }
     *     
     */
    public void setAssessments(AssessmentsType value) {
        this.assessments = value;
    }

    /**
     * Ruft den Wert der validations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValidationsType }
     *     
     */
    public ValidationsType getValidations() {
        return validations;
    }

    /**
     * Legt den Wert der validations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationsType }
     *     
     */
    public void setValidations(ValidationsType value) {
        this.validations = value;
    }

    /**
     * Ruft den Wert der recognitions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RecognitionsType }
     *     
     */
    public RecognitionsType getRecognitions() {
        return recognitions;
    }

    /**
     * Legt den Wert der recognitions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RecognitionsType }
     *     
     */
    public void setRecognitions(RecognitionsType value) {
        this.recognitions = value;
    }

}
