
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostBuyItemInfoStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="PostBuyItemInfoStruct">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="itemId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="itemPostBuyFormInfo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostBuyItemInfoStruct", propOrder = {

})
public class PostBuyItemInfoStruct {

    protected long itemId;
    protected int itemPostBuyFormInfo;

    /**
     * Gets the value of the itemId property.
     * 
     */
    public long getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     */
    public void setItemId(long value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the itemPostBuyFormInfo property.
     * 
     */
    public int getItemPostBuyFormInfo() {
        return itemPostBuyFormInfo;
    }

    /**
     * Sets the value of the itemPostBuyFormInfo property.
     * 
     */
    public void setItemPostBuyFormInfo(int value) {
        this.itemPostBuyFormInfo = value;
    }

}
