
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
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sortOptions" type="{urn:SandboxWebApi}SortOptionsStruct" minOccurs="0"/>
 *         <element name="searchValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="categoryId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="itemIds" type="{urn:SandboxWebApi}ArrayOfLong" minOccurs="0"/>
 *         <element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="pageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "sessionId",
    "sortOptions",
    "searchValue",
    "categoryId",
    "itemIds",
    "pageSize",
    "pageNumber"
})
@XmlRootElement(name = "DoGetMyWatchItemsRequest")
public class DoGetMyWatchItemsRequest {

    @XmlElement(required = true)
    protected String sessionId;
    protected SortOptionsStruct sortOptions;
    protected String searchValue;
    protected Integer categoryId;
    protected ArrayOfLong itemIds;
    protected Integer pageSize;
    protected Integer pageNumber;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the sortOptions property.
     * 
     * @return
     *     possible object is
     *     {@link SortOptionsStruct }
     *     
     */
    public SortOptionsStruct getSortOptions() {
        return sortOptions;
    }

    /**
     * Sets the value of the sortOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortOptionsStruct }
     *     
     */
    public void setSortOptions(SortOptionsStruct value) {
        this.sortOptions = value;
    }

    /**
     * Gets the value of the searchValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchValue() {
        return searchValue;
    }

    /**
     * Sets the value of the searchValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchValue(String value) {
        this.searchValue = value;
    }

    /**
     * Gets the value of the categoryId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * Sets the value of the categoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCategoryId(Integer value) {
        this.categoryId = value;
    }

    /**
     * Gets the value of the itemIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getItemIds() {
        return itemIds;
    }

    /**
     * Sets the value of the itemIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setItemIds(ArrayOfLong value) {
        this.itemIds = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageSize(Integer value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageNumber(Integer value) {
        this.pageNumber = value;
    }

}
