//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.11.27 um 08:10:16 PM CET 
//


package eu.open_ecvet.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für legislationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="legislationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}evcetElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rules" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="practices" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "legislationType", propOrder = {
    "rules",
    "practices"
})
@Entity
@Table(indexes = {

}, uniqueConstraints = {

}, name = "legislation")
public class LegislationType
    extends EvcetElement
    implements Serializable
{

    @XmlElement(required = true)
    protected String rules;
    @XmlElement(required = true)
    protected String practices;

    /**
     * Ruft den Wert der rules-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRules() {
        return rules;
    }

    /**
     * Legt den Wert der rules-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRules(String value) {
        this.rules = value;
    }

    /**
     * Ruft den Wert der practices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPractices() {
        return practices;
    }

    /**
     * Legt den Wert der practices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPractices(String value) {
        this.practices = value;
    }

}
