//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.12.02 um 10:59:58 AM CET 
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
 * 
 * 				According to: C 155/14 Annex 1 - Definitions (b) -- a single learning outcome represents the statement, which is described in the defintion
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
 *         &lt;element name="credit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="learningOutcomeTermList" type="{}learningOutcomeTermListType"/&gt;
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
    "credit",
    "learningOutcomeTermList"
})
@Entity
@Table(indexes = {

}, uniqueConstraints = {

}, name = "learningoutcome")
public class LearningOutcomeType
    extends EcvetElement
    implements Serializable
{

    protected int credit;
    @XmlElement(required = true)
    @OneToOne(targetEntity = LearningOutcomeTermListType.class, cascade = {

    })
    protected LearningOutcomeTermListType learningOutcomeTermList;

    /**
     * Ruft den Wert der credit-Eigenschaft ab.
     * 
     */
    public int getCredit() {
        return credit;
    }

    /**
     * Legt den Wert der credit-Eigenschaft fest.
     * 
     */
    public void setCredit(int value) {
        this.credit = value;
    }

    /**
     * Ruft den Wert der learningOutcomeTermList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LearningOutcomeTermListType }
     *     
     */
    public LearningOutcomeTermListType getLearningOutcomeTermList() {
        return learningOutcomeTermList;
    }

    /**
     * Legt den Wert der learningOutcomeTermList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningOutcomeTermListType }
     *     
     */
    public void setLearningOutcomeTermList(LearningOutcomeTermListType value) {
        this.learningOutcomeTermList = value;
    }

}
