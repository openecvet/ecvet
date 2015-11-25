//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.11.25 um 10:17:29 AM CET 
//


package eu.open_ecvet.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für learningOutcomeTermListType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="learningOutcomeTermListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="learningOutcomeTerms" type="{}learningOutcomeTermType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "learningOutcomeTermListType", propOrder = {
    "learningOutcomeTerms"
})
public class LearningOutcomeTermListType implements Serializable
{

    @XmlElement(required = true)
    protected List<LearningOutcomeTermType> learningOutcomeTerms;

    /**
     * Gets the value of the learningOutcomeTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the learningOutcomeTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLearningOutcomeTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LearningOutcomeTermType }
     * 
     * 
     */
    public List<LearningOutcomeTermType> getLearningOutcomeTerms() {
        if (learningOutcomeTerms == null) {
            learningOutcomeTerms = new ArrayList<LearningOutcomeTermType>();
        }
        return this.learningOutcomeTerms;
    }

}
