
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
 *         <element name="getDateValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
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
    "getDateValue"
})
@XmlRootElement(name = "doGetUserLicenceDateResponse")
public class DoGetUserLicenceDateResponse {

    protected float getDateValue;

    /**
     * Gets the value of the getDateValue property.
     * 
     */
    public float getGetDateValue() {
        return getDateValue;
    }

    /**
     * Sets the value of the getDateValue property.
     * 
     */
    public void setGetDateValue(float value) {
        this.getDateValue = value;
    }

}
