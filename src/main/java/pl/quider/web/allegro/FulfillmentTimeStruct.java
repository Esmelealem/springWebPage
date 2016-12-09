
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FulfillmentTimeStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="FulfillmentTimeStruct">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="fulfillmentTimeFrom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="fulfillmentTimeTo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FulfillmentTimeStruct", propOrder = {

})
public class FulfillmentTimeStruct {

    protected int fulfillmentTimeFrom;
    protected int fulfillmentTimeTo;

    /**
     * Gets the value of the fulfillmentTimeFrom property.
     * 
     */
    public int getFulfillmentTimeFrom() {
        return fulfillmentTimeFrom;
    }

    /**
     * Sets the value of the fulfillmentTimeFrom property.
     * 
     */
    public void setFulfillmentTimeFrom(int value) {
        this.fulfillmentTimeFrom = value;
    }

    /**
     * Gets the value of the fulfillmentTimeTo property.
     * 
     */
    public int getFulfillmentTimeTo() {
        return fulfillmentTimeTo;
    }

    /**
     * Sets the value of the fulfillmentTimeTo property.
     * 
     */
    public void setFulfillmentTimeTo(int value) {
        this.fulfillmentTimeTo = value;
    }

}
