//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.01.05 um 05:54:26 PM CET 
//


package eu.open_ecvet.entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				According to: C 155/14 Annex 1 - Definitions (g)
 * 				--- ‘Validation of learning outcomes’ means the process of
 * 				confirming that certain assessed learning outcomes achieved by a
 * 				learner
 * 				correspond to specific
 * 				outcomes which may be required for a
 * 				unit or a qualification
 * 			
 * 
 * <p>Java-Klasse für validationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="validationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}ecvetElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="requirementList" type="{}requirementListType"/&gt;
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
@XmlType(name = "validationType", propOrder = {
    "requirementList",
    "assessmentURI"
})
@Entity
@Table(indexes = {

}, uniqueConstraints = {

}, name = "validation")
public class ValidationType
    extends EcvetElement
    implements Serializable
{

    @XmlElement(required = true)
    @OneToOne(targetEntity = RequirementListType.class, cascade = {
        CascadeType.ALL
    })
    protected RequirementListType requirementList;
    @XmlElement(required = true)
    protected String assessmentURI;

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
