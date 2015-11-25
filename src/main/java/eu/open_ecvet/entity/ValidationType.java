//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.11.25 um 10:17:29 AM CET 
//


package eu.open_ecvet.entity;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				According to: C 155/14 Annex 1 - Definitions (g) --- ‘Validation of learning outcomes’ means the process of confirming that certain assessed learning outcomes achieved by a learner correspond to specific
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="confirmingRequirement" type="{}confirmingRequirementType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validationType", propOrder = {
    "confirmingRequirement"
})
public class ValidationType
    implements Serializable
{

    @XmlElement(required = true)
    protected ConfirmingRequirementType confirmingRequirement;

    /**
     * Ruft den Wert der confirmingRequirement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmingRequirementType }
     *     
     */
    public ConfirmingRequirementType getConfirmingRequirement() {
        return confirmingRequirement;
    }

    /**
     * Legt den Wert der confirmingRequirement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmingRequirementType }
     *     
     */
    public void setConfirmingRequirement(ConfirmingRequirementType value) {
        this.confirmingRequirement = value;
    }

}
