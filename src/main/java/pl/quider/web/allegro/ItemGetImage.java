//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.05 at 09:50:52 PM CET 
//


package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemGetImage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="ItemGetImage">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="itId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="itSellerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="itFotoCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemGetImage", propOrder = {

})
public class ItemGetImage {

    protected long itId;
    protected long itSellerId;
    protected int itFotoCount;

    /**
     * Gets the value of the itId property.
     * 
     */
    public long getItId() {
        return itId;
    }

    /**
     * Sets the value of the itId property.
     * 
     */
    public void setItId(long value) {
        this.itId = value;
    }

    /**
     * Gets the value of the itSellerId property.
     * 
     */
    public long getItSellerId() {
        return itSellerId;
    }

    /**
     * Sets the value of the itSellerId property.
     * 
     */
    public void setItSellerId(long value) {
        this.itSellerId = value;
    }

    /**
     * Gets the value of the itFotoCount property.
     * 
     */
    public int getItFotoCount() {
        return itFotoCount;
    }

    /**
     * Sets the value of the itFotoCount property.
     * 
     */
    public void setItFotoCount(int value) {
        this.itFotoCount = value;
    }

}
