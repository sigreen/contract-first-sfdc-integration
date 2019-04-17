package com.redhat;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.redhat.model.LeadInfo;

@WebService(
		  targetNamespace = "http://redhat.com/wsdl/AddLeadService/",
		  name = "AddLeadService",
		  serviceName = "AddLeadService",
		  portName = "SOAPOverHTTP"
		)
public interface AddLeadService {
	
	public LeadInfo addLead(@WebParam(name = "first_name", targetNamespace = "") String first_name, @WebParam(name = "last_name", targetNamespace = "") String last_name, @WebParam(name = "company", targetNamespace = "") String company, @WebParam(name = "source", targetNamespace = "") String source, @WebParam(name = "phone", targetNamespace = "") String phone, @WebParam(name = "email", targetNamespace = "") String email,
			@WebParam(name = "status", targetNamespace = "") String status, @WebParam(name = "rating", targetNamespace = "") String rating);

}
