//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.01.05 um 05:54:26 PM CET 
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
 * <p>Java-Klasse für unitListType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="unitListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}ecvetElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unitList" type="{}unitListType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="unit" type="{}unitType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "unitListType", propOrder = {
    "unitList",
    "unit",
    "qualificationFrameworkList",
    "evaluations"
})
@Entity
@Table(indexes = {

}, uniqueConstraints = {

}, name = "unitlist")
public class UnitListType
    extends EcvetElement
    implements Serializable
{

    @ManyToMany(cascade = {
        CascadeType.PERSIST,
        CascadeType.MERGE,
        CascadeType.DETACH
    })
    @JoinTable(joinColumns = {
        @JoinColumn(name = "unitlistparent_id")
    }, inverseJoinColumns = {
        @JoinColumn(name = "unitlist_id")
    }, indexes = {

    }, uniqueConstraints = {

    })
    protected List<UnitListType> unitList;
    @ManyToMany(cascade = {
        CascadeType.PERSIST,
        CascadeType.MERGE,
        CascadeType.DETACH
    })
    @JoinTable(joinColumns = {
        @JoinColumn(name = "unitlist_id")
    }, inverseJoinColumns = {
        @JoinColumn(name = "unit_id")
    }, indexes = {

    }, uniqueConstraints = {

    })
    protected List<UnitType> unit;
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
     * Gets the value of the unitList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitListType }
     * 
     * 
     */
    public List<UnitListType> getUnitList() {
        if (unitList == null) {
            unitList = new ArrayList<UnitListType>();
        }
        return this.unitList;
    }

    /**
     * Gets the value of the unit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitType }
     * 
     * 
     */
    public List<UnitType> getUnit() {
        if (unit == null) {
            unit = new ArrayList<UnitType>();
        }
        return this.unit;
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
