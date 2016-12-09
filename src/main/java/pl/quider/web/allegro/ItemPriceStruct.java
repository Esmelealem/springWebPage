
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemPriceStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="ItemPriceStruct">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="priceType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="priceValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemPriceStruct", propOrder = {

})
public class ItemPriceStruct {

    protected int priceType;
    protected float priceValue;

    /**
     * Gets the value of the priceType property.
     * 
     */
    public int getPriceType() {
        return priceType;
    }

    /**
     * Sets the value of the priceType property.
     * 
     */
    public void setPriceType(int value) {
        this.priceType = value;
    }

    /**
     * Gets the value of the priceValue property.
     * 
     */
    public float getPriceValue() {
        return priceValue;
    }

    /**
     * Sets the value of the priceValue property.
     * 
     */
    public void setPriceValue(float value) {
        this.priceValue = value;
    }

}
