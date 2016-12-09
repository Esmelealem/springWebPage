
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CatInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="CatInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="catId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="catName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="catParent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="catPosition" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="catIsProductCatalogueEnabled" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatInfoType", propOrder = {

})
public class CatInfoType {

    protected int catId;
    @XmlElement(required = true)
    protected String catName;
    protected int catParent;
    protected int catPosition;
    protected int catIsProductCatalogueEnabled;

    /**
     * Gets the value of the catId property.
     * 
     */
    public int getCatId() {
        return catId;
    }

    /**
     * Sets the value of the catId property.
     * 
     */
    public void setCatId(int value) {
        this.catId = value;
    }

    /**
     * Gets the value of the catName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatName() {
        return catName;
    }

    /**
     * Sets the value of the catName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatName(String value) {
        this.catName = value;
    }

    /**
     * Gets the value of the catParent property.
     * 
     */
    public int getCatParent() {
        return catParent;
    }

    /**
     * Sets the value of the catParent property.
     * 
     */
    public void setCatParent(int value) {
        this.catParent = value;
    }

    /**
     * Gets the value of the catPosition property.
     * 
     */
    public int getCatPosition() {
        return catPosition;
    }

    /**
     * Sets the value of the catPosition property.
     * 
     */
    public void setCatPosition(int value) {
        this.catPosition = value;
    }

    /**
     * Gets the value of the catIsProductCatalogueEnabled property.
     * 
     */
    public int getCatIsProductCatalogueEnabled() {
        return catIsProductCatalogueEnabled;
    }

    /**
     * Sets the value of the catIsProductCatalogueEnabled property.
     * 
     */
    public void setCatIsProductCatalogueEnabled(int value) {
        this.catIsProductCatalogueEnabled = value;
    }

}
