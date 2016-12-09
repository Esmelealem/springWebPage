
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemovedItemTemplatesStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="RemovedItemTemplatesStruct">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="itemTemplateIds" type="{urn:SandboxWebApi}ArrayOfInt" minOccurs="0"/>
 *         <element name="itemTemplateIncorrectIds" type="{urn:SandboxWebApi}ArrayOfInt" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemovedItemTemplatesStruct", propOrder = {

})
public class RemovedItemTemplatesStruct {

    protected ArrayOfInt itemTemplateIds;
    protected ArrayOfInt itemTemplateIncorrectIds;

    /**
     * Gets the value of the itemTemplateIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getItemTemplateIds() {
        return itemTemplateIds;
    }

    /**
     * Sets the value of the itemTemplateIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setItemTemplateIds(ArrayOfInt value) {
        this.itemTemplateIds = value;
    }

    /**
     * Gets the value of the itemTemplateIncorrectIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getItemTemplateIncorrectIds() {
        return itemTemplateIncorrectIds;
    }

    /**
     * Sets the value of the itemTemplateIncorrectIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setItemTemplateIncorrectIds(ArrayOfInt value) {
        this.itemTemplateIncorrectIds = value;
    }

}
