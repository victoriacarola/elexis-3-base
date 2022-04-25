package org.hl7.v3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Java class for StrucDoc.Caption complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="StrucDoc.Caption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="linkHtml" type="{urn:hl7-org:v3}StrucDoc.LinkHtml"/>
 *         &lt;element name="sub" type="{urn:hl7-org:v3}StrucDoc.Sub"/>
 *         &lt;element name="sup" type="{urn:hl7-org:v3}StrucDoc.Sup"/>
 *         &lt;element name="footnote" type="{urn:hl7-org:v3}StrucDoc.Footnote"/>
 *         &lt;element name="footnoteRef" type="{urn:hl7-org:v3}StrucDoc.FootnoteRef"/>
 *       &lt;/choice>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="styleCode" type="{http://www.w3.org/2001/XMLSchema}NMTOKENS" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrucDoc.Caption", propOrder = { "content" })
public class StrucDocCaption {

	@XmlElementRefs({ @XmlElementRef(name = "footnoteRef", namespace = "urn:hl7-org:v3", type = JAXBElement.class),
			@XmlElementRef(name = "footnote", namespace = "urn:hl7-org:v3", type = JAXBElement.class),
			@XmlElementRef(name = "sup", namespace = "urn:hl7-org:v3", type = JAXBElement.class),
			@XmlElementRef(name = "sub", namespace = "urn:hl7-org:v3", type = JAXBElement.class),
			@XmlElementRef(name = "linkHtml", namespace = "urn:hl7-org:v3", type = JAXBElement.class) })
	@XmlMixed
	protected List<Serializable> content;
	@XmlAttribute(name = "ID")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlID
	@XmlSchemaType(name = "ID")
	protected String attributeId;
	@XmlAttribute
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlSchemaType(name = "NMTOKEN")
	protected String language;
	@XmlAttribute
	@XmlSchemaType(name = "NMTOKENS")
	protected List<String> styleCode;

	/**
	 * Gets the value of the content property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the content property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 *
	 * <pre>
	 * getContent().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link JAXBElement
	 * }{@code <} {@link StrucDocFootnote }{@code >} {@link JAXBElement
	 * }{@code <}{@link StrucDocSup }{@code >} {@link JAXBElement
	 * }{@code <}{@link StrucDocSub }{@code >} {@link JAXBElement }{@code <}
	 * {@link StrucDocLinkHtml }{@code >} {@link String } {@link JAXBElement
	 * }{@code <} {@link StrucDocFootnoteRef }{@code >}
	 *
	 *
	 */
	public List<Serializable> getContent() {
		if (content == null) {
			content = new ArrayList<Serializable>();
		}
		return this.content;
	}

	/**
	 * Gets the value of the attributeId property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getAttributeId() {
		return attributeId;
	}

	/**
	 * Sets the value of the attributeId property.
	 *
	 * @param value allowed object is {@link String }
	 *
	 */
	public void setAttributeId(String value) {
		this.attributeId = value;
	}

	/**
	 * Gets the value of the language property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * Sets the value of the language property.
	 *
	 * @param value allowed object is {@link String }
	 *
	 */
	public void setLanguage(String value) {
		this.language = value;
	}

	/**
	 * Gets the value of the styleCode property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the styleCode property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 *
	 * <pre>
	 * getStyleCode().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 *
	 *
	 */
	public List<String> getStyleCode() {
		if (styleCode == null) {
			styleCode = new ArrayList<String>();
		}
		return this.styleCode;
	}

}
