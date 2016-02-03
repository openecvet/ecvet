//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.02.03 um 02:03:38 PM CET 
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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java-Klasse für qualificationFrameworkListType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="qualificationFrameworkListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}ecvetElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="qualificationFramework" type="{}qualificationFrameworkType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qualificationFrameworkListType", propOrder = {
    "qualificationFramework"
})
@Entity
@Table(indexes = {

}, uniqueConstraints = {

}, name = "qualificationframeworklist")
public class QualificationFrameworkListType
    extends EcvetElement
    implements Serializable
{

    @ManyToMany(cascade = {
        CascadeType.PERSIST,
        CascadeType.MERGE,
        CascadeType.DETACH
    })
    @JoinTable(joinColumns = {
        @JoinColumn(name = "qualificationframeworklist_id")
    }, inverseJoinColumns = {
        @JoinColumn(name = "qualificationframework_id")
    }, indexes = {

    }, uniqueConstraints = {

    })
    protected List<QualificationFrameworkType> qualificationFramework;

    /**
     * Gets the value of the qualificationFramework property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualificationFramework property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualificationFramework().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualificationFrameworkType }
     * 
     * 
     */
    public List<QualificationFrameworkType> getQualificationFramework() {
        if (qualificationFramework == null) {
            qualificationFramework = new ArrayList<QualificationFrameworkType>();
        }
        return this.qualificationFramework;
    }

}
