//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.11.24 um 05:09:49 PM CET 
//


package net.impact_eu.ecvet.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für referenceLevelType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="referenceLevelType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}evcetElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="indication" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="framework" type="{}frameworkType" /&gt;
 *       &lt;attribute name="frameworkLevel" type="{}frameworkLevelType" /&gt;
 *       &lt;attribute name="frameworkTerm" type="{}frameworkTermType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "referenceLevelType", propOrder = {
    "indication"
})
@Entity
@Table(indexes = {

}, uniqueConstraints = {

}, name = "referenceLevel")
public class ReferenceLevelType
    extends EvcetElement
    implements Serializable
{

    @XmlElement(required = true)
    protected String indication;
    @XmlAttribute(name = "framework")
    @Enumerated(EnumType.STRING)
    protected FrameworkType framework;
    @XmlAttribute(name = "frameworkLevel")
    protected Integer frameworkLevel;
    @XmlAttribute(name = "frameworkTerm")
    @Enumerated(EnumType.STRING)
    protected FrameworkTermType frameworkTerm;

    /**
     * Ruft den Wert der indication-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndication() {
        return indication;
    }

    /**
     * Legt den Wert der indication-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndication(String value) {
        this.indication = value;
    }

    /**
     * Ruft den Wert der framework-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FrameworkType }
     *     
     */
    public FrameworkType getFramework() {
        return framework;
    }

    /**
     * Legt den Wert der framework-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FrameworkType }
     *     
     */
    public void setFramework(FrameworkType value) {
        this.framework = value;
    }

    /**
     * Ruft den Wert der frameworkLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFrameworkLevel() {
        return frameworkLevel;
    }

    /**
     * Legt den Wert der frameworkLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFrameworkLevel(Integer value) {
        this.frameworkLevel = value;
    }

    /**
     * Ruft den Wert der frameworkTerm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FrameworkTermType }
     *     
     */
    public FrameworkTermType getFrameworkTerm() {
        return frameworkTerm;
    }

    /**
     * Legt den Wert der frameworkTerm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FrameworkTermType }
     *     
     */
    public void setFrameworkTerm(FrameworkTermType value) {
        this.frameworkTerm = value;
    }

}
