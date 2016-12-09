
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WatchItemStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="WatchItemStruct">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="itemId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="itemTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="itemThumbnailUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="itemPrice" type="{urn:SandboxWebApi}ArrayOfItempricestruct" minOccurs="0"/>
 *         <element name="itemLeftQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="itemQuantityType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="itemEndTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="itemEndTimeLeft" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="itemSeller" type="{urn:SandboxWebApi}UserInfoStruct"/>
 *         <element name="itemBiddersCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="itemHighestBidder" type="{urn:SandboxWebApi}UserInfoStruct"/>
 *         <element name="itemCategoryId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="itemViewsCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="itemNote" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="itemSpecialInfo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="itemShopInfo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="itemProductInfo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="itemPayuInfo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="itemReminder" type="{urn:SandboxWebApi}ArrayOfItemreminderstruct" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WatchItemStruct", propOrder = {

})
public class WatchItemStruct {

    protected long itemId;
    @XmlElement(required = true)
    protected String itemTitle;
    @XmlElement(required = true)
    protected String itemThumbnailUrl;
    protected ArrayOfItempricestruct itemPrice;
    protected int itemLeftQuantity;
    protected int itemQuantityType;
    @XmlElement(required = true)
    protected String itemEndTime;
    @XmlElement(required = true)
    protected String itemEndTimeLeft;
    @XmlElement(required = true)
    protected UserInfoStruct itemSeller;
    protected int itemBiddersCounter;
    @XmlElement(required = true)
    protected UserInfoStruct itemHighestBidder;
    protected int itemCategoryId;
    protected int itemViewsCounter;
    @XmlElement(required = true)
    protected String itemNote;
    protected int itemSpecialInfo;
    protected int itemShopInfo;
    protected long itemProductInfo;
    protected int itemPayuInfo;
    protected ArrayOfItemreminderstruct itemReminder;

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
     * Gets the value of the itemTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTitle() {
        return itemTitle;
    }

    /**
     * Sets the value of the itemTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTitle(String value) {
        this.itemTitle = value;
    }

    /**
     * Gets the value of the itemThumbnailUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemThumbnailUrl() {
        return itemThumbnailUrl;
    }

    /**
     * Sets the value of the itemThumbnailUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemThumbnailUrl(String value) {
        this.itemThumbnailUrl = value;
    }

    /**
     * Gets the value of the itemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItempricestruct }
     *     
     */
    public ArrayOfItempricestruct getItemPrice() {
        return itemPrice;
    }

    /**
     * Sets the value of the itemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItempricestruct }
     *     
     */
    public void setItemPrice(ArrayOfItempricestruct value) {
        this.itemPrice = value;
    }

    /**
     * Gets the value of the itemLeftQuantity property.
     * 
     */
    public int getItemLeftQuantity() {
        return itemLeftQuantity;
    }

    /**
     * Sets the value of the itemLeftQuantity property.
     * 
     */
    public void setItemLeftQuantity(int value) {
        this.itemLeftQuantity = value;
    }

    /**
     * Gets the value of the itemQuantityType property.
     * 
     */
    public int getItemQuantityType() {
        return itemQuantityType;
    }

    /**
     * Sets the value of the itemQuantityType property.
     * 
     */
    public void setItemQuantityType(int value) {
        this.itemQuantityType = value;
    }

    /**
     * Gets the value of the itemEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemEndTime() {
        return itemEndTime;
    }

    /**
     * Sets the value of the itemEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemEndTime(String value) {
        this.itemEndTime = value;
    }

    /**
     * Gets the value of the itemEndTimeLeft property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemEndTimeLeft() {
        return itemEndTimeLeft;
    }

    /**
     * Sets the value of the itemEndTimeLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemEndTimeLeft(String value) {
        this.itemEndTimeLeft = value;
    }

    /**
     * Gets the value of the itemSeller property.
     * 
     * @return
     *     possible object is
     *     {@link UserInfoStruct }
     *     
     */
    public UserInfoStruct getItemSeller() {
        return itemSeller;
    }

    /**
     * Sets the value of the itemSeller property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInfoStruct }
     *     
     */
    public void setItemSeller(UserInfoStruct value) {
        this.itemSeller = value;
    }

    /**
     * Gets the value of the itemBiddersCounter property.
     * 
     */
    public int getItemBiddersCounter() {
        return itemBiddersCounter;
    }

    /**
     * Sets the value of the itemBiddersCounter property.
     * 
     */
    public void setItemBiddersCounter(int value) {
        this.itemBiddersCounter = value;
    }

    /**
     * Gets the value of the itemHighestBidder property.
     * 
     * @return
     *     possible object is
     *     {@link UserInfoStruct }
     *     
     */
    public UserInfoStruct getItemHighestBidder() {
        return itemHighestBidder;
    }

    /**
     * Sets the value of the itemHighestBidder property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInfoStruct }
     *     
     */
    public void setItemHighestBidder(UserInfoStruct value) {
        this.itemHighestBidder = value;
    }

    /**
     * Gets the value of the itemCategoryId property.
     * 
     */
    public int getItemCategoryId() {
        return itemCategoryId;
    }

    /**
     * Sets the value of the itemCategoryId property.
     * 
     */
    public void setItemCategoryId(int value) {
        this.itemCategoryId = value;
    }

    /**
     * Gets the value of the itemViewsCounter property.
     * 
     */
    public int getItemViewsCounter() {
        return itemViewsCounter;
    }

    /**
     * Sets the value of the itemViewsCounter property.
     * 
     */
    public void setItemViewsCounter(int value) {
        this.itemViewsCounter = value;
    }

    /**
     * Gets the value of the itemNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemNote() {
        return itemNote;
    }

    /**
     * Sets the value of the itemNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemNote(String value) {
        this.itemNote = value;
    }

    /**
     * Gets the value of the itemSpecialInfo property.
     * 
     */
    public int getItemSpecialInfo() {
        return itemSpecialInfo;
    }

    /**
     * Sets the value of the itemSpecialInfo property.
     * 
     */
    public void setItemSpecialInfo(int value) {
        this.itemSpecialInfo = value;
    }

    /**
     * Gets the value of the itemShopInfo property.
     * 
     */
    public int getItemShopInfo() {
        return itemShopInfo;
    }

    /**
     * Sets the value of the itemShopInfo property.
     * 
     */
    public void setItemShopInfo(int value) {
        this.itemShopInfo = value;
    }

    /**
     * Gets the value of the itemProductInfo property.
     * 
     */
    public long getItemProductInfo() {
        return itemProductInfo;
    }

    /**
     * Sets the value of the itemProductInfo property.
     * 
     */
    public void setItemProductInfo(long value) {
        this.itemProductInfo = value;
    }

    /**
     * Gets the value of the itemPayuInfo property.
     * 
     */
    public int getItemPayuInfo() {
        return itemPayuInfo;
    }

    /**
     * Sets the value of the itemPayuInfo property.
     * 
     */
    public void setItemPayuInfo(int value) {
        this.itemPayuInfo = value;
    }

    /**
     * Gets the value of the itemReminder property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemreminderstruct }
     *     
     */
    public ArrayOfItemreminderstruct getItemReminder() {
        return itemReminder;
    }

    /**
     * Sets the value of the itemReminder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemreminderstruct }
     *     
     */
    public void setItemReminder(ArrayOfItemreminderstruct value) {
        this.itemReminder = value;
    }

}
