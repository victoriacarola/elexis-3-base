//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.18 at 01:35:39 PM CET 
//

package ch.fd.invoice400.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for localityAddressType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="localityAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="person" type="{http://www.xmlData.ch/xmlInvoice/XSD}localityPersonType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ean_party" type="{http://www.xmlData.ch/xmlInvoice/XSD}eanPartyType" />
 *       &lt;attribute name="zsr" type="{http://www.xmlData.ch/xmlInvoice/XSD}zsrPartyType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "localityAddressType", propOrder = {
	"person"
})
public class LocalityAddressType {
	
	protected LocalityPersonType person;
	@XmlAttribute(name = "ean_party")
	protected String eanParty;
	@XmlAttribute(name = "zsr")
	protected String zsr;
	
	/**
	 * Gets the value of the person property.
	 * 
	 * @return possible object is {@link LocalityPersonType }
	 * 
	 */
	public LocalityPersonType getPerson(){
		return person;
	}
	
	/**
	 * Sets the value of the person property.
	 * 
	 * @param value
	 *            allowed object is {@link LocalityPersonType }
	 * 
	 */
	public void setPerson(LocalityPersonType value){
		this.person = value;
	}
	
	/**
	 * Gets the value of the eanParty property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEanParty(){
		return eanParty;
	}
	
	/**
	 * Sets the value of the eanParty property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEanParty(String value){
		this.eanParty = value;
	}
	
	/**
	 * Gets the value of the zsr property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getZsr(){
		return zsr;
	}
	
	/**
	 * Sets the value of the zsr property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setZsr(String value){
		this.zsr = value;
	}
	
}
