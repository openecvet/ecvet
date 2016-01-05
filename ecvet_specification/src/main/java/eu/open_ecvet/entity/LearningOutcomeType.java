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
 * 				According to: C 155/14 Annex 1 - Definitions (b)
 * 				-- a single learning outcome represents the statement, which is
 * 				described in the defintion
 * 			
 * 
 * <p>Java-Klasse für learningOutcomeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="learningOutcomeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}ecvetElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ecvetPoints" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="relativeWeight" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="qualificationFrameworkList" type="{}qualificationFrameworkListType"/&gt;
 *         &lt;element name="evaluations" type="{}evaluationsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "learningOutcomeType", propOrder = {
    "ecvetPoints",
    "relativeWeight",
    "qualificationFrameworkList",
    "evaluations"
})
@Entity
@Table(indexes = {

}, uniqueConstraints = {

}, name = "learningoutcome")
public class LearningOutcomeType
    extends EcvetElement
    implements Serializable
{

    protected int ecvetPoints;
    protected int relativeWeight;
    @XmlElement(required = true)
    @OneToOne(targetEntity = QualificationFrameworkListType.class, cascade = {
        CascadeType.ALL
    })
    protected QualificationFrameworkListType qualificationFrameworkList;
    @XmlElement(required = true)
    @OneToOne(targetEntity = EvaluationsType.class, cascade = {
        CascadeType.ALL
    })
    protected EvaluationsType evaluations;

    /**
     * Ruft den Wert der ecvetPoints-Eigenschaft ab.
     * 
     */
    public int getEcvetPoints() {
        return ecvetPoints;
    }

    /**
     * Legt den Wert der ecvetPoints-Eigenschaft fest.
     * 
     */
    public void setEcvetPoints(int value) {
        this.ecvetPoints = value;
    }

    /**
     * Ruft den Wert der relativeWeight-Eigenschaft ab.
     * 
     */
    public int getRelativeWeight() {
        return relativeWeight;
    }

    /**
     * Legt den Wert der relativeWeight-Eigenschaft fest.
     * 
     */
    public void setRelativeWeight(int value) {
        this.relativeWeight = value;
    }

    /**
     * Ruft den Wert der qualificationFrameworkList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QualificationFrameworkListType }
     *     
     */
    public QualificationFrameworkListType getQualificationFrameworkList() {
        return qualificationFrameworkList;
    }

    /**
     * Legt den Wert der qualificationFrameworkList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QualificationFrameworkListType }
     *     
     */
    public void setQualificationFrameworkList(QualificationFrameworkListType value) {
        this.qualificationFrameworkList = value;
    }

    /**
     * Ruft den Wert der evaluations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EvaluationsType }
     *     
     */
    public EvaluationsType getEvaluations() {
        return evaluations;
    }

    /**
     * Legt den Wert der evaluations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EvaluationsType }
     *     
     */
    public void setEvaluations(EvaluationsType value) {
        this.evaluations = value;
    }

}
