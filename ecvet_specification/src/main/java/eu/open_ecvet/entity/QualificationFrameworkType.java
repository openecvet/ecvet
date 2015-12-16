//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.12.16 um 01:14:59 PM CET 
//


package eu.open_ecvet.entity;

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
 * <p>Java-Klasse für qualificationFrameworkType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="qualificationFrameworkType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}ecvetElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="indicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "qualificationFrameworkType", propOrder = {
    "indicator"
})
@Entity
@Table(indexes = {

}, uniqueConstraints = {

}, name = "qualificationframework")
public class QualificationFrameworkType
    extends EcvetElement
    implements Serializable
{

    @XmlElement(required = true)
    protected String indicator;
    @XmlAttribute(name = "framework")
    @Enumerated(EnumType.STRING)
    protected FrameworkType framework;
    @XmlAttribute(name = "frameworkLevel")
    protected Integer frameworkLevel;
    @XmlAttribute(name = "frameworkTerm")
    @Enumerated(EnumType.STRING)
    protected FrameworkTermType frameworkTerm;

    /**
     * Ruft den Wert der indicator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicator() {
        return indicator;
    }

    /**
     * Legt den Wert der indicator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicator(String value) {
        this.indicator = value;
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
