
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WatchListInfoStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="WatchListInfoStruct">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="itemsAdded" type="{urn:SandboxWebApi}ArrayOfLong" minOccurs="0"/>
 *         <element name="itemsNotAdded" type="{urn:SandboxWebApi}ArrayOfItemsnotaddedstruct" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WatchListInfoStruct", propOrder = {

})
public class WatchListInfoStruct {

    protected ArrayOfLong itemsAdded;
    protected ArrayOfItemsnotaddedstruct itemsNotAdded;

    /**
     * Gets the value of the itemsAdded property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getItemsAdded() {
        return itemsAdded;
    }

    /**
     * Sets the value of the itemsAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setItemsAdded(ArrayOfLong value) {
        this.itemsAdded = value;
    }

    /**
     * Gets the value of the itemsNotAdded property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemsnotaddedstruct }
     *     
     */
    public ArrayOfItemsnotaddedstruct getItemsNotAdded() {
        return itemsNotAdded;
    }

    /**
     * Sets the value of the itemsNotAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemsnotaddedstruct }
     *     
     */
    public void setItemsNotAdded(ArrayOfItemsnotaddedstruct value) {
        this.itemsNotAdded = value;
    }

}
