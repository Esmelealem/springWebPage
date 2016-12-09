
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedbackResultStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="FeedbackResultStruct">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="feItemId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="feId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="feFaultCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="feFaultDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedbackResultStruct", propOrder = {

})
public class FeedbackResultStruct {

    protected long feItemId;
    protected int feId;
    @XmlElement(required = true)
    protected String feFaultCode;
    @XmlElement(required = true)
    protected String feFaultDesc;

    /**
     * Gets the value of the feItemId property.
     * 
     */
    public long getFeItemId() {
        return feItemId;
    }

    /**
     * Sets the value of the feItemId property.
     * 
     */
    public void setFeItemId(long value) {
        this.feItemId = value;
    }

    /**
     * Gets the value of the feId property.
     * 
     */
    public int getFeId() {
        return feId;
    }

    /**
     * Sets the value of the feId property.
     * 
     */
    public void setFeId(int value) {
        this.feId = value;
    }

    /**
     * Gets the value of the feFaultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeFaultCode() {
        return feFaultCode;
    }

    /**
     * Sets the value of the feFaultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeFaultCode(String value) {
        this.feFaultCode = value;
    }

    /**
     * Gets the value of the feFaultDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeFaultDesc() {
        return feFaultDesc;
    }

    /**
     * Sets the value of the feFaultDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeFaultDesc(String value) {
        this.feFaultDesc = value;
    }

}
