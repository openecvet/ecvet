//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.11.24 um 08:34:47 PM CET 
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
 *                     According to: C 155/14 Annex 1 - Definitions (c) -- ‘Unit of learning outcomes’ (unit) means a component of a qualification, consisting of a coherent set of knowledge, skills and competence, that can be assessed and validated. Possibly ambiguous -> the child element which follow here is a set of learningOutcomes (which represent the KSC terms)
 *                 
 * 
 * <p>Java-Klasse für unitType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="unitType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}evcetElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="credit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="weightSum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="relativeWeight" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="learningOutcomes" type="{}learningOutcomeListType"/&gt;
 *         &lt;element name="referenceLevelList" type="{}referenceLevelListType"/&gt;
 *         &lt;element name="achievement" type="{}achievementType"/&gt;
 *         &lt;element name="unitList" type="{}unitListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unitType", propOrder = {
    "credit",
    "weightSum",
    "relativeWeight",
    "learningOutcomes",
    "referenceLevelList",
    "achievement",
    "unitList"
})
@Entity
@Table(indexes = {

}, uniqueConstraints = {

}, name = "unit")
public class UnitType
    extends EvcetElement
    implements Serializable
{

    protected int credit;
    protected int weightSum;
    protected int relativeWeight;
    @XmlElement(required = true)
    @OneToOne(targetEntity = LearningOutcomeListType.class, cascade = {

    })
    protected LearningOutcomeListType learningOutcomes;
    @XmlElement(required = true)
    @OneToOne(targetEntity = ReferenceLevelListType.class, cascade = {

    })
    protected ReferenceLevelListType referenceLevelList;
    @XmlElement(required = true)
    protected AchievementType achievement;
    @OneToOne(targetEntity = UnitListType.class, cascade = {

    })
    protected UnitListType unitList;

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
     * Ruft den Wert der weightSum-Eigenschaft ab.
     * 
     */
    public int getWeightSum() {
        return weightSum;
    }

    /**
     * Legt den Wert der weightSum-Eigenschaft fest.
     * 
     */
    public void setWeightSum(int value) {
        this.weightSum = value;
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
     * Ruft den Wert der learningOutcomes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LearningOutcomeListType }
     *     
     */
    public LearningOutcomeListType getLearningOutcomes() {
        return learningOutcomes;
    }

    /**
     * Legt den Wert der learningOutcomes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningOutcomeListType }
     *     
     */
    public void setLearningOutcomes(LearningOutcomeListType value) {
        this.learningOutcomes = value;
    }

    /**
     * Ruft den Wert der referenceLevelList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceLevelListType }
     *     
     */
    public ReferenceLevelListType getReferenceLevelList() {
        return referenceLevelList;
    }

    /**
     * Legt den Wert der referenceLevelList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceLevelListType }
     *     
     */
    public void setReferenceLevelList(ReferenceLevelListType value) {
        this.referenceLevelList = value;
    }

    /**
     * Ruft den Wert der achievement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AchievementType }
     *     
     */
    public AchievementType getAchievement() {
        return achievement;
    }

    /**
     * Legt den Wert der achievement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AchievementType }
     *     
     */
    public void setAchievement(AchievementType value) {
        this.achievement = value;
    }

    /**
     * Ruft den Wert der unitList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UnitListType }
     *     
     */
    public UnitListType getUnitList() {
        return unitList;
    }

    /**
     * Legt den Wert der unitList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitListType }
     *     
     */
    public void setUnitList(UnitListType value) {
        this.unitList = value;
    }

}
