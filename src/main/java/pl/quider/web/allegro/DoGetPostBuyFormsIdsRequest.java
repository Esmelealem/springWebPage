
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
 *         <element name="filterOptions" type="{urn:SandboxWebApi}ArrayOfFilteroptionstype" minOccurs="0"/>
 *         <element name="resultSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="resultOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "filterOptions",
    "resultSize",
    "resultOffset"
})
@XmlRootElement(name = "DoGetPostBuyFormsIdsRequest")
public class DoGetPostBuyFormsIdsRequest {

    @XmlElement(required = true)
    protected String sessionId;
    protected ArrayOfFilteroptionstype filterOptions;
    protected Integer resultSize;
    protected Integer resultOffset;

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
     * Gets the value of the filterOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFilteroptionstype }
     *     
     */
    public ArrayOfFilteroptionstype getFilterOptions() {
        return filterOptions;
    }

    /**
     * Sets the value of the filterOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFilteroptionstype }
     *     
     */
    public void setFilterOptions(ArrayOfFilteroptionstype value) {
        this.filterOptions = value;
    }

    /**
     * Gets the value of the resultSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResultSize() {
        return resultSize;
    }

    /**
     * Sets the value of the resultSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResultSize(Integer value) {
        this.resultSize = value;
    }

    /**
     * Gets the value of the resultOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResultOffset() {
        return resultOffset;
    }

    /**
     * Sets the value of the resultOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResultOffset(Integer value) {
        this.resultOffset = value;
    }

}
