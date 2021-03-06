
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
 *         <element name="cancellationResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "cancellationResult"
})
@XmlRootElement(name = "doCancelRefundWarningResponse")
public class DoCancelRefundWarningResponse {

    protected boolean cancellationResult;

    /**
     * Gets the value of the cancellationResult property.
     * 
     */
    public boolean isCancellationResult() {
        return cancellationResult;
    }

    /**
     * Sets the value of the cancellationResult property.
     * 
     */
    public void setCancellationResult(boolean value) {
        this.cancellationResult = value;
    }

}
