
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
 *         <element name="myBilling" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "myBilling"
})
@XmlRootElement(name = "doMyBillingResponse")
public class DoMyBillingResponse {

    @XmlElement(required = true)
    protected String myBilling;

    /**
     * Gets the value of the myBilling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMyBilling() {
        return myBilling;
    }

    /**
     * Sets the value of the myBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMyBilling(String value) {
        this.myBilling = value;
    }

}
