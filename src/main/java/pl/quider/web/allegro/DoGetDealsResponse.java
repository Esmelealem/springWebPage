
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
 *         <element name="dealsList" type="{urn:SandboxWebApi}ArrayOfDealsstruct" minOccurs="0"/>
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
    "dealsList"
})
@XmlRootElement(name = "doGetDealsResponse")
public class DoGetDealsResponse {

    protected ArrayOfDealsstruct dealsList;

    /**
     * Gets the value of the dealsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDealsstruct }
     *     
     */
    public ArrayOfDealsstruct getDealsList() {
        return dealsList;
    }

    /**
     * Sets the value of the dealsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDealsstruct }
     *     
     */
    public void setDealsList(ArrayOfDealsstruct value) {
        this.dealsList = value;
    }

}
