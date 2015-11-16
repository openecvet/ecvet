//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.11.12 um 05:29:51 PM CET 
//


package net.impact_eu.ecvet.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ecvetFrameworkType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ecvetFrameworkType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}evcetElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="competentInstitutions" type="{}competentInstitutionsType"/&gt;
 *         &lt;element name="complementaryDocuments" type="{}complementaryDocumentsType"/&gt;
 *         &lt;element name="qualification" type="{}qualificationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ecvetFrameworkType", propOrder = {
    "competentInstitutions",
    "complementaryDocuments",
    "qualification"
})
@Entity
@Table(indexes = {

}, uniqueConstraints = {

}, name = "ecvetFramework")
public class EcvetFrameworkType
    extends EvcetElement
    implements Serializable
{

    @XmlElement(required = true)
    protected CompetentInstitutionsType competentInstitutions;
    @XmlElement(required = true)
    protected ComplementaryDocumentsType complementaryDocuments;
    @XmlElement(required = true)
    @OneToOne(targetEntity = QualificationType.class, cascade = {

    })
    protected QualificationType qualification;

    /**
     * Ruft den Wert der competentInstitutions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CompetentInstitutionsType }
     *     
     */
    public CompetentInstitutionsType getCompetentInstitutions() {
        return competentInstitutions;
    }

    /**
     * Legt den Wert der competentInstitutions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CompetentInstitutionsType }
     *     
     */
    public void setCompetentInstitutions(CompetentInstitutionsType value) {
        this.competentInstitutions = value;
    }

    /**
     * Ruft den Wert der complementaryDocuments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ComplementaryDocumentsType }
     *     
     */
    public ComplementaryDocumentsType getComplementaryDocuments() {
        return complementaryDocuments;
    }

    /**
     * Legt den Wert der complementaryDocuments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplementaryDocumentsType }
     *     
     */
    public void setComplementaryDocuments(ComplementaryDocumentsType value) {
        this.complementaryDocuments = value;
    }

    /**
     * Ruft den Wert der qualification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QualificationType }
     *     
     */
    public QualificationType getQualification() {
        return qualification;
    }

    /**
     * Legt den Wert der qualification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QualificationType }
     *     
     */
    public void setQualification(QualificationType value) {
        this.qualification = value;
    }

}
