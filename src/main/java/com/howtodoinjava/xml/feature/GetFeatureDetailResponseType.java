//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.24 at 05:18:48 PM IST 
//


package com.howtodoinjava.xml.feature;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFeatureDetailResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFeatureDetailResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="featureDetails" type="{http://www.howtodoinjava.com/xml/feature}FeatureDetailsType"/>
 *         &lt;element name="status" type="{http://www.howtodoinjava.com/xml/feature}StatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFeatureDetailResponseType", propOrder = {
    "featureDetails",
    "status"
})
public class GetFeatureDetailResponseType {

    @XmlElement(required = true)
    protected FeatureDetailsType featureDetails;
    @XmlElement(required = true)
    protected StatusType status;

    /**
     * Gets the value of the featureDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureDetailsType }
     *     
     */
    public FeatureDetailsType getFeatureDetails() {
        return featureDetails;
    }

    /**
     * Sets the value of the featureDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureDetailsType }
     *     
     */
    public void setFeatureDetails(FeatureDetailsType value) {
        this.featureDetails = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

}
