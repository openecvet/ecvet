//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.12.15 um 05:07:17 PM CET 
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
 * <p>Java-Klasse für procedureAndGuidelineListType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="procedureAndGuidelineListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}ecvetElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="procedureAndGuideline" type="{}procedureAndGuidelineType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "procedureAndGuidelineListType", propOrder = {
    "procedureAndGuideline"
})
@Entity
@Table(indexes = {

}, uniqueConstraints = {

}, name = "procedureandguidelinelist")
public class ProcedureAndGuidelineListType
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
        @JoinColumn(name = "procedureandguidelinelist_id")
    }, inverseJoinColumns = {
        @JoinColumn(name = "procedureandguideline_id")
    }, indexes = {

    }, uniqueConstraints = {

    })
    protected List<ProcedureAndGuidelineType> procedureAndGuideline;

    /**
     * Gets the value of the procedureAndGuideline property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the procedureAndGuideline property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcedureAndGuideline().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcedureAndGuidelineType }
     * 
     * 
     */
    public List<ProcedureAndGuidelineType> getProcedureAndGuideline() {
        if (procedureAndGuideline == null) {
            procedureAndGuideline = new ArrayList<ProcedureAndGuidelineType>();
        }
        return this.procedureAndGuideline;
    }

}
