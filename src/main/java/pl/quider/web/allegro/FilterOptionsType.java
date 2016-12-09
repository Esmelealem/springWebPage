
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="FilterOptionsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="filterId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="filterValueId" type="{urn:SandboxWebApi}ArrayOfString" minOccurs="0"/>
 *         <element name="filterValueRange" type="{urn:SandboxWebApi}RangeValueType" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterOptionsType", propOrder = {

})
public class FilterOptionsType {

    @XmlElement(required = true)
    protected String filterId;
    protected ArrayOfString filterValueId;
    protected RangeValueType filterValueRange;

    /**
     * Gets the value of the filterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterId() {
        return filterId;
    }

    /**
     * Sets the value of the filterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterId(String value) {
        this.filterId = value;
    }

    /**
     * Gets the value of the filterValueId property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getFilterValueId() {
        return filterValueId;
    }

    /**
     * Sets the value of the filterValueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setFilterValueId(ArrayOfString value) {
        this.filterValueId = value;
    }

    /**
     * Gets the value of the filterValueRange property.
     * 
     * @return
     *     possible object is
     *     {@link RangeValueType }
     *     
     */
    public RangeValueType getFilterValueRange() {
        return filterValueRange;
    }

    /**
     * Sets the value of the filterValueRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeValueType }
     *     
     */
    public void setFilterValueRange(RangeValueType value) {
        this.filterValueRange = value;
    }

}