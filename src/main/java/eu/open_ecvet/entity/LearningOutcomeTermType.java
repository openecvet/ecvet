//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.11.24 um 08:34:47 PM CET 
//


package eu.open_ecvet.entity;

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
 *         &lt;element name="referenceLevelList" type="{}referenceLevelListType"/&gt;
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
    "referenceLevelList",
    "weight",
    "achievement"
})
public class LearningOutcomeTermType
    implements Serializable
{

    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected ReferenceLevelListType referenceLevelList;
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
