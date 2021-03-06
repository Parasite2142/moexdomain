//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.01 at 05:57:58 PM MSK 
//


package mypackage;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{}CLIENT" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DocDate" use="required" type="{}DATE_FORMAT" />
 *       &lt;attribute name="UniFirmId" use="required" type="{}UNIFIRMID_Type" />
 *       &lt;attribute name="ServiceMode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="32"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="LoadToTE">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;enumeration value="0"/>
 *             &lt;enumeration value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "client"
})
@XmlRootElement(name = "CLIENTS")
public class CLIENTS {

    @XmlElement(name = "CLIENT", required = true)
    protected List<CLIENT> client;
    @XmlAttribute(name = "DocDate", required = true)
    protected XMLGregorianCalendar docDate;
    @XmlAttribute(name = "UniFirmId", required = true)
    protected String uniFirmId;
    @XmlAttribute(name = "ServiceMode")
    protected String serviceMode;
    @XmlAttribute(name = "LoadToTE")
    protected BigInteger loadToTE;

    /**
     * Gets the value of the client property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the client property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCLIENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CLIENT }
     * 
     * 
     */
    public List<CLIENT> getCLIENT() {
        if (client == null) {
            client = new ArrayList<CLIENT>();
        }
        return this.client;
    }

    /**
     * Gets the value of the docDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocDate() {
        return docDate;
    }

    /**
     * Sets the value of the docDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocDate(XMLGregorianCalendar value) {
        this.docDate = value;
    }

    /**
     * Gets the value of the uniFirmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniFirmId() {
        return uniFirmId;
    }

    /**
     * Sets the value of the uniFirmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniFirmId(String value) {
        this.uniFirmId = value;
    }

    /**
     * Gets the value of the serviceMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceMode() {
        return serviceMode;
    }

    /**
     * Sets the value of the serviceMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceMode(String value) {
        this.serviceMode = value;
    }

    /**
     * Gets the value of the loadToTE property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLoadToTE() {
        return loadToTE;
    }

    /**
     * Sets the value of the loadToTE property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLoadToTE(BigInteger value) {
        this.loadToTE = value;
    }

}
