//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.11.27 um 10:26:59 AM CET 
//


package eu.open_ecvet.entity;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				According to: C 155/14 Annex 1 - Definitions (f) --- ‘Assessment of learning outcomes’ means methods and processes used to establish the extent to which a learner has in fact
 * 				attained particular knowledge,
 * 				skills and competence
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
 *         &lt;element name="methodList" type="{}methodListType"/&gt;
 *         &lt;element name="processList" type="{}processListType"/&gt;
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
    "methodList",
    "processList"
})
public class AssessmentType
    implements Serializable
{

    @XmlElement(required = true)
    protected MethodListType methodList;
    @XmlElement(required = true)
    protected ProcessListType processList;

    /**
     * Ruft den Wert der methodList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MethodListType }
     *     
     */
    public MethodListType getMethodList() {
        return methodList;
    }

    /**
     * Legt den Wert der methodList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MethodListType }
     *     
     */
    public void setMethodList(MethodListType value) {
        this.methodList = value;
    }

    /**
     * Ruft den Wert der processList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProcessListType }
     *     
     */
    public ProcessListType getProcessList() {
        return processList;
    }

    /**
     * Legt den Wert der processList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessListType }
     *     
     */
    public void setProcessList(ProcessListType value) {
        this.processList = value;
    }

}
