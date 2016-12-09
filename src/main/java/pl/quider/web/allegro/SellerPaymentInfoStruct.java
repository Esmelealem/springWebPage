
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellerPaymentInfoStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="SellerPaymentInfoStruct">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="shipmentPaymentInfoPza" type="{urn:SandboxWebApi}ArrayOfShipmentpaymentinfostruct" minOccurs="0"/>
 *         <element name="shipmentPaymentInfoNonPza" type="{urn:SandboxWebApi}ArrayOfShipmentpaymentinfostruct" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellerPaymentInfoStruct", propOrder = {

})
public class SellerPaymentInfoStruct {

    protected ArrayOfShipmentpaymentinfostruct shipmentPaymentInfoPza;
    protected ArrayOfShipmentpaymentinfostruct shipmentPaymentInfoNonPza;

    /**
     * Gets the value of the shipmentPaymentInfoPza property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfShipmentpaymentinfostruct }
     *     
     */
    public ArrayOfShipmentpaymentinfostruct getShipmentPaymentInfoPza() {
        return shipmentPaymentInfoPza;
    }

    /**
     * Sets the value of the shipmentPaymentInfoPza property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfShipmentpaymentinfostruct }
     *     
     */
    public void setShipmentPaymentInfoPza(ArrayOfShipmentpaymentinfostruct value) {
        this.shipmentPaymentInfoPza = value;
    }

    /**
     * Gets the value of the shipmentPaymentInfoNonPza property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfShipmentpaymentinfostruct }
     *     
     */
    public ArrayOfShipmentpaymentinfostruct getShipmentPaymentInfoNonPza() {
        return shipmentPaymentInfoNonPza;
    }

    /**
     * Sets the value of the shipmentPaymentInfoNonPza property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfShipmentpaymentinfostruct }
     *     
     */
    public void setShipmentPaymentInfoNonPza(ArrayOfShipmentpaymentinfostruct value) {
        this.shipmentPaymentInfoNonPza = value;
    }

}
