//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.11.24 um 08:34:47 PM CET 
//


package eu.open_ecvet.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                     According to: C 155/14 Annex 1 - Definitions (b) -- a single learning outcome represents the statement, which is described in the defintion
 *                 
 * 
 * <p>Java-Klasse für learningOutcomeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="learningOutcomeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}evcetElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="credit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="learningOutcomeTermList" type="{}learningOutcomeTermListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "learningOutcomeType", propOrder = {
    "rest"
})
@Entity
@Table(indexes = {

}, uniqueConstraints = {

}, name = "learningOutcome")
public class LearningOutcomeType
    extends EvcetElement
    implements Serializable
{

    @XmlElementRefs({
        @XmlElementRef(name = "credit", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "learningOutcomeTermList", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "title", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends Serializable>> rest;

    /**
     * Ruft das restliche Contentmodell ab. 
     * 
     * <p>
     * Sie rufen diese "catch-all"-Eigenschaft aus folgendem Grund ab: 
     * Der Feldname "Title" wird von zwei verschiedenen Teilen eines Schemas verwendet. Siehe: 
     * Zeile 327 von file:/home/tom/src/java/specification/src/main/resources/xsd/draft.xsd
     * Zeile 602 von file:/home/tom/src/java/specification/src/main/resources/xsd/draft.xsd
     * <p>
     * Um diese Eigenschaft zu entfernen, wenden Sie eine Eigenschaftenanpassung für eine
     * der beiden folgenden Deklarationen an, um deren Namen zu ändern: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link LearningOutcomeTermListType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.rest;
    }

}
