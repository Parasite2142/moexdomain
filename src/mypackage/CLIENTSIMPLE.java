//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.01 at 05:57:58 PM MSK 
//


package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{}CLIENT_CODE_MAIN" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="CLIENT_INDIVIDUAL">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{}INDIVIDUAL_PERS_Type">
 *                   &lt;sequence>
 *                     &lt;element ref="{}REPRESENTATIVE_PERS" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="CLIENT_LEGAL_PERS" type="{}LEGAL_PERS_Type"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="CountryCode" use="required" type="{}COUNTRYCODE_Type" />
 *       &lt;attribute name="isQualInvestor" type="{}YES_NO_Type" default="N" />
 *       &lt;attribute name="isCrossTrades" type="{}CROSSTRADES_TYPE" default="N" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientcodemain",
    "clientindividual",
    "clientlegalpers"
})
@XmlRootElement(name = "CLIENT_SIMPLE")
public class CLIENTSIMPLE {

    @XmlElement(name = "CLIENT_CODE_MAIN")
    protected CLIENTCODEMAINType clientcodemain;
    @XmlElement(name = "CLIENT_INDIVIDUAL")
    protected CLIENTSIMPLE.CLIENTINDIVIDUAL clientindividual;
    @XmlElement(name = "CLIENT_LEGAL_PERS")
    protected LEGALPERSType clientlegalpers;
    @XmlAttribute(name = "CountryCode", required = true)
    protected String countryCode;
    @XmlAttribute(name = "isQualInvestor")
    protected YESNOType isQualInvestor;
    @XmlAttribute(name = "isCrossTrades")
    protected CROSSTRADESTYPE isCrossTrades;

    /**
     * Если эта нода присутствует. то данный клиент является клиентом 2-го уровня и в этой ноде описана идентификация клиента 1-го уровня. Если эта нода отсутствует, то этот клиент является прямым клиентом участников торгов
     * 
     * @return
     *     possible object is
     *     {@link CLIENTCODEMAINType }
     *     
     */
    public CLIENTCODEMAINType getCLIENTCODEMAIN() {
        return clientcodemain;
    }

    /**
     * Sets the value of the clientcodemain property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLIENTCODEMAINType }
     *     
     */
    public void setCLIENTCODEMAIN(CLIENTCODEMAINType value) {
        this.clientcodemain = value;
    }

    /**
     * Gets the value of the clientindividual property.
     * 
     * @return
     *     possible object is
     *     {@link CLIENTSIMPLE.CLIENTINDIVIDUAL }
     *     
     */
    public CLIENTSIMPLE.CLIENTINDIVIDUAL getCLIENTINDIVIDUAL() {
        return clientindividual;
    }

    /**
     * Sets the value of the clientindividual property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLIENTSIMPLE.CLIENTINDIVIDUAL }
     *     
     */
    public void setCLIENTINDIVIDUAL(CLIENTSIMPLE.CLIENTINDIVIDUAL value) {
        this.clientindividual = value;
    }

    /**
     * Gets the value of the clientlegalpers property.
     * 
     * @return
     *     possible object is
     *     {@link LEGALPERSType }
     *     
     */
    public LEGALPERSType getCLIENTLEGALPERS() {
        return clientlegalpers;
    }

    /**
     * Sets the value of the clientlegalpers property.
     * 
     * @param value
     *     allowed object is
     *     {@link LEGALPERSType }
     *     
     */
    public void setCLIENTLEGALPERS(LEGALPERSType value) {
        this.clientlegalpers = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the isQualInvestor property.
     * 
     * @return
     *     possible object is
     *     {@link YESNOType }
     *     
     */
    public YESNOType getIsQualInvestor() {
        if (isQualInvestor == null) {
            return YESNOType.N;
        } else {
            return isQualInvestor;
        }
    }

    /**
     * Sets the value of the isQualInvestor property.
     * 
     * @param value
     *     allowed object is
     *     {@link YESNOType }
     *     
     */
    public void setIsQualInvestor(YESNOType value) {
        this.isQualInvestor = value;
    }

    /**
     * Gets the value of the isCrossTrades property.
     * 
     * @return
     *     possible object is
     *     {@link CROSSTRADESTYPE }
     *     
     */
    public CROSSTRADESTYPE getIsCrossTrades() {
        if (isCrossTrades == null) {
            return CROSSTRADESTYPE.N;
        } else {
            return isCrossTrades;
        }
    }

    /**
     * Sets the value of the isCrossTrades property.
     * 
     * @param value
     *     allowed object is
     *     {@link CROSSTRADESTYPE }
     *     
     */
    public void setIsCrossTrades(CROSSTRADESTYPE value) {
        this.isCrossTrades = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{}INDIVIDUAL_PERS_Type">
     *       &lt;sequence>
     *         &lt;element ref="{}REPRESENTATIVE_PERS" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "representativepers"
    })
    public static class CLIENTINDIVIDUAL
        extends INDIVIDUALPERSType
    {

        @XmlElement(name = "REPRESENTATIVE_PERS")
        protected REPRESENTATIVEPERSType representativepers;

        /**
         * Gets the value of the representativepers property.
         * 
         * @return
         *     possible object is
         *     {@link REPRESENTATIVEPERSType }
         *     
         */
        public REPRESENTATIVEPERSType getREPRESENTATIVEPERS() {
            return representativepers;
        }

        /**
         * Sets the value of the representativepers property.
         * 
         * @param value
         *     allowed object is
         *     {@link REPRESENTATIVEPERSType }
         *     
         */
        public void setREPRESENTATIVEPERS(REPRESENTATIVEPERSType value) {
            this.representativepers = value;
        }

    }

}
