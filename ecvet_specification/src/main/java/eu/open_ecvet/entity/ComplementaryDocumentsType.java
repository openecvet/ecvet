//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.12.10 um 04:48:47 PM CET 
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
 * 
 * 				ANNEX II ECVET — PRINCIPLES AND TECHNICAL
 * 				SPECIFICATIONS -- ECVET tools and methodology comprise the
 * 				description of qualifi­cations in terms of units of learning
 * 				outcomes with
 * 				associated points, a
 * 				transfer and accumulation process
 * 				andcomplementary documents such as learning agreements, transcripts
 * 				of records and ECVET users’ guides. TODO: own type with file
 * 				attachments
 * 			
 * 
 * <p>Java-Klasse für complementaryDocumentsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="complementaryDocumentsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}ecvetElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="learningAgreementList" type="{}learningAgreementListType"/&gt;
 *         &lt;element name="transcriptsOfRecordList" type="{}transcriptsOfRecordListType"/&gt;
 *         &lt;element name="userGuideList" type="{}userGuideListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complementaryDocumentsType", propOrder = {
    "learningAgreementList",
    "transcriptsOfRecordList",
    "userGuideList"
})
@Entity
@Table(indexes = {

}, uniqueConstraints = {

}, name = "complementarydocuments")
public class ComplementaryDocumentsType
    extends EcvetElement
    implements Serializable
{

    @XmlElement(required = true)
    @OneToOne(targetEntity = LearningAgreementListType.class, cascade = {

    })
    protected LearningAgreementListType learningAgreementList;
    @XmlElement(required = true)
    @OneToOne(targetEntity = TranscriptsOfRecordListType.class, cascade = {

    })
    protected TranscriptsOfRecordListType transcriptsOfRecordList;
    @XmlElement(required = true)
    @OneToOne(targetEntity = UserGuideListType.class, cascade = {

    })
    protected UserGuideListType userGuideList;

    /**
     * Ruft den Wert der learningAgreementList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LearningAgreementListType }
     *     
     */
    public LearningAgreementListType getLearningAgreementList() {
        return learningAgreementList;
    }

    /**
     * Legt den Wert der learningAgreementList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningAgreementListType }
     *     
     */
    public void setLearningAgreementList(LearningAgreementListType value) {
        this.learningAgreementList = value;
    }

    /**
     * Ruft den Wert der transcriptsOfRecordList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TranscriptsOfRecordListType }
     *     
     */
    public TranscriptsOfRecordListType getTranscriptsOfRecordList() {
        return transcriptsOfRecordList;
    }

    /**
     * Legt den Wert der transcriptsOfRecordList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TranscriptsOfRecordListType }
     *     
     */
    public void setTranscriptsOfRecordList(TranscriptsOfRecordListType value) {
        this.transcriptsOfRecordList = value;
    }

    /**
     * Ruft den Wert der userGuideList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserGuideListType }
     *     
     */
    public UserGuideListType getUserGuideList() {
        return userGuideList;
    }

    /**
     * Legt den Wert der userGuideList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserGuideListType }
     *     
     */
    public void setUserGuideList(UserGuideListType value) {
        this.userGuideList = value;
    }

}
