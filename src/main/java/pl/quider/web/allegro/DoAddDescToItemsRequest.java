
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
 *         <element name="itemsIdArray" type="{urn:SandboxWebApi}ArrayOfLong" minOccurs="0"/>
 *         <element name="itDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "itemsIdArray",
    "itDescription"
})
@XmlRootElement(name = "DoAddDescToItemsRequest")
public class DoAddDescToItemsRequest {

    @XmlElement(required = true)
    protected String sessionHandle;
    protected ArrayOfLong itemsIdArray;
    @XmlElement(required = true)
    protected String itDescription;

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
     * Gets the value of the itemsIdArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getItemsIdArray() {
        return itemsIdArray;
    }

    /**
     * Sets the value of the itemsIdArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setItemsIdArray(ArrayOfLong value) {
        this.itemsIdArray = value;
    }

    /**
     * Gets the value of the itDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItDescription() {
        return itDescription;
    }

    /**
     * Sets the value of the itDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItDescription(String value) {
        this.itDescription = value;
    }

}
