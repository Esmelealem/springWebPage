
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         <element name="payTransIncome" type="{urn:SandboxWebApi}ArrayOfUserincomingpaymentstruct" minOccurs="0"/>
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
    "payTransIncome"
})
@XmlRootElement(name = "doGetMyIncomingPaymentsResponse")
public class DoGetMyIncomingPaymentsResponse {

    protected ArrayOfUserincomingpaymentstruct payTransIncome;

    /**
     * Gets the value of the payTransIncome property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUserincomingpaymentstruct }
     *     
     */
    public ArrayOfUserincomingpaymentstruct getPayTransIncome() {
        return payTransIncome;
    }

    /**
     * Sets the value of the payTransIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUserincomingpaymentstruct }
     *     
     */
    public void setPayTransIncome(ArrayOfUserincomingpaymentstruct value) {
        this.payTransIncome = value;
    }

}
