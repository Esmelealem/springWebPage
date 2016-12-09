
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellRatingInfoStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="SellRatingInfoStruct">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="sellRatingGroupId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="sellRatingGroupTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sellRatingReasons" type="{urn:SandboxWebApi}ArrayOfSellratingreasonstruct" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellRatingInfoStruct", propOrder = {

})
public class SellRatingInfoStruct {

    protected int sellRatingGroupId;
    @XmlElement(required = true)
    protected String sellRatingGroupTitle;
    protected ArrayOfSellratingreasonstruct sellRatingReasons;

    /**
     * Gets the value of the sellRatingGroupId property.
     * 
     */
    public int getSellRatingGroupId() {
        return sellRatingGroupId;
    }

    /**
     * Sets the value of the sellRatingGroupId property.
     * 
     */
    public void setSellRatingGroupId(int value) {
        this.sellRatingGroupId = value;
    }

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
     * Gets the value of the sellRatingReasons property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSellratingreasonstruct }
     *     
     */
    public ArrayOfSellratingreasonstruct getSellRatingReasons() {
        return sellRatingReasons;
    }

    /**
     * Sets the value of the sellRatingReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSellratingreasonstruct }
     *     
     */
    public void setSellRatingReasons(ArrayOfSellratingreasonstruct value) {
        this.sellRatingReasons = value;
    }

}
