
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
 *         <element name="feedbackType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="offset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="desc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="itemsArray" type="{urn:SandboxWebApi}ArrayOfLong" minOccurs="0"/>
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
    "feedbackType",
    "offset",
    "desc",
    "itemsArray"
})
@XmlRootElement(name = "DoMyFeedback2Request")
public class DoMyFeedback2Request {

    @XmlElement(required = true)
    protected String sessionHandle;
    @XmlElement(required = true)
    protected String feedbackType;
    protected Integer offset;
    protected Integer desc;
    protected ArrayOfLong itemsArray;

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
     * Gets the value of the feedbackType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedbackType() {
        return feedbackType;
    }

    /**
     * Sets the value of the feedbackType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedbackType(String value) {
        this.feedbackType = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOffset(Integer value) {
        this.offset = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDesc(Integer value) {
        this.desc = value;
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

}
