//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.11.12 um 05:29:51 PM CET 
//


package net.impact_eu.ecvet.entity;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                     According to: C 155/14 Annex 1 - Definitions (f) --- ‘Assessment of learning outcomes’ means methods and processes used to establish the extent to which a learner has in fact attained particular knowledge, skills and competence
 *                 
 * 
 * <p>Java-Klasse für assessmentType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="assessmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="methods" type="{}methodsType"/&gt;
 *         &lt;element name="processes" type="{}processesType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assessmentType", propOrder = {
    "methods",
    "processes"
})
public class AssessmentType
    implements Serializable
{

    @XmlElement(required = true)
    protected MethodsType methods;
    @XmlElement(required = true)
    protected ProcessesType processes;

    /**
     * Ruft den Wert der methods-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MethodsType }
     *     
     */
    public MethodsType getMethods() {
        return methods;
    }

    /**
     * Legt den Wert der methods-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MethodsType }
     *     
     */
    public void setMethods(MethodsType value) {
        this.methods = value;
    }

    /**
     * Ruft den Wert der processes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProcessesType }
     *     
     */
    public ProcessesType getProcesses() {
        return processes;
    }

    /**
     * Legt den Wert der processes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessesType }
     *     
     */
    public void setProcesses(ProcessesType value) {
        this.processes = value;
    }

}
