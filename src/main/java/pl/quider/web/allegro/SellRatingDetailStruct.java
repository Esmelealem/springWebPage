
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellRatingDetailStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="SellRatingDetailStruct">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="sellRatingGroupTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sellRatingReasonsSummary" type="{urn:SandboxWebApi}ArrayOfSellratingreasonsumstruct" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellRatingDetailStruct", propOrder = {

})
public class SellRatingDetailStruct {

    @XmlElement(required = true)
    protected String sellRatingGroupTitle;
    protected ArrayOfSellratingreasonsumstruct sellRatingReasonsSummary;

    /**
     * Gets the value of the sellRatingGroupTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellRatingGroupTitle() {
        return sellRatingGroupTitle;
    }

    /**
     * Sets the value of the sellRatingGroupTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellRatingGroupTitle(String value) {
        this.sellRatingGroupTitle = value;
    }

    /**
     * Gets the value of the sellRatingReasonsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSellratingreasonsumstruct }
     *     
     */
    public ArrayOfSellratingreasonsumstruct getSellRatingReasonsSummary() {
        return sellRatingReasonsSummary;
    }

    /**
     * Sets the value of the sellRatingReasonsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSellratingreasonsumstruct }
     *     
     */
    public void setSellRatingReasonsSummary(ArrayOfSellratingreasonsumstruct value) {
        this.sellRatingReasonsSummary = value;
    }

}
