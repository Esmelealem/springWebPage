
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
 *         <element name="blackListResult" type="{urn:SandboxWebApi}ArrayOfBlacklistresstruct" minOccurs="0"/>
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
    "blackListResult"
})
@XmlRootElement(name = "doRemoveFromBlackListResponse")
public class DoRemoveFromBlackListResponse {

    protected ArrayOfBlacklistresstruct blackListResult;

    /**
     * Gets the value of the blackListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBlacklistresstruct }
     *     
     */
    public ArrayOfBlacklistresstruct getBlackListResult() {
        return blackListResult;
    }

    /**
     * Sets the value of the blackListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBlacklistresstruct }
     *     
     */
    public void setBlackListResult(ArrayOfBlacklistresstruct value) {
        this.blackListResult = value;
    }

}
