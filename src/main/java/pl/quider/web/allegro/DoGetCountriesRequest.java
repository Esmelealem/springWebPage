
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
 *         <element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="webapiKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "countryCode",
    "webapiKey"
})
@XmlRootElement(name = "DoGetCountriesRequest")
public class DoGetCountriesRequest {

    protected int countryCode;
    @XmlElement(required = true)
    protected String webapiKey;

    /**
     * Gets the value of the countryCode property.
     * 
     */
    public int getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     */
    public void setCountryCode(int value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the webapiKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebapiKey() {
        return webapiKey;
    }

    /**
     * Sets the value of the webapiKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebapiKey(String value) {
        this.webapiKey = value;
    }

}
