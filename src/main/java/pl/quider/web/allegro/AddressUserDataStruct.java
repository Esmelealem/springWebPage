
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressUserDataStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="AddressUserDataStruct">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="userCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="userFullName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="userAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="userPostcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="userCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressUserDataStruct", propOrder = {

})
public class AddressUserDataStruct {

    protected String userCompany;
    @XmlElement(required = true)
    protected String userFullName;
    @XmlElement(required = true)
    protected String userAddress;
    @XmlElement(required = true)
    protected String userPostcode;
    @XmlElement(required = true)
    protected String userCity;

    /**
     * Gets the value of the userCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCompany() {
        return userCompany;
    }

    /**
     * Sets the value of the userCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCompany(String value) {
        this.userCompany = value;
    }

    /**
     * Gets the value of the userFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFullName() {
        return userFullName;
    }

    /**
     * Sets the value of the userFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFullName(String value) {
        this.userFullName = value;
    }

    /**
     * Gets the value of the userAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * Sets the value of the userAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAddress(String value) {
        this.userAddress = value;
    }

    /**
     * Gets the value of the userPostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPostcode() {
        return userPostcode;
    }

    /**
     * Sets the value of the userPostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPostcode(String value) {
        this.userPostcode = value;
    }

    /**
     * Gets the value of the userCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCity() {
        return userCity;
    }

    /**
     * Sets the value of the userCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCity(String value) {
        this.userCity = value;
    }

}
