//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.11.12 um 05:29:51 PM CET 
//


package net.impact_eu.ecvet.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für competentInstitutionsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="competentInstitutionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="competentInstitution" type="{}competentInstitutionType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "competentInstitutionsType", propOrder = {
    "competentInstitution"
})
public class CompetentInstitutionsType
    implements Serializable
{

    @XmlElement(required = true)
    protected List<CompetentInstitutionType> competentInstitution;

    /**
     * Gets the value of the competentInstitution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the competentInstitution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompetentInstitution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompetentInstitutionType }
     * 
     * 
     */
    public List<CompetentInstitutionType> getCompetentInstitution() {
        if (competentInstitution == null) {
            competentInstitution = new ArrayList<CompetentInstitutionType>();
        }
        return this.competentInstitution;
    }

}
