
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         <element name="sessionHandle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="itemsArray" type="{urn:SandboxWebApi}ArrayOfLong" minOccurs="0"/>
 *         <element name="buyerFilterArray" type="{urn:SandboxWebApi}ArrayOfLong" minOccurs="0"/>
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
    "sessionHandle",
    "itemsArray",
    "buyerFilterArray"
})
@XmlRootElement(name = "DoGetPostBuyDataRequest")
public class DoGetPostBuyDataRequest {

    @XmlElement(required = true)
    protected String sessionHandle;
    protected ArrayOfLong itemsArray;
    protected ArrayOfLong buyerFilterArray;

    /**
     * Gets the value of the sessionHandle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionHandle() {
        return sessionHandle;
    }

    /**
     * Sets the value of the sessionHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionHandle(String value) {
        this.sessionHandle = value;
    }

    /**
     * Gets the value of the itemsArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getItemsArray() {
        return itemsArray;
    }

    /**
     * Sets the value of the itemsArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setItemsArray(ArrayOfLong value) {
        this.itemsArray = value;
    }

    /**
     * Gets the value of the buyerFilterArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getBuyerFilterArray() {
        return buyerFilterArray;
    }

    /**
     * Sets the value of the buyerFilterArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setBuyerFilterArray(ArrayOfLong value) {
        this.buyerFilterArray = value;
    }

}
