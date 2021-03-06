
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="itemDescription" type="{urn:SandboxWebApi}ItemDescriptionStruct"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "itemDescription"
})
@XmlRootElement(name = "doCheckItemDescriptionResponse")
public class DoCheckItemDescriptionResponse {

    @XmlElement(required = true)
    protected ItemDescriptionStruct itemDescription;

    /**
     * Gets the value of the itemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ItemDescriptionStruct }
     *     
     */
    public ItemDescriptionStruct getItemDescription() {
        return itemDescription;
    }

    /**
     * Sets the value of the itemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemDescriptionStruct }
     *     
     */
    public void setItemDescription(ItemDescriptionStruct value) {
        this.itemDescription = value;
    }

}
