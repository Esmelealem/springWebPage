
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelatedPersonsStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="RelatedPersonsStruct">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="spouseFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="spouseLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedPersonsStruct", propOrder = {

})
public class RelatedPersonsStruct {

    @XmlElement(required = true)
    protected String spouseFirstName;
    @XmlElement(required = true)
    protected String spouseLastName;

    /**
     * Gets the value of the spouseFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseFirstName() {
        return spouseFirstName;
    }

    /**
     * Sets the value of the spouseFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseFirstName(String value) {
        this.spouseFirstName = value;
    }

    /**
     * Gets the value of the spouseLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseLastName() {
        return spouseLastName;
    }

    /**
     * Sets the value of the spouseLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseLastName(String value) {
        this.spouseLastName = value;
    }

}
