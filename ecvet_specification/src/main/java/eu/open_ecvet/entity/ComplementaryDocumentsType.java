//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.02.03 um 04:42:20 PM CET 
//


package eu.open_ecvet.entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="memorandumOfUnderstanding" type="{}memorandumOfUnderstandingType" minOccurs="0"/&gt;
 *         &lt;element name="procedureAndGuidelineList" type="{}procedureAndGuidelineListType" minOccurs="0"/&gt;
 *         &lt;element name="learningAgreementList" type="{}learningAgreementListType" minOccurs="0"/&gt;
 *         &lt;element name="transcriptsOfRecordList" type="{}transcriptsOfRecordListType" minOccurs="0"/&gt;
 *         &lt;element name="creditTransferList" type="{}creditTransferListType" minOccurs="0"/&gt;
 *         &lt;element name="userGuideList" type="{}userGuideListType" minOccurs="0"/&gt;
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
    "memorandumOfUnderstanding",
    "procedureAndGuidelineList",
    "learningAgreementList",
    "transcriptsOfRecordList",
    "creditTransferList",
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

    @OneToOne(targetEntity = MemorandumOfUnderstandingType.class, cascade = {
        CascadeType.ALL
    })
    protected MemorandumOfUnderstandingType memorandumOfUnderstanding;
    @OneToOne(targetEntity = ProcedureAndGuidelineListType.class, cascade = {
        CascadeType.ALL
    })
    protected ProcedureAndGuidelineListType procedureAndGuidelineList;
    @OneToOne(targetEntity = LearningAgreementListType.class, cascade = {
        CascadeType.ALL
    })
    protected LearningAgreementListType learningAgreementList;
    @OneToOne(targetEntity = TranscriptsOfRecordListType.class, cascade = {
        CascadeType.ALL
    })
    protected TranscriptsOfRecordListType transcriptsOfRecordList;
    protected CreditTransferListType creditTransferList;
    @OneToOne(targetEntity = UserGuideListType.class, cascade = {
        CascadeType.ALL
    })
    protected UserGuideListType userGuideList;

    /**
     * Ruft den Wert der memorandumOfUnderstanding-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MemorandumOfUnderstandingType }
     *     
     */
    public MemorandumOfUnderstandingType getMemorandumOfUnderstanding() {
        return memorandumOfUnderstanding;
    }

    /**
     * Legt den Wert der memorandumOfUnderstanding-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MemorandumOfUnderstandingType }
     *     
     */
    public void setMemorandumOfUnderstanding(MemorandumOfUnderstandingType value) {
        this.memorandumOfUnderstanding = value;
    }

    /**
     * Ruft den Wert der procedureAndGuidelineList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProcedureAndGuidelineListType }
     *     
     */
    public ProcedureAndGuidelineListType getProcedureAndGuidelineList() {
        return procedureAndGuidelineList;
    }

    /**
     * Legt den Wert der procedureAndGuidelineList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedureAndGuidelineListType }
     *     
     */
    public void setProcedureAndGuidelineList(ProcedureAndGuidelineListType value) {
        this.procedureAndGuidelineList = value;
    }

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
     * Ruft den Wert der creditTransferList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CreditTransferListType }
     *     
     */
    public CreditTransferListType getCreditTransferList() {
        return creditTransferList;
    }

    /**
     * Legt den Wert der creditTransferList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransferListType }
     *     
     */
    public void setCreditTransferList(CreditTransferListType value) {
        this.creditTransferList = value;
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
