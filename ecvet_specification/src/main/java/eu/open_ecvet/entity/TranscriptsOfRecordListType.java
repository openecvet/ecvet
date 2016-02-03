//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.02.03 um 04:42:20 PM CET 
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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für transcriptsOfRecordListType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="transcriptsOfRecordListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}ecvetElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transcriptsOfRecord" type="{}transcriptsOfRecordType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transcriptsOfRecordListType", propOrder = {
    "transcriptsOfRecord"
})
@Entity
@Table(indexes = {

}, uniqueConstraints = {

}, name = "transcriptsofrecordlist")
public class TranscriptsOfRecordListType
    extends EcvetElement
    implements Serializable
{

    @ManyToMany(cascade = {
        CascadeType.PERSIST,
        CascadeType.MERGE,
        CascadeType.DETACH
    })
    @JoinTable(joinColumns = {
        @JoinColumn(name = "transcriptsofrecordlist_id")
    }, inverseJoinColumns = {
        @JoinColumn(name = "transcriptsofrecord_id")
    }, indexes = {

    }, uniqueConstraints = {

    })
    protected List<TranscriptsOfRecordType> transcriptsOfRecord;

    /**
     * Gets the value of the transcriptsOfRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transcriptsOfRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranscriptsOfRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TranscriptsOfRecordType }
     * 
     * 
     */
    public List<TranscriptsOfRecordType> getTranscriptsOfRecord() {
        if (transcriptsOfRecord == null) {
            transcriptsOfRecord = new ArrayList<TranscriptsOfRecordType>();
        }
        return this.transcriptsOfRecord;
    }

}
