//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.12.03 um 01:35:30 PM CET 
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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				According to: C 155/14 Annex 1 - Definitions (b) -- ‘Learning outcomes’ means statements of what a learner knows, understands and is able to do on completion of a learning
 * 				process and which are defined in
 * 				terms of knowledge, skills and competence;
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
 *         &lt;element name="learningOutcome" type="{}learningOutcomeType" maxOccurs="unbounded"/&gt;
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
    "learningOutcome"
})
@Entity
@Table(indexes = {

}, uniqueConstraints = {

}, name = "learningoutcomelist")
public class LearningOutcomeListType
    extends EcvetElement
    implements Serializable
{

    @XmlElement(required = true)
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

}
