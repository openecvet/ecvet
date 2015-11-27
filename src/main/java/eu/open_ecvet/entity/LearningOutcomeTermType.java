//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.11.27 um 08:10:16 PM CET 
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
 *     &lt;extension base="{}evcetElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referenceLevelList" type="{}referenceLevelListType"/&gt;
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="achievement" type="{}achievementType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "learningOutcomeTermType", propOrder = {
    "referenceLevelList",
    "weight",
    "achievement"
})
@Entity
@Table(indexes = {

}, uniqueConstraints = {

}, name = "learningoutcometerm")
public class LearningOutcomeTermType
    extends EvcetElement
    implements Serializable
{

    @XmlElement(required = true)
    @OneToOne(targetEntity = ReferenceLevelListType.class, cascade = {

    })
    protected ReferenceLevelListType referenceLevelList;
    protected int weight;
    @XmlElement(required = true)
    @OneToOne(targetEntity = AchievementType.class, cascade = {

    })
    protected AchievementType achievement;

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
