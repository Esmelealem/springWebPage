
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
 *         <element name="sessionHandlePart" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="userId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="serverTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "sessionHandlePart",
    "userId",
    "serverTime"
})
@XmlRootElement(name = "doLoginEncResponse")
public class DoLoginEncResponse {

    @XmlElement(required = true)
    protected String sessionHandlePart;
    protected long userId;
    protected long serverTime;

    /**
     * Gets the value of the sessionHandlePart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionHandlePart() {
        return sessionHandlePart;
    }

    /**
     * Sets the value of the sessionHandlePart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionHandlePart(String value) {
        this.sessionHandlePart = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     */
    public long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(long value) {
        this.userId = value;
    }

    /**
     * Gets the value of the serverTime property.
     * 
     */
    public long getServerTime() {
        return serverTime;
    }

    /**
     * Sets the value of the serverTime property.
     * 
     */
    public void setServerTime(long value) {
        this.serverTime = value;
    }

}
