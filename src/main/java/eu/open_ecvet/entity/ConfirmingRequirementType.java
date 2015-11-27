//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.11.27 um 10:26:59 AM CET 
//


package eu.open_ecvet.entity;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				According to: C 155/14 Annex 1 - Definitions (g) --- ... confirming ... which may be required ...
 * 			
 * 
 * <p>Java-Klasse für confirmingRequirementType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="confirmingRequirementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="assessmentURI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="requirementList" type="{}requirementListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "confirmingRequirementType", propOrder = {
    "assessmentURI",
    "requirementList"
})
public class ConfirmingRequirementType
    implements Serializable
{

    @XmlElement(required = true)
    protected String assessmentURI;
    @XmlElement(required = true)
    protected RequirementListType requirementList;

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

    /**
     * Ruft den Wert der requirementList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RequirementListType }
     *     
     */
    public RequirementListType getRequirementList() {
        return requirementList;
    }

    /**
     * Legt den Wert der requirementList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RequirementListType }
     *     
     */
    public void setRequirementList(RequirementListType value) {
        this.requirementList = value;
    }

}
