
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemTemplateListStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="ItemTemplateListStruct">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="itemTemplateId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="itemTemplateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="itemTemplateFields" type="{urn:SandboxWebApi}ArrayOfFieldsvalue" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemTemplateListStruct", propOrder = {

})
public class ItemTemplateListStruct {

    protected int itemTemplateId;
    @XmlElement(required = true)
    protected String itemTemplateName;
    protected ArrayOfFieldsvalue itemTemplateFields;

    /**
     * Gets the value of the itemTemplateId property.
     * 
     */
    public int getItemTemplateId() {
        return itemTemplateId;
    }

    /**
     * Sets the value of the itemTemplateId property.
     * 
     */
    public void setItemTemplateId(int value) {
        this.itemTemplateId = value;
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

    /**
     * Gets the value of the itemTemplateFields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFieldsvalue }
     *     
     */
    public ArrayOfFieldsvalue getItemTemplateFields() {
        return itemTemplateFields;
    }

    /**
     * Sets the value of the itemTemplateFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFieldsvalue }
     *     
     */
    public void setItemTemplateFields(ArrayOfFieldsvalue value) {
        this.itemTemplateFields = value;
    }

}
