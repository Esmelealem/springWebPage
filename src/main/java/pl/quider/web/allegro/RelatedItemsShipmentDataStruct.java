
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelatedItemsShipmentDataStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="RelatedItemsShipmentDataStruct">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="sellerShipmentData" type="{urn:SandboxWebApi}ArrayOfSellershipmentdatastruct" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedItemsShipmentDataStruct", propOrder = {

})
public class RelatedItemsShipmentDataStruct {

    protected ArrayOfSellershipmentdatastruct sellerShipmentData;

    /**
     * Gets the value of the sellerShipmentData property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSellershipmentdatastruct }
     *     
     */
    public ArrayOfSellershipmentdatastruct getSellerShipmentData() {
        return sellerShipmentData;
    }

    /**
     * Sets the value of the sellerShipmentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSellershipmentdatastruct }
     *     
     */
    public void setSellerShipmentData(ArrayOfSellershipmentdatastruct value) {
        this.sellerShipmentData = value;
    }

}
