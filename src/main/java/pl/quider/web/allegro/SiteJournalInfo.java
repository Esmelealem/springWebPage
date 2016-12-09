
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteJournalInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="SiteJournalInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="itemsNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="lastItemDate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteJournalInfo", propOrder = {

})
public class SiteJournalInfo {

    protected int itemsNumber;
    protected long lastItemDate;

    /**
     * Gets the value of the itemsNumber property.
     * 
     */
    public int getItemsNumber() {
        return itemsNumber;
    }

    /**
     * Sets the value of the itemsNumber property.
     * 
     */
    public void setItemsNumber(int value) {
        this.itemsNumber = value;
    }

    /**
     * Gets the value of the lastItemDate property.
     * 
     */
    public long getLastItemDate() {
        return lastItemDate;
    }

    /**
     * Sets the value of the lastItemDate property.
     * 
     */
    public void setLastItemDate(long value) {
        this.lastItemDate = value;
    }

}
