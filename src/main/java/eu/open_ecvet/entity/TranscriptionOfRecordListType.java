//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.12.03 um 01:35:30 PM CET 
//


package eu.open_ecvet.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für transcriptionOfRecordListType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="transcriptionOfRecordListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}ecvetElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transcriptionOfRecord" type="{}transcriptionOfRecordType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transcriptionOfRecordListType", propOrder = {
    "transcriptionOfRecord"
})
@Entity
@Table(indexes = {

}, uniqueConstraints = {

}, name = "transcriptionofrecordlist")
public class TranscriptionOfRecordListType
    extends EcvetElement
    implements Serializable
{

    @XmlElement(required = true)
    @ManyToMany(cascade = {
        CascadeType.PERSIST,
        CascadeType.MERGE,
        CascadeType.DETACH
    })
    @JoinTable(joinColumns = {
        @JoinColumn(name = "transcriptionofrecordlist_id")
    }, inverseJoinColumns = {
        @JoinColumn(name = "transcriptionofrecord_id")
    }, indexes = {

    }, uniqueConstraints = {

    })
    protected List<TranscriptionOfRecordType> transcriptionOfRecord;

    /**
     * Gets the value of the transcriptionOfRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transcriptionOfRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranscriptionOfRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TranscriptionOfRecordType }
     * 
     * 
     */
    public List<TranscriptionOfRecordType> getTranscriptionOfRecord() {
        if (transcriptionOfRecord == null) {
            transcriptionOfRecord = new ArrayList<TranscriptionOfRecordType>();
        }
        return this.transcriptionOfRecord;
    }

}
