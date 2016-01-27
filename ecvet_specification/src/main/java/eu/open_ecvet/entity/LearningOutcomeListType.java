//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.01.27 um 12:35:22 PM CET 
//


package eu.open_ecvet.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				According to: C 155/14 Annex 1 - Definitions (b)
 * 				-- ‘Learning outcomes’ means statements of what a learner knows,
 * 				understands and is able to do on completion of a learning
 * 				process
 * 				and
 * 				which are defined in
 * 				terms of knowledge, skills and competence;
 * 
 * 				Developers comment: the terms can be specified by referencing them
 * 				to the qualificationlLevelListType which include the constants
 * 				for
 * 				the terms
 * 			
 * 
 * <p>Java-Klasse für learningOutcomeListType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="learningOutcomeListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}ecvetElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ecvetPoints" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="relativeWeight" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="learningOutcomeList" type="{}learningOutcomeListType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="learningOutcome" type="{}learningOutcomeType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "learningOutcomeListType", propOrder = {
    "ecvetPoints",
    "relativeWeight",
    "learningOutcomeList",
    "learningOutcome",
    "qualificationFrameworkList",
    "evaluations"
})
@Entity
@Table(indexes = {

}, uniqueConstraints = {

}, name = "learningoutcomelist")
public class LearningOutcomeListType
    extends EcvetElement
    implements Serializable
{

    protected int ecvetPoints;
    protected int relativeWeight;
    @ManyToMany(cascade = {
        CascadeType.PERSIST,
        CascadeType.MERGE,
        CascadeType.DETACH
    })
    @JoinTable(joinColumns = {
        @JoinColumn(name = "learningoutcomelistparent_id")
    }, inverseJoinColumns = {
        @JoinColumn(name = "learningoutcomelist_id")
    }, indexes = {

    }, uniqueConstraints = {

    })
    protected List<LearningOutcomeListType> learningOutcomeList;
    @ManyToMany(cascade = {
        CascadeType.PERSIST,
        CascadeType.MERGE,
        CascadeType.DETACH
    })
    @JoinTable(joinColumns = {
        @JoinColumn(name = "learningoutcome_id")
    }, inverseJoinColumns = {
        @JoinColumn(name = "learningoutcomelist_id")
    }, indexes = {

    }, uniqueConstraints = {

    })
    protected List<LearningOutcomeType> learningOutcome;
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
     * Gets the value of the learningOutcomeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the learningOutcomeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLearningOutcomeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LearningOutcomeListType }
     * 
     * 
     */
    public List<LearningOutcomeListType> getLearningOutcomeList() {
        if (learningOutcomeList == null) {
            learningOutcomeList = new ArrayList<LearningOutcomeListType>();
        }
        return this.learningOutcomeList;
    }

    /**
     * Gets the value of the learningOutcome property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the learningOutcome property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLearningOutcome().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LearningOutcomeType }
     * 
     * 
     */
    public List<LearningOutcomeType> getLearningOutcome() {
        if (learningOutcome == null) {
            learningOutcome = new ArrayList<LearningOutcomeType>();
        }
        return this.learningOutcome;
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
