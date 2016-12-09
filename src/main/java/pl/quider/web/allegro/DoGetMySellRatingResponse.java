
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
 *         <element name="sellRatingTotalCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="sellRatingAverage" type="{urn:SandboxWebApi}ArrayOfSellratingaveragestruct" minOccurs="0"/>
 *         <element name="sellRatingDetails" type="{urn:SandboxWebApi}ArrayOfSellratingdetailstruct" minOccurs="0"/>
 *         <element name="sellRatingStatsPerMonth" type="{urn:SandboxWebApi}ArrayOfSellratingaveragepermonthstruct" minOccurs="0"/>
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
    "sellRatingTotalCount",
    "sellRatingAverage",
    "sellRatingDetails",
    "sellRatingStatsPerMonth"
})
@XmlRootElement(name = "doGetMySellRatingResponse")
public class DoGetMySellRatingResponse {

    protected int sellRatingTotalCount;
    protected ArrayOfSellratingaveragestruct sellRatingAverage;
    protected ArrayOfSellratingdetailstruct sellRatingDetails;
    protected ArrayOfSellratingaveragepermonthstruct sellRatingStatsPerMonth;

    /**
     * Gets the value of the sellRatingTotalCount property.
     * 
     */
    public int getSellRatingTotalCount() {
        return sellRatingTotalCount;
    }

    /**
     * Sets the value of the sellRatingTotalCount property.
     * 
     */
    public void setSellRatingTotalCount(int value) {
        this.sellRatingTotalCount = value;
    }

    /**
     * Gets the value of the sellRatingAverage property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSellratingaveragestruct }
     *     
     */
    public ArrayOfSellratingaveragestruct getSellRatingAverage() {
        return sellRatingAverage;
    }

    /**
     * Sets the value of the sellRatingAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSellratingaveragestruct }
     *     
     */
    public void setSellRatingAverage(ArrayOfSellratingaveragestruct value) {
        this.sellRatingAverage = value;
    }

    /**
     * Gets the value of the sellRatingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSellratingdetailstruct }
     *     
     */
    public ArrayOfSellratingdetailstruct getSellRatingDetails() {
        return sellRatingDetails;
    }

    /**
     * Sets the value of the sellRatingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSellratingdetailstruct }
     *     
     */
    public void setSellRatingDetails(ArrayOfSellratingdetailstruct value) {
        this.sellRatingDetails = value;
    }

    /**
     * Gets the value of the sellRatingStatsPerMonth property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSellratingaveragepermonthstruct }
     *     
     */
    public ArrayOfSellratingaveragepermonthstruct getSellRatingStatsPerMonth() {
        return sellRatingStatsPerMonth;
    }

    /**
     * Sets the value of the sellRatingStatsPerMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSellratingaveragepermonthstruct }
     *     
     */
    public void setSellRatingStatsPerMonth(ArrayOfSellratingaveragepermonthstruct value) {
        this.sellRatingStatsPerMonth = value;
    }

}
