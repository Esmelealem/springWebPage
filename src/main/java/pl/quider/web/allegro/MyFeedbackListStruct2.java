
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MyFeedbackListStruct2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="MyFeedbackListStruct2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="feedbackArray" type="{urn:SandboxWebApi}ArrayOfString" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MyFeedbackListStruct2", propOrder = {

})
public class MyFeedbackListStruct2 {

    protected ArrayOfString feedbackArray;

    /**
     * Gets the value of the feedbackArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getFeedbackArray() {
        return feedbackArray;
    }

    /**
     * Sets the value of the feedbackArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setFeedbackArray(ArrayOfString value) {
        this.feedbackArray = value;
    }

}
