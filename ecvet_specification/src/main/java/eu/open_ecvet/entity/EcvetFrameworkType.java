//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.12.09 um 05:23:53 PM CET 
//


package eu.open_ecvet.entity;

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
 *     &lt;extension base="{}ecvetElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="competentInstitutionList" type="{}competentInstitutionListType"/&gt;
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
    "competentInstitutionList",
    "complementaryDocuments",
    "qualification"
})
@Entity
@Table(indexes = {

}, uniqueConstraints = {

}, name = "ecvetframework")
public class EcvetFrameworkType
    extends EcvetElement
    implements Serializable
{

    @XmlElement(required = true)
    @OneToOne(targetEntity = CompetentInstitutionListType.class, cascade = {

    })
    protected CompetentInstitutionListType competentInstitutionList;
    @XmlElement(required = true)
    @OneToOne(targetEntity = ComplementaryDocumentsType.class, cascade = {

    })
    protected ComplementaryDocumentsType complementaryDocuments;
    @XmlElement(required = true)
    @OneToOne(targetEntity = QualificationType.class, cascade = {

    })
    protected QualificationType qualification;

    /**
     * Ruft den Wert der competentInstitutionList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CompetentInstitutionListType }
     *     
     */
    public CompetentInstitutionListType getCompetentInstitutionList() {
        return competentInstitutionList;
    }

    /**
     * Legt den Wert der competentInstitutionList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CompetentInstitutionListType }
     *     
     */
    public void setCompetentInstitutionList(CompetentInstitutionListType value) {
        this.competentInstitutionList = value;
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
