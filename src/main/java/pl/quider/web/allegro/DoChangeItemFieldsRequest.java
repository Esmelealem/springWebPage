
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
 *         <element name="itemId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="fieldsToModify" type="{urn:SandboxWebApi}ArrayOfFieldsvalue" minOccurs="0"/>
 *         <element name="fieldsToRemove" type="{urn:SandboxWebApi}ArrayOfInt" minOccurs="0"/>
 *         <element name="previewOnly" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="variants" type="{urn:SandboxWebApi}ArrayOfVariantstruct" minOccurs="0"/>
 *         <element name="tags" type="{urn:SandboxWebApi}ArrayOfTagnamestruct" minOccurs="0"/>
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
    "itemId",
    "fieldsToModify",
    "fieldsToRemove",
    "previewOnly",
    "variants",
    "tags"
})
@XmlRootElement(name = "DoChangeItemFieldsRequest")
public class DoChangeItemFieldsRequest {

    @XmlElement(required = true)
    protected String sessionId;
    protected long itemId;
    protected ArrayOfFieldsvalue fieldsToModify;
    protected ArrayOfInt fieldsToRemove;
    protected Integer previewOnly;
    protected ArrayOfVariantstruct variants;
    protected ArrayOfTagnamestruct tags;

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
     * Gets the value of the fieldsToModify property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFieldsvalue }
     *     
     */
    public ArrayOfFieldsvalue getFieldsToModify() {
        return fieldsToModify;
    }

    /**
     * Sets the value of the fieldsToModify property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFieldsvalue }
     *     
     */
    public void setFieldsToModify(ArrayOfFieldsvalue value) {
        this.fieldsToModify = value;
    }

    /**
     * Gets the value of the fieldsToRemove property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getFieldsToRemove() {
        return fieldsToRemove;
    }

    /**
     * Sets the value of the fieldsToRemove property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setFieldsToRemove(ArrayOfInt value) {
        this.fieldsToRemove = value;
    }

    /**
     * Gets the value of the previewOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPreviewOnly() {
        return previewOnly;
    }

    /**
     * Sets the value of the previewOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPreviewOnly(Integer value) {
        this.previewOnly = value;
    }

    /**
     * Gets the value of the variants property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVariantstruct }
     *     
     */
    public ArrayOfVariantstruct getVariants() {
        return variants;
    }

    /**
     * Sets the value of the variants property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVariantstruct }
     *     
     */
    public void setVariants(ArrayOfVariantstruct value) {
        this.variants = value;
    }

    /**
     * Gets the value of the tags property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTagnamestruct }
     *     
     */
    public ArrayOfTagnamestruct getTags() {
        return tags;
    }

    /**
     * Sets the value of the tags property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTagnamestruct }
     *     
     */
    public void setTags(ArrayOfTagnamestruct value) {
        this.tags = value;
    }

}
