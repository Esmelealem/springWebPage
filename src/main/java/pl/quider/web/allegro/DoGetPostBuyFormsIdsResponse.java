
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
 *         <element name="formsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="formsIds" type="{urn:SandboxWebApi}ArrayOfLong" minOccurs="0"/>
 *         <element name="filtersList" type="{urn:SandboxWebApi}ArrayOfFilterslisttype" minOccurs="0"/>
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
    "formsCount",
    "formsIds",
    "filtersList"
})
@XmlRootElement(name = "doGetPostBuyFormsIdsResponse")
public class DoGetPostBuyFormsIdsResponse {

    protected int formsCount;
    protected ArrayOfLong formsIds;
    protected ArrayOfFilterslisttype filtersList;

    /**
     * Gets the value of the formsCount property.
     * 
     */
    public int getFormsCount() {
        return formsCount;
    }

    /**
     * Sets the value of the formsCount property.
     * 
     */
    public void setFormsCount(int value) {
        this.formsCount = value;
    }

    /**
     * Gets the value of the formsIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getFormsIds() {
        return formsIds;
    }

    /**
     * Sets the value of the formsIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setFormsIds(ArrayOfLong value) {
        this.formsIds = value;
    }

    /**
     * Gets the value of the filtersList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFilterslisttype }
     *     
     */
    public ArrayOfFilterslisttype getFiltersList() {
        return filtersList;
    }

    /**
     * Sets the value of the filtersList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFilterslisttype }
     *     
     */
    public void setFiltersList(ArrayOfFilterslisttype value) {
        this.filtersList = value;
    }

}
