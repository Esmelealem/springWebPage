//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.05 at 09:50:52 PM CET 
//


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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="postBuyFormPackageInfo" type="{https://webapi.allegro.pl/service.php}PostBuyFormPackageInfoStruct"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "postBuyFormPackageInfo"
})
@XmlRootElement(name = "doAddPackageInfoToPostBuyFormResponse")
public class DoAddPackageInfoToPostBuyFormResponse {

    @XmlElement(required = true)
    protected PostBuyFormPackageInfoStruct postBuyFormPackageInfo;

    /**
     * Gets the value of the postBuyFormPackageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PostBuyFormPackageInfoStruct }
     *     
     */
    public PostBuyFormPackageInfoStruct getPostBuyFormPackageInfo() {
        return postBuyFormPackageInfo;
    }

    /**
     * Sets the value of the postBuyFormPackageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostBuyFormPackageInfoStruct }
     *     
     */
    public void setPostBuyFormPackageInfo(PostBuyFormPackageInfoStruct value) {
        this.postBuyFormPackageInfo = value;
    }

}
