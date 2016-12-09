
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoriesListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="CategoriesListType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="categoriesTree" type="{urn:SandboxWebApi}ArrayOfCategorytreetype" minOccurs="0"/>
 *         <element name="categoriesPath" type="{urn:SandboxWebApi}ArrayOfCategorypathtype" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoriesListType", propOrder = {

})
public class CategoriesListType {

    protected ArrayOfCategorytreetype categoriesTree;
    protected ArrayOfCategorypathtype categoriesPath;

    /**
     * Gets the value of the categoriesTree property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCategorytreetype }
     *     
     */
    public ArrayOfCategorytreetype getCategoriesTree() {
        return categoriesTree;
    }

    /**
     * Sets the value of the categoriesTree property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCategorytreetype }
     *     
     */
    public void setCategoriesTree(ArrayOfCategorytreetype value) {
        this.categoriesTree = value;
    }

    /**
     * Gets the value of the categoriesPath property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCategorypathtype }
     *     
     */
    public ArrayOfCategorypathtype getCategoriesPath() {
        return categoriesPath;
    }

    /**
     * Sets the value of the categoriesPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCategorypathtype }
     *     
     */
    public void setCategoriesPath(ArrayOfCategorypathtype value) {
        this.categoriesPath = value;
    }

}
