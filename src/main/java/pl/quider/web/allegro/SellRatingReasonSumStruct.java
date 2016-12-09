
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellRatingReasonSumStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="SellRatingReasonSumStruct">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="sellRatingReasonTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sellRatingReasonCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellRatingReasonSumStruct", propOrder = {

})
public class SellRatingReasonSumStruct {

    @XmlElement(required = true)
    protected String sellRatingReasonTitle;
    protected int sellRatingReasonCount;

    /**
     * Gets the value of the sellRatingReasonTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellRatingReasonTitle() {
        return sellRatingReasonTitle;
    }

    /**
     * Sets the value of the sellRatingReasonTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellRatingReasonTitle(String value) {
        this.sellRatingReasonTitle = value;
    }

    /**
     * Gets the value of the sellRatingReasonCount property.
     * 
     */
    public int getSellRatingReasonCount() {
        return sellRatingReasonCount;
    }

    /**
     * Sets the value of the sellRatingReasonCount property.
     * 
     */
    public void setSellRatingReasonCount(int value) {
        this.sellRatingReasonCount = value;
    }

}
