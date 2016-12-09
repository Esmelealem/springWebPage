
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RangeIntValueStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="RangeIntValueStruct">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="fvalueRangeIntMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="fvalueRangeIntMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangeIntValueStruct", propOrder = {

})
public class RangeIntValueStruct {

    protected Integer fvalueRangeIntMin;
    protected Integer fvalueRangeIntMax;

    /**
     * Gets the value of the fvalueRangeIntMin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFvalueRangeIntMin() {
        return fvalueRangeIntMin;
    }

    /**
     * Sets the value of the fvalueRangeIntMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFvalueRangeIntMin(Integer value) {
        this.fvalueRangeIntMin = value;
    }

    /**
     * Gets the value of the fvalueRangeIntMax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFvalueRangeIntMax() {
        return fvalueRangeIntMax;
    }

    /**
     * Sets the value of the fvalueRangeIntMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFvalueRangeIntMax(Integer value) {
        this.fvalueRangeIntMax = value;
    }

}
