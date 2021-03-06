
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         <element name="futureItemsCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="futureItemsList" type="{urn:SandboxWebApi}ArrayOfFutureitemstruct" minOccurs="0"/>
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
    "futureItemsCounter",
    "futureItemsList"
})
@XmlRootElement(name = "doGetMyFutureItemsResponse")
public class DoGetMyFutureItemsResponse {

    protected int futureItemsCounter;
    protected ArrayOfFutureitemstruct futureItemsList;

    /**
     * Gets the value of the futureItemsCounter property.
     * 
     */
    public int getFutureItemsCounter() {
        return futureItemsCounter;
    }

    /**
     * Sets the value of the futureItemsCounter property.
     * 
     */
    public void setFutureItemsCounter(int value) {
        this.futureItemsCounter = value;
    }

    /**
     * Gets the value of the futureItemsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFutureitemstruct }
     *     
     */
    public ArrayOfFutureitemstruct getFutureItemsList() {
        return futureItemsList;
    }

    /**
     * Sets the value of the futureItemsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFutureitemstruct }
     *     
     */
    public void setFutureItemsList(ArrayOfFutureitemstruct value) {
        this.futureItemsList = value;
    }

}
