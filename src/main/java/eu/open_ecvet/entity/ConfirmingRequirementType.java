//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.12.03 um 01:35:30 PM CET 
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
 * <p>Java-Klasse für confirmingRequirementType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="confirmingRequirementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}ecvetElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="threshold" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="assessmentURI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "confirmingRequirementType", propOrder = {
    "threshold",
    "assessmentURI"
})
@Entity
@Table(indexes = {

}, uniqueConstraints = {

}, name = "confirmingrequirement")
public class ConfirmingRequirementType
    extends EcvetElement
    implements Serializable
{

    @XmlElement(required = true)
    protected String threshold;
    @XmlElement(required = true)
    protected String assessmentURI;

    /**
     * Ruft den Wert der threshold-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreshold() {
        return threshold;
    }

    /**
     * Legt den Wert der threshold-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreshold(String value) {
        this.threshold = value;
    }

    /**
     * Ruft den Wert der assessmentURI-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentURI() {
        return assessmentURI;
    }

    /**
     * Legt den Wert der assessmentURI-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentURI(String value) {
        this.assessmentURI = value;
    }

}
