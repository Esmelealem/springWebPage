
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BlackListStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="BlackListStruct">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="userId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="userLogin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="userRating" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="userCountry" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlackListStruct", propOrder = {

})
public class BlackListStruct {

    protected long userId;
    @XmlElement(required = true)
    protected String userLogin;
    protected int userRating;
    protected int userCountry;

    /**
     * Gets the value of the userId property.
     * 
     */
    public long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(long value) {
        this.userId = value;
    }

    /**
     * Gets the value of the userLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLogin() {
        return userLogin;
    }

    /**
     * Sets the value of the userLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLogin(String value) {
        this.userLogin = value;
    }

    /**
     * Gets the value of the userRating property.
     * 
     */
    public int getUserRating() {
        return userRating;
    }

    /**
     * Sets the value of the userRating property.
     * 
     */
    public void setUserRating(int value) {
        this.userRating = value;
    }

    /**
     * Gets the value of the userCountry property.
     * 
     */
    public int getUserCountry() {
        return userCountry;
    }

    /**
     * Sets the value of the userCountry property.
     * 
     */
    public void setUserCountry(int value) {
        this.userCountry = value;
    }

}
