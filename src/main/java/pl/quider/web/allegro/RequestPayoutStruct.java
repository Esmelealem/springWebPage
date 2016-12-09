
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestPayoutStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="RequestPayoutStruct">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="payoutId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="payoutAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="payoutTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestPayoutStruct", propOrder = {

})
public class RequestPayoutStruct {

    protected long payoutId;
    protected float payoutAmount;
    protected long payoutTime;

    /**
     * Gets the value of the payoutId property.
     * 
     */
    public long getPayoutId() {
        return payoutId;
    }

    /**
     * Sets the value of the payoutId property.
     * 
     */
    public void setPayoutId(long value) {
        this.payoutId = value;
    }

    /**
     * Gets the value of the payoutAmount property.
     * 
     */
    public float getPayoutAmount() {
        return payoutAmount;
    }

    /**
     * Sets the value of the payoutAmount property.
     * 
     */
    public void setPayoutAmount(float value) {
        this.payoutAmount = value;
    }

    /**
     * Gets the value of the payoutTime property.
     * 
     */
    public long getPayoutTime() {
        return payoutTime;
    }

    /**
     * Sets the value of the payoutTime property.
     * 
     */
    public void setPayoutTime(long value) {
        this.payoutTime = value;
    }

}
