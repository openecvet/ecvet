//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.11.27 um 08:10:16 PM CET 
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
 * 
 * <p>Java-Klasse für referenceLevelListType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="referenceLevelListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}evcetElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referenceLevel" type="{}referenceLevelType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "referenceLevelListType", propOrder = {
    "referenceLevel"
})
@Entity
@Table(indexes = {

}, uniqueConstraints = {

}, name = "referencelevellist")
public class ReferenceLevelListType
    extends EvcetElement
    implements Serializable
{

    @XmlElement(required = true)
    @ManyToMany(cascade = {
        CascadeType.PERSIST,
        CascadeType.MERGE,
        CascadeType.DETACH
    })
    @JoinTable(joinColumns = {
        @JoinColumn(name = "referencelevellist_id")
    }, inverseJoinColumns = {
        @JoinColumn(name = "referencelevel_id")
    }, indexes = {

    }, uniqueConstraints = {

    })
    protected List<ReferenceLevelType> referenceLevel;

    /**
     * Gets the value of the referenceLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceLevelType }
     * 
     * 
     */
    public List<ReferenceLevelType> getReferenceLevel() {
        if (referenceLevel == null) {
            referenceLevel = new ArrayList<ReferenceLevelType>();
        }
        return this.referenceLevel;
    }

}
