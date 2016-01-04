//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.12.17 um 02:48:56 PM CET 
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
 * 
 * 				— the ‘hosting’ institution assesses the learning outcomes achieved and awards credit to the learner; the learning
 * 				outcomes achieved and the corresponding ECVET points are
 * 				recorded in a learner's ‘personal transcript’ ( 1 ),
 * 				— the ‘home’ institution validates the credit as a suitable record of the learner's achievement,
 * 				— the ‘home’ institution then recognises the
 * 				learning outcomes that have been acquired; this recognition gives rise to the
 * 				award of the units and their corresponding ECVET points, according to the rules of the ‘home’ system.
 * 
 * 				( 1 ) The ‘home’
 * 				institution is the institution which will validate and recognise learning outcomes achieved by the learner. The ‘hosting’
 * 				institution is the one that delivers training for the learning outcomes
 * 				concerned and assesses the achieved learning outcomes.
 * 			
 * 
 * <p>Java-Klasse für learningAgreementType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="learningAgreementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}ecvetAttachment"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hostingInstitutionURI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="homeInstitutionURI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "learningAgreementType", propOrder = {
    "hostingInstitutionURI",
    "homeInstitutionURI"
})
@Entity
@Table(indexes = {

}, uniqueConstraints = {

}, name = "learningagreement")
public class LearningAgreementType
    extends EcvetAttachment
    implements Serializable
{

    @XmlElement(required = true)
    protected String hostingInstitutionURI;
    @XmlElement(required = true)
    protected String homeInstitutionURI;

    /**
     * Ruft den Wert der hostingInstitutionURI-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostingInstitutionURI() {
        return hostingInstitutionURI;
    }

    /**
     * Legt den Wert der hostingInstitutionURI-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostingInstitutionURI(String value) {
        this.hostingInstitutionURI = value;
    }

    /**
     * Ruft den Wert der homeInstitutionURI-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeInstitutionURI() {
        return homeInstitutionURI;
    }

    /**
     * Legt den Wert der homeInstitutionURI-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeInstitutionURI(String value) {
        this.homeInstitutionURI = value;
    }

}
