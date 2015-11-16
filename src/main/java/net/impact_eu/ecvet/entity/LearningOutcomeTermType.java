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
 * which are defined in terms of knowledge, skills and competence;
 *                 
 * 
 * <p>Java-Klasse für learningOutcomeTermType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="learningOutcomeTermType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="referenceLevels" type="{}referenceLevelsType"/&gt;
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="achievement" type="{}achievementType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "learningOutcomeTermType", propOrder = {
    "title",
    "description",
    "referenceLevels",
    "weight",
    "achievement"
})
public class LearningOutcomeTermType
    implements Serializable
{

    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected ReferenceLevelsType referenceLevels;
    protected int weight;
    @XmlElement(required = true)
    protected AchievementType achievement;

    /**
     * Ruft den Wert der title-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Legt den Wert der title-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

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
     * Ruft den Wert der weight-Eigenschaft ab.
     * 
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Legt den Wert der weight-Eigenschaft fest.
     * 
     */
    public void setWeight(int value) {
        this.weight = value;
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

}
