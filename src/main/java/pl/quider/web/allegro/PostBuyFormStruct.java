
package pl.quider.web.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostBuyFormStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="PostBuyFormStruct">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="transactionPackageIds" type="{urn:SandboxWebApi}ArrayOfLong" minOccurs="0"/>
 *         <element name="transactionPayByLink" type="{urn:SandboxWebApi}TransactionPayByLinkStruct"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostBuyFormStruct", propOrder = {

})
public class PostBuyFormStruct {

    protected long transactionId;
    protected ArrayOfLong transactionPackageIds;
    @XmlElement(required = true)
    protected TransactionPayByLinkStruct transactionPayByLink;

    /**
     * Gets the value of the transactionId property.
     * 
     */
    public long getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     */
    public void setTransactionId(long value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the transactionPackageIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getTransactionPackageIds() {
        return transactionPackageIds;
    }

    /**
     * Sets the value of the transactionPackageIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setTransactionPackageIds(ArrayOfLong value) {
        this.transactionPackageIds = value;
    }

    /**
     * Gets the value of the transactionPayByLink property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionPayByLinkStruct }
     *     
     */
    public TransactionPayByLinkStruct getTransactionPayByLink() {
        return transactionPayByLink;
    }

    /**
     * Sets the value of the transactionPayByLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionPayByLinkStruct }
     *     
     */
    public void setTransactionPayByLink(TransactionPayByLinkStruct value) {
        this.transactionPayByLink = value;
    }

}
