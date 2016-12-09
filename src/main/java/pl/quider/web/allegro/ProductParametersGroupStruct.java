
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductParametersGroupStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="ProductParametersGroupStruct">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="productParametersGroupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="productParametersList" type="{urn:SandboxWebApi}ArrayOfProductparametersstruct" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductParametersGroupStruct", propOrder = {

})
public class ProductParametersGroupStruct {

    @XmlElement(required = true)
    protected String productParametersGroupName;
    protected ArrayOfProductparametersstruct productParametersList;

    /**
     * Gets the value of the productParametersGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductParametersGroupName() {
        return productParametersGroupName;
    }

    /**
     * Sets the value of the productParametersGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductParametersGroupName(String value) {
        this.productParametersGroupName = value;
    }

    /**
     * Gets the value of the productParametersList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductparametersstruct }
     *     
     */
    public ArrayOfProductparametersstruct getProductParametersList() {
        return productParametersList;
    }

    /**
     * Sets the value of the productParametersList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductparametersstruct }
     *     
     */
    public void setProductParametersList(ArrayOfProductparametersstruct value) {
        this.productParametersList = value;
    }

}
