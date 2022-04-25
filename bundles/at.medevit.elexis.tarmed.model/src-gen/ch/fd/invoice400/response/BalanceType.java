//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.13 at 12:17:21 PM MEZ 
//

package ch.fd.invoice400.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for balanceType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="balanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="amount" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="amount_cantonal" type="{http://www.w3.org/2001/XMLSchema}double" default="0" />
 *       &lt;attribute name="amount_drug" type="{http://www.w3.org/2001/XMLSchema}double" default="0" />
 *       &lt;attribute name="amount_due" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *             &lt;minInclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="amount_lab" type="{http://www.w3.org/2001/XMLSchema}double" default="0" />
 *       &lt;attribute name="amount_migel" type="{http://www.w3.org/2001/XMLSchema}double" default="0" />
 *       &lt;attribute name="amount_obligations" type="{http://www.w3.org/2001/XMLSchema}double" default="0" />
 *       &lt;attribute name="amount_physio" type="{http://www.w3.org/2001/XMLSchema}double" default="0" />
 *       &lt;attribute name="amount_prepaid" default="0">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *             &lt;minInclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="amount_tarmed" type="{http://www.w3.org/2001/XMLSchema}double" default="0" />
 *       &lt;attribute name="amount_tarmed.mt" type="{http://www.w3.org/2001/XMLSchema}double" default="0" />
 *       &lt;attribute name="amount_tarmed.tt" type="{http://www.w3.org/2001/XMLSchema}double" default="0" />
 *       &lt;attribute name="amount_unclassified" type="{http://www.w3.org/2001/XMLSchema}double" default="0" />
 *       &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" fixed="CHF" />
 *       &lt;attribute name="unit_tarmed.mt" type="{http://www.w3.org/2001/XMLSchema}double" default="0" />
 *       &lt;attribute name="unit_tarmed.tt" type="{http://www.w3.org/2001/XMLSchema}double" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "balanceType")
public class BalanceType {
	
	@XmlAttribute(required = true)
	protected double amount;
	@XmlAttribute(name = "amount_cantonal")
	protected Double amountCantonal;
	@XmlAttribute(name = "amount_drug")
	protected Double amountDrug;
	@XmlAttribute(name = "amount_due", required = true)
	protected double amountDue;
	@XmlAttribute(name = "amount_lab")
	protected Double amountLab;
	@XmlAttribute(name = "amount_migel")
	protected Double amountMigel;
	@XmlAttribute(name = "amount_obligations")
	protected Double amountObligations;
	@XmlAttribute(name = "amount_physio")
	protected Double amountPhysio;
	@XmlAttribute(name = "amount_prepaid")
	protected Double amountPrepaid;
	@XmlAttribute(name = "amount_tarmed")
	protected Double amountTarmed;
	@XmlAttribute(name = "amount_tarmed.mt")
	protected Double amountTarmedMt;
	@XmlAttribute(name = "amount_tarmed.tt")
	protected Double amountTarmedTt;
	@XmlAttribute(name = "amount_unclassified")
	protected Double amountUnclassified;
	@XmlAttribute
	protected String currency;
	@XmlAttribute(name = "unit_tarmed.mt")
	protected Double unitTarmedMt;
	@XmlAttribute(name = "unit_tarmed.tt")
	protected Double unitTarmedTt;
	
	/**
	 * Gets the value of the amount property.
	 * 
	 */
	public double getAmount(){
		return amount;
	}
	
	/**
	 * Sets the value of the amount property.
	 * 
	 */
	public void setAmount(double value){
		this.amount = value;
	}
	
	/**
	 * Gets the value of the amountCantonal property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public double getAmountCantonal(){
		if (amountCantonal == null) {
			return 0.0D;
		} else {
			return amountCantonal;
		}
	}
	
	/**
	 * Sets the value of the amountCantonal property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setAmountCantonal(Double value){
		this.amountCantonal = value;
	}
	
	/**
	 * Gets the value of the amountDrug property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public double getAmountDrug(){
		if (amountDrug == null) {
			return 0.0D;
		} else {
			return amountDrug;
		}
	}
	
	/**
	 * Sets the value of the amountDrug property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setAmountDrug(Double value){
		this.amountDrug = value;
	}
	
	/**
	 * Gets the value of the amountDue property.
	 * 
	 */
	public double getAmountDue(){
		return amountDue;
	}
	
