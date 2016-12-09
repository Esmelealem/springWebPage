
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelatedItemsStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="RelatedItemsStruct">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="relatedItemsInfo" type="{urn:SandboxWebApi}ArrayOfRelateditemstruct" minOccurs="0"/>
 *         <element name="relatedItemsAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedItemsStruct", propOrder = {

})
public class RelatedItemsStruct {

    protected ArrayOfRelateditemstruct relatedItemsInfo;
    protected float relatedItemsAmount;

    /**
     * Gets the value of the relatedItemsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRelateditemstruct }
     *     
     */
    public ArrayOfRelateditemstruct getRelatedItemsInfo() {
        return relatedItemsInfo;
    }

    /**
     * Sets the value of the relatedItemsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRelateditemstruct }
     *     
     */
    public void setRelatedItemsInfo(ArrayOfRelateditemstruct value) {
        this.relatedItemsInfo = value;
    }

    /**
     * Gets the value of the relatedItemsAmount property.
     * 
     */
    public float getRelatedItemsAmount() {
        return relatedItemsAmount;
    }

    /**
     * Sets the value of the relatedItemsAmount property.
     * 
     */
    public void setRelatedItemsAmount(float value) {
        this.relatedItemsAmount = value;
    }

}
