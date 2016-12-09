
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterRelationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="FilterRelationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="relationAnd" type="{urn:SandboxWebApi}ArrayOfString" minOccurs="0"/>
 *         <element name="relationOr" type="{urn:SandboxWebApi}ArrayOfString" minOccurs="0"/>
 *         <element name="relationExclude" type="{urn:SandboxWebApi}ArrayOfString" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterRelationType", propOrder = {

})
public class FilterRelationType {

    protected ArrayOfString relationAnd;
    protected ArrayOfString relationOr;
    protected ArrayOfString relationExclude;

    /**
     * Gets the value of the relationAnd property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getRelationAnd() {
        return relationAnd;
    }

    /**
     * Sets the value of the relationAnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setRelationAnd(ArrayOfString value) {
        this.relationAnd = value;
    }

    /**
     * Gets the value of the relationOr property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getRelationOr() {
        return relationOr;
    }

    /**
     * Sets the value of the relationOr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setRelationOr(ArrayOfString value) {
        this.relationOr = value;
    }

    /**
     * Gets the value of the relationExclude property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getRelationExclude() {
        return relationExclude;
    }

    /**
     * Sets the value of the relationExclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setRelationExclude(ArrayOfString value) {
        this.relationExclude = value;
    }

}
