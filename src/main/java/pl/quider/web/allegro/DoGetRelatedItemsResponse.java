//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.05 at 09:50:52 PM CET 
//


package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="relatedItems" type="{https://webapi.allegro.pl/service.php}RelatedItemsStruct"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "relatedItems"
})
@XmlRootElement(name = "doGetRelatedItemsResponse")
public class DoGetRelatedItemsResponse {

    @XmlElement(required = true)
    protected RelatedItemsStruct relatedItems;

    /**
     * Gets the value of the relatedItems property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedItemsStruct }
     *     
     */
    public RelatedItemsStruct getRelatedItems() {
        return relatedItems;
    }

    /**
     * Sets the value of the relatedItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedItemsStruct }
     *     
     */
    public void setRelatedItems(RelatedItemsStruct value) {
        this.relatedItems = value;
    }

}
