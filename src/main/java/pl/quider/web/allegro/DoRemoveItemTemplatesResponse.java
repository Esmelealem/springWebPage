
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
 *         <element name="removedItemTemplates" type="{urn:SandboxWebApi}RemovedItemTemplatesStruct"/>
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
    "removedItemTemplates"
})
@XmlRootElement(name = "doRemoveItemTemplatesResponse")
public class DoRemoveItemTemplatesResponse {

    @XmlElement(required = true)
    protected RemovedItemTemplatesStruct removedItemTemplates;

    /**
     * Gets the value of the removedItemTemplates property.
     * 
     * @return
     *     possible object is
     *     {@link RemovedItemTemplatesStruct }
     *     
     */
    public RemovedItemTemplatesStruct getRemovedItemTemplates() {
        return removedItemTemplates;
    }

    /**
     * Sets the value of the removedItemTemplates property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemovedItemTemplatesStruct }
     *     
     */
    public void setRemovedItemTemplates(RemovedItemTemplatesStruct value) {
        this.removedItemTemplates = value;
    }

}
