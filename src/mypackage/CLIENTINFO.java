//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.01 at 05:57:58 PM MSK 
//


package mypackage;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{}CLIENT_SIMPLE"/>
 *           &lt;element ref="{}CLIENT_DU"/>
 *           &lt;element ref="{}CLIENT_PF"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientsimple",
    "clientdu",
    "clientpf"
})
@XmlRootElement(name = "CLIENT_INFO")
public class CLIENTINFO {

    @XmlElement(name = "CLIENT_SIMPLE")
    protected CLIENTSIMPLE clientsimple;
    @XmlElement(name = "CLIENT_DU")
    protected CLIENTDU clientdu;
    @XmlElement(name = "CLIENT_PF")
    protected CLIENTPF clientpf;

    /**
     * Gets the value of the clientsimple property.
     * 
     * @return
     *     possible object is
     *     {@link CLIENTSIMPLE }
     *     
     */
    public CLIENTSIMPLE getCLIENTSIMPLE() {
        return clientsimple;
    }

    /**
     * Sets the value of the clientsimple property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLIENTSIMPLE }
     *     
     */
    public void setCLIENTSIMPLE(CLIENTSIMPLE value) {
        this.clientsimple = value;
    }

    /**
     * Gets the value of the clientdu property.
     * 
     * @return
     *     possible object is
     *     {@link CLIENTDU }
     *     
     */
    public CLIENTDU getCLIENTDU() {
        return clientdu;
    }

    /**
     * Sets the value of the clientdu property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLIENTDU }
     *     
     */
    public void setCLIENTDU(CLIENTDU value) {
        this.clientdu = value;
    }

    /**
     * Gets the value of the clientpf property.
     * 
     * @return
     *     possible object is
     *     {@link CLIENTPF }
     *     
     */
    public CLIENTPF getCLIENTPF() {
        return clientpf;
    }

    /**
     * Sets the value of the clientpf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLIENTPF }
     *     
     */
    public void setCLIENTPF(CLIENTPF value) {
        this.clientpf = value;
    }

}
