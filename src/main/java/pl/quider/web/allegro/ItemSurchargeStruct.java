
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemSurchargeStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="ItemSurchargeStruct">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="surchargeDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="surchargeAmount" type="{urn:SandboxWebApi}AmountStruct"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemSurchargeStruct", propOrder = {

})
public class ItemSurchargeStruct {

    @XmlElement(required = true)
    protected String surchargeDescription;
    @XmlElement(required = true)
    protected AmountStruct surchargeAmount;

    /**
     * Gets the value of the surchargeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurchargeDescription() {
        return surchargeDescription;
    }

    /**
     * Sets the value of the surchargeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurchargeDescription(String value) {
        this.surchargeDescription = value;
    }

    /**
     * Gets the value of the surchargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountStruct }
     *     
     */
    public AmountStruct getSurchargeAmount() {
        return surchargeAmount;
    }

    /**
     * Sets the value of the surchargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountStruct }
     *     
     */
    public void setSurchargeAmount(AmountStruct value) {
        this.surchargeAmount = value;
    }

}
