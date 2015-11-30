//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.11.30 um 04:09:30 PM CET 
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
 * 				According to: C 155/14 Annex 1 - Definitions (g) --- ‘Validation of learning outcomes’ means the process of confirming that certain assessed learning outcomes achieved by a
 * 				learner correspond to specific
 * 				outcomes which may be required for a unit or a qualification
 * 			
 * 
 * <p>Java-Klasse für validationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="validationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}ecvetElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="confirmingRequirementList" type="{}confirmingRequirementListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validationType", propOrder = {
    "confirmingRequirementList"
})
@Entity
@Table(indexes = {

}, uniqueConstraints = {

}, name = "validation")
public class ValidationType
    extends EcvetElement
    implements Serializable
{

    @XmlElement(required = true)
    @OneToOne(targetEntity = ConfirmingRequirementListType.class, cascade = {

    })
    protected ConfirmingRequirementListType confirmingRequirementList;

    /**
     * Ruft den Wert der confirmingRequirementList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmingRequirementListType }
     *     
     */
    public ConfirmingRequirementListType getConfirmingRequirementList() {
        return confirmingRequirementList;
    }

    /**
     * Legt den Wert der confirmingRequirementList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmingRequirementListType }
     *     
     */
    public void setConfirmingRequirementList(ConfirmingRequirementListType value) {
        this.confirmingRequirementList = value;
    }

}
