
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinishItemsStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="FinishItemsStruct">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="finishItemId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="finishCancelAllBids" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="finishCancelReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinishItemsStruct", propOrder = {

})
public class FinishItemsStruct {

    protected long finishItemId;
    protected Integer finishCancelAllBids;
    protected String finishCancelReason;

    /**
     * Gets the value of the finishItemId property.
     * 
     */
    public long getFinishItemId() {
        return finishItemId;
    }

    /**
     * Sets the value of the finishItemId property.
     * 
     */
    public void setFinishItemId(long value) {
        this.finishItemId = value;
    }

    /**
     * Gets the value of the finishCancelAllBids property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFinishCancelAllBids() {
        return finishCancelAllBids;
    }

    /**
     * Sets the value of the finishCancelAllBids property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFinishCancelAllBids(Integer value) {
        this.finishCancelAllBids = value;
    }

    /**
     * Gets the value of the finishCancelReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinishCancelReason() {
        return finishCancelReason;
    }

    /**
     * Sets the value of the finishCancelReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinishCancelReason(String value) {
        this.finishCancelReason = value;
    }

}
