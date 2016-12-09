
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
 *         <element name="statesInfoArray" type="{urn:SandboxWebApi}ArrayOfStateinfostruct" minOccurs="0"/>
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
    "statesInfoArray"
})
@XmlRootElement(name = "doGetStatesInfoResponse")
public class DoGetStatesInfoResponse {

    protected ArrayOfStateinfostruct statesInfoArray;

    /**
     * Gets the value of the statesInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStateinfostruct }
     *     
     */
    public ArrayOfStateinfostruct getStatesInfoArray() {
        return statesInfoArray;
    }

    /**
     * Sets the value of the statesInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStateinfostruct }
     *     
     */
    public void setStatesInfoArray(ArrayOfStateinfostruct value) {
        this.statesInfoArray = value;
    }

}
