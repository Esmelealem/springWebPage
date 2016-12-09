
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostBuyFormItemDealsVariantStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="PostBuyFormItemDealsVariantStruct">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="variantName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="variantValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostBuyFormItemDealsVariantStruct", propOrder = {

})
public class PostBuyFormItemDealsVariantStruct {

    @XmlElement(required = true)
    protected String variantName;
    @XmlElement(required = true)
    protected String variantValue;

    /**
     * Gets the value of the variantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariantName() {
        return variantName;
    }

    /**
     * Sets the value of the variantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariantName(String value) {
        this.variantName = value;
    }

    /**
     * Gets the value of the variantValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariantValue() {
        return variantValue;
    }

    /**
     * Sets the value of the variantValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariantValue(String value) {
        this.variantValue = value;
    }

}
