//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.11.12 um 05:29:51 PM CET 
//


package net.impact_eu.ecvet.entity;

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
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="credit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="weightSum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="relativeWeight" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="learningOutcomes" type="{}learningOutcomesType"/&gt;
 *         &lt;element name="referenceLevels" type="{}referenceLevelsType"/&gt;
 *         &lt;element name="achievement" type="{}achievementType"/&gt;
 *         &lt;element name="units" type="{}unitsType" minOccurs="0"/&gt;
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
    "description",
    "credit",
    "weightSum",
    "relativeWeight",
    "learningOutcomes",
    "referenceLevels",
    "achievement",
    "units"
})
@Entity
@Table(indexes = {

}, uniqueConstraints = {

}, name = "unit")
public class UnitType
    extends EvcetElement
    implements Serializable
{

    @XmlElement(required = true)
    protected String description;
    protected int credit;
    protected int weightSum;
    protected int relativeWeight;
    @XmlElement(required = true)
    @OneToOne(targetEntity = LearningOutcomesType.class, cascade = {

    })
    protected LearningOutcomesType learningOutcomes;
    @XmlElement(required = true)
    @OneToOne(targetEntity = ReferenceLevelsType.class, cascade = {

    })
    protected ReferenceLevelsType referenceLevels;
    @XmlElement(required = true)
    protected AchievementType achievement;
    @OneToOne(targetEntity = UnitsType.class, cascade = {

    })
    protected UnitsType units;

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

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
     *     {@link LearningOutcomesType }
     *     
     */
    public LearningOutcomesType getLearningOutcomes() {
        return learningOutcomes;
    }

    /**
     * Legt den Wert der learningOutcomes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningOutcomesType }
     *     
     */
    public void setLearningOutcomes(LearningOutcomesType value) {
        this.learningOutcomes = value;
    }

    /**
     * Ruft den Wert der referenceLevels-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceLevelsType }
     *     
     */
    public ReferenceLevelsType getReferenceLevels() {
        return referenceLevels;
    }

    /**
     * Legt den Wert der referenceLevels-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceLevelsType }
     *     
     */
    public void setReferenceLevels(ReferenceLevelsType value) {
        this.referenceLevels = value;
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
     * Ruft den Wert der units-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UnitsType }
     *     
     */
    public UnitsType getUnits() {
        return units;
    }

    /**
     * Legt den Wert der units-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitsType }
     *     
     */
    public void setUnits(UnitsType value) {
        this.units = value;
    }

}
