
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellRatingAverageStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="SellRatingAverageStruct">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="sellRatingGroupTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sellRatingGroupAverage" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellRatingAverageStruct", propOrder = {

})
public class SellRatingAverageStruct {

    @XmlElement(required = true)
    protected String sellRatingGroupTitle;
    protected float sellRatingGroupAverage;

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
     * Gets the value of the sellRatingGroupAverage property.
     * 
     */
    public float getSellRatingGroupAverage() {
        return sellRatingGroupAverage;
    }

    /**
     * Sets the value of the sellRatingGroupAverage property.
     * 
     */
    public void setSellRatingGroupAverage(float value) {
        this.sellRatingGroupAverage = value;
    }

}
