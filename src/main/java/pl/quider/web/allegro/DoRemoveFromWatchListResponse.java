
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
 *         <element name="watchListResult" type="{urn:SandboxWebApi}ArrayOfItemremovewatchstruct" minOccurs="0"/>
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
    "watchListResult"
})
@XmlRootElement(name = "doRemoveFromWatchListResponse")
public class DoRemoveFromWatchListResponse {

    protected ArrayOfItemremovewatchstruct watchListResult;

    /**
     * Gets the value of the watchListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemremovewatchstruct }
     *     
     */
    public ArrayOfItemremovewatchstruct getWatchListResult() {
        return watchListResult;
    }

    /**
     * Sets the value of the watchListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemremovewatchstruct }
     *     
     */
    public void setWatchListResult(ArrayOfItemremovewatchstruct value) {
        this.watchListResult = value;
    }

}
