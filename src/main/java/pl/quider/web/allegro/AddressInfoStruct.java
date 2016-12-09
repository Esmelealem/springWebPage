
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressInfoStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="AddressInfoStruct">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="addressType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="addressUserData" type="{urn:SandboxWebApi}AddressUserDataStruct"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressInfoStruct", propOrder = {

})
public class AddressInfoStruct {

    protected int addressType;
    @XmlElement(required = true)
    protected AddressUserDataStruct addressUserData;

    /**
     * Gets the value of the addressType property.
     * 
     */
    public int getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     */
    public void setAddressType(int value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the addressUserData property.
     * 
     * @return
     *     possible object is
     *     {@link AddressUserDataStruct }
     *     
     */
    public AddressUserDataStruct getAddressUserData() {
        return addressUserData;
    }

    /**
     * Sets the value of the addressUserData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressUserDataStruct }
     *     
     */
    public void setAddressUserData(AddressUserDataStruct value) {
        this.addressUserData = value;
    }

}
