
package ch.pharmedsolutions.www.zsrservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.6-1b01 Generated
 * source version: 2.2
 *
 */
@WebService(name = "InformationPortType", targetNamespace = "https://www.pharmedsolutions.ch/ZSRService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class })
public interface InformationPortType {

	/**
	 * Service to get the corresponding address to a particular ZSR identifier.
	 *
	 * @param informationrequest
	 * @return returns https.www_pharmedsolutions_ch.zsrservice.Information
	 */
	@WebMethod(action = "https://www.pharmedsolutions.ch/ZSRService#getInformation")
	@WebResult(name = "Information", targetNamespace = "https://www.pharmedsolutions.ch/ZSRService", partName = "informationresponse")
	public Information getInformation(
			@WebParam(name = "getInformationParameters", targetNamespace = "https://www.pharmedsolutions.ch/ZSRService", partName = "informationrequest") GetInformationParameters informationrequest);

}