	/**
	 * Sets the value of the amountDue property.
	 * 
	 */
	public void setAmountDue(double value){
		this.amountDue = value;
	}
	
	/**
	 * Gets the value of the amountLab property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public double getAmountLab(){
		if (amountLab == null) {
			return 0.0D;
		} else {
			return amountLab;
		}
	}
	
	/**
	 * Sets the value of the amountLab property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setAmountLab(Double value){
		this.amountLab = value;
	}
	
	/**
	 * Gets the value of the amountMigel property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public double getAmountMigel(){
		if (amountMigel == null) {
			return 0.0D;
		} else {
			return amountMigel;
		}
	}
	
	/**
	 * Sets the value of the amountMigel property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setAmountMigel(Double value){
		this.amountMigel = value;
	}
	
	/**
	 * Gets the value of the amountObligations property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public double getAmountObligations(){
		if (amountObligations == null) {
			return 0.0D;
		} else {
			return amountObligations;
		}
	}
	
	/**
	 * Sets the value of the amountObligations property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setAmountObligations(Double value){
		this.amountObligations = value;
	}
	
	/**
	 * Gets the value of the amountPhysio property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public double getAmountPhysio(){
		if (amountPhysio == null) {
			return 0.0D;
		} else {
			return amountPhysio;
		}
	}
	
	/**
	 * Sets the value of the amountPhysio property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setAmountPhysio(Double value){
		this.amountPhysio = value;
	}
	
	/**
	 * Gets the value of the amountPrepaid property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public double getAmountPrepaid(){
		if (amountPrepaid == null) {
			return 0.0D;
		} else {
			return amountPrepaid;
		}
	}
	
	/**
	 * Sets the value of the amountPrepaid property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setAmountPrepaid(Double value){
		this.amountPrepaid = value;
	}
	
	/**
	 * Gets the value of the amountTarmed property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public double getAmountTarmed(){
		if (amountTarmed == null) {
			return 0.0D;
		} else {
			return amountTarmed;
		}
	}
	
	/**
	 * Sets the value of the amountTarmed property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setAmountTarmed(Double value){
		this.amountTarmed = value;
	}
	
	/**
	 * Gets the value of the amountTarmedMt property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public double getAmountTarmedMt(){
		if (amountTarmedMt == null) {
			return 0.0D;
		} else {
			return amountTarmedMt;
		}
	}
	
	/**
	 * Sets the value of the amountTarmedMt property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setAmountTarmedMt(Double value){
		this.amountTarmedMt = value;
	}
	
	/**
	 * Gets the value of the amountTarmedTt property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public double getAmountTarmedTt(){
		if (amountTarmedTt == null) {
			return 0.0D;
		} else {
			return amountTarmedTt;
		}
	}
	
	/**
	 * Sets the value of the amountTarmedTt property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setAmountTarmedTt(Double value){
		this.amountTarmedTt = value;
	}
	
	/**
	 * Gets the value of the amountUnclassified property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public double getAmountUnclassified(){
		if (amountUnclassified == null) {
			return 0.0D;
		} else {
			return amountUnclassified;
		}
	}
	
	/**
	 * Sets the value of the amountUnclassified property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setAmountUnclassified(Double value){
		this.amountUnclassified = value;
	}
	
	/**
	 * Gets the value of the currency property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCurrency(){
		if (currency == null) {
			return "CHF";
		} else {
			return currency;
		}
	}
	
	/**
	 * Sets the value of the currency property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCurrency(String value){
		this.currency = value;
	}
	
	/**
	 * Gets the value of the unitTarmedMt property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public double getUnitTarmedMt(){
		if (unitTarmedMt == null) {
			return 0.0D;
		} else {
			return unitTarmedMt;
		}
	}
	
	/**
	 * Sets the value of the unitTarmedMt property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setUnitTarmedMt(Double value){
		this.unitTarmedMt = value;
	}
	
	/**
	 * Gets the value of the unitTarmedTt property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public double getUnitTarmedTt(){
		if (unitTarmedTt == null) {
			return 0.0D;
		} else {
			return unitTarmedTt;
		}
	}
	
	/**
	 * Sets the value of the unitTarmedTt property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setUnitTarmedTt(Double value){
		this.unitTarmedTt = value;
	}
	
}
