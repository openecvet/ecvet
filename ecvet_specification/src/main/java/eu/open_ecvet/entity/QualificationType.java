//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.12.14 um 04:50:16 PM CET 
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
 * 
 * 				According to: C 155/14 Annex 1 - Definitions (a)
 * 				-- 'Qualification’ means a formal outcome of an assessment and
 * 				validation process which is obtained when a competent institution
 * 				determines that an
 * 				individual has achieved learning outcomes to given
 * 				standards
 * 			
 * 
 * <p>Java-Klasse für qualificationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="qualificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}ecvetElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unitList" type="{}unitListType"/&gt;
 *         &lt;element name="wholeEcvetPoints" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qualificationType", propOrder = {
    "unitList",
    "wholeEcvetPoints"
})
@Entity
@Table(indexes = {

}, uniqueConstraints = {

}, name = "qualification")
public class QualificationType
    extends EcvetElement
    implements Serializable
{

    @XmlElement(required = true)
    @OneToOne(targetEntity = UnitListType.class, cascade = {

    })
    protected UnitListType unitList;
    protected int wholeEcvetPoints;

    /**
     * Ruft den Wert der unitList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UnitListType }
     *     
     */
    public UnitListType getUnitList() {
        return unitList;
    }

    /**
     * Legt den Wert der unitList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitListType }
     *     
     */
    public void setUnitList(UnitListType value) {
        this.unitList = value;
    }

    /**
     * Ruft den Wert der wholeEcvetPoints-Eigenschaft ab.
     * 
     */
    public int getWholeEcvetPoints() {
        return wholeEcvetPoints;
    }

    /**
     * Legt den Wert der wholeEcvetPoints-Eigenschaft fest.
     * 
     */
    public void setWholeEcvetPoints(int value) {
        this.wholeEcvetPoints = value;
    }

}
