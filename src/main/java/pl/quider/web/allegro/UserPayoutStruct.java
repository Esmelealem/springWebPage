
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserPayoutStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="UserPayoutStruct">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="payTransId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="payTransStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="payTransAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="payTransCreateDate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="payTransRecvDate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="payTransCancelDate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="payTransReport" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserPayoutStruct", propOrder = {

})
public class UserPayoutStruct {

    protected long payTransId;
    @XmlElement(required = true)
    protected String payTransStatus;
    protected float payTransAmount;
    protected long payTransCreateDate;
    protected long payTransRecvDate;
    protected long payTransCancelDate;
    @XmlElement(required = true)
    protected String payTransReport;

    /**
     * Gets the value of the payTransId property.
     * 
     */
    public long getPayTransId() {
        return payTransId;
    }

    /**
     * Sets the value of the payTransId property.
     * 
     */
    public void setPayTransId(long value) {
        this.payTransId = value;
    }

    /**
     * Gets the value of the payTransStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayTransStatus() {
        return payTransStatus;
    }

    /**
     * Sets the value of the payTransStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayTransStatus(String value) {
        this.payTransStatus = value;
    }

    /**
     * Gets the value of the payTransAmount property.
     * 
     */
    public float getPayTransAmount() {
        return payTransAmount;
    }

    /**
     * Sets the value of the payTransAmount property.
     * 
     */
    public void setPayTransAmount(float value) {
        this.payTransAmount = value;
    }

    /**
     * Gets the value of the payTransCreateDate property.
     * 
     */
    public long getPayTransCreateDate() {
        return payTransCreateDate;
    }

    /**
     * Sets the value of the payTransCreateDate property.
     * 
     */
    public void setPayTransCreateDate(long value) {
        this.payTransCreateDate = value;
    }

    /**
     * Gets the value of the payTransRecvDate property.
     * 
     */
    public long getPayTransRecvDate() {
        return payTransRecvDate;
    }

    /**
     * Sets the value of the payTransRecvDate property.
     * 
     */
    public void setPayTransRecvDate(long value) {
        this.payTransRecvDate = value;
    }

    /**
     * Gets the value of the payTransCancelDate property.
     * 
     */
    public long getPayTransCancelDate() {
        return payTransCancelDate;
    }

    /**
     * Sets the value of the payTransCancelDate property.
     * 
     */
    public void setPayTransCancelDate(long value) {
        this.payTransCancelDate = value;
    }

    /**
     * Gets the value of the payTransReport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayTransReport() {
        return payTransReport;
    }

    /**
     * Sets the value of the payTransReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayTransReport(String value) {
        this.payTransReport = value;
    }

}
