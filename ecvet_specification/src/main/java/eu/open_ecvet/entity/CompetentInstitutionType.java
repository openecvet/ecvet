//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.12.15 um 05:07:17 PM CET 
//


package eu.open_ecvet.entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				According to: C 155/14 Annex 1 - Definitions (e)
 * 				-- ‘Competent institution’ means an institution which is responsible
 * 				for designing and awarding qualifications or recognising
 * 				units
 * 				or
 * 				other functions
 * 				linked to ECVET, such as allocation of ECVET points
 * 				to qualifications and units, assessment, validation and recognition
 * 				of learning outcomes, under the rules and practices
 * 				of
 * 				participating
 * 				countries
 * 			
 * 
 * <p>Java-Klasse für competentInstitutionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="competentInstitutionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}ecvetElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partnerList" type="{}partnerListType"/&gt;
 *         &lt;element name="legislationList" type="{}legislationListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "competentInstitutionType", propOrder = {
    "partnerList",
    "legislationList"
})
@Entity
@Table(indexes = {

}, uniqueConstraints = {

}, name = "competentinstitution")
public class CompetentInstitutionType
    extends EcvetElement
    implements Serializable
{

    @XmlElement(required = true)
    @OneToOne(targetEntity = PartnerListType.class, cascade = {
        CascadeType.ALL
    })
    protected PartnerListType partnerList;
    @XmlElement(required = true)
    @OneToOne(targetEntity = LegislationListType.class, cascade = {
        CascadeType.ALL
    })
    protected LegislationListType legislationList;

    /**
     * Ruft den Wert der partnerList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PartnerListType }
     *     
     */
    public PartnerListType getPartnerList() {
        return partnerList;
    }

    /**
     * Legt den Wert der partnerList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerListType }
     *     
     */
    public void setPartnerList(PartnerListType value) {
        this.partnerList = value;
    }

    /**
     * Ruft den Wert der legislationList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LegislationListType }
     *     
     */
    public LegislationListType getLegislationList() {
        return legislationList;
    }

    /**
     * Legt den Wert der legislationList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LegislationListType }
     *     
     */
    public void setLegislationList(LegislationListType value) {
        this.legislationList = value;
    }

}
