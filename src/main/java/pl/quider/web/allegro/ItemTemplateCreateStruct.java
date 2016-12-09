
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemTemplateCreateStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="ItemTemplateCreateStruct">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="itemTemplateOption" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="itemTemplateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemTemplateCreateStruct", propOrder = {

})
public class ItemTemplateCreateStruct {

    protected int itemTemplateOption;
    @XmlElement(required = true)
    protected String itemTemplateName;

    /**
     * Gets the value of the itemTemplateOption property.
     * 
     */
    public int getItemTemplateOption() {
        return itemTemplateOption;
    }

    /**
     * Sets the value of the itemTemplateOption property.
     * 
     */
    public void setItemTemplateOption(int value) {
        this.itemTemplateOption = value;
    }

    /**
     * Gets the value of the itemTemplateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTemplateName() {
        return itemTemplateName;
    }

    /**
     * Sets the value of the itemTemplateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTemplateName(String value) {
        this.itemTemplateName = value;
    }

}
