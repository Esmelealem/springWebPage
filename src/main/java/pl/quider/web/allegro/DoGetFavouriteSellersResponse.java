//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.05 at 09:50:52 PM CET 
//


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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sFavouriteSellersList" type="{https://webapi.allegro.pl/service.php}ArrayOfFavouritessellersstruct" minOccurs="0"/&gt;
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
    "sFavouriteSellersList"
})
@XmlRootElement(name = "doGetFavouriteSellersResponse")
public class DoGetFavouriteSellersResponse {

    protected ArrayOfFavouritessellersstruct sFavouriteSellersList;

    /**
     * Gets the value of the sFavouriteSellersList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFavouritessellersstruct }
     *     
     */
    public ArrayOfFavouritessellersstruct getSFavouriteSellersList() {
        return sFavouriteSellersList;
    }

    /**
     * Sets the value of the sFavouriteSellersList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFavouritessellersstruct }
     *     
     */
    public void setSFavouriteSellersList(ArrayOfFavouritessellersstruct value) {
        this.sFavouriteSellersList = value;
    }

}
