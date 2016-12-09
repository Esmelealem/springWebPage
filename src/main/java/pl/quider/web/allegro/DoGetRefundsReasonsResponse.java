
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
 *         <element name="reasonsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="reasonsList" type="{urn:SandboxWebApi}ArrayOfReasoninfotype" minOccurs="0"/>
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
    "reasonsCount",
    "reasonsList"
})
@XmlRootElement(name = "doGetRefundsReasonsResponse")
public class DoGetRefundsReasonsResponse {

    protected int reasonsCount;
    protected ArrayOfReasoninfotype reasonsList;

    /**
     * Gets the value of the reasonsCount property.
     * 
     */
    public int getReasonsCount() {
        return reasonsCount;
    }

    /**
     * Sets the value of the reasonsCount property.
     * 
     */
    public void setReasonsCount(int value) {
        this.reasonsCount = value;
    }

    /**
     * Gets the value of the reasonsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReasoninfotype }
     *     
     */
    public ArrayOfReasoninfotype getReasonsList() {
        return reasonsList;
    }

    /**
     * Sets the value of the reasonsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReasoninfotype }
     *     
     */
    public void setReasonsList(ArrayOfReasoninfotype value) {
        this.reasonsList = value;
    }

}
