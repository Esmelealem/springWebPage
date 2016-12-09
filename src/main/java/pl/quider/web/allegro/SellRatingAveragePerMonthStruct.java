
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellRatingAveragePerMonthStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="SellRatingAveragePerMonthStruct">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="sellRatingMonth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sellRatingAverageValues" type="{urn:SandboxWebApi}ArrayOfSellratingstatsstruct" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellRatingAveragePerMonthStruct", propOrder = {

})
public class SellRatingAveragePerMonthStruct {

    @XmlElement(required = true)
    protected String sellRatingMonth;
    protected ArrayOfSellratingstatsstruct sellRatingAverageValues;

    /**
     * Gets the value of the sellRatingMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellRatingMonth() {
        return sellRatingMonth;
    }

    /**
     * Sets the value of the sellRatingMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellRatingMonth(String value) {
        this.sellRatingMonth = value;
    }

    /**
     * Gets the value of the sellRatingAverageValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSellratingstatsstruct }
     *     
     */
    public ArrayOfSellratingstatsstruct getSellRatingAverageValues() {
        return sellRatingAverageValues;
    }

    /**
     * Sets the value of the sellRatingAverageValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSellratingstatsstruct }
     *     
     */
    public void setSellRatingAverageValues(ArrayOfSellratingstatsstruct value) {
        this.sellRatingAverageValues = value;
    }

}
