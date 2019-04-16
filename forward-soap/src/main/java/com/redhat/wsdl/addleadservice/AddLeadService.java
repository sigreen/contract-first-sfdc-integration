package com.redhat.wsdl.addleadservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2019-04-16T13:15:15.311-04:00
 * Generated source version: 3.2.6
 *
 */
@WebService(targetNamespace = "http://redhat.com/wsdl/AddLeadService/", name = "AddLeadService")
@XmlSeeAlso({ObjectFactory.class})
public interface AddLeadService {

    @WebMethod
    @RequestWrapper(localName = "addLead", targetNamespace = "http://redhat.com/wsdl/AddLeadService/", className = "com.redhat.wsdl.addleadservice.AddLead")
    @ResponseWrapper(localName = "addLeadResponse", targetNamespace = "http://redhat.com/wsdl/AddLeadService/", className = "com.redhat.wsdl.addleadservice.AddLeadResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.redhat.wsdl.addleadservice.LeadInfo addLead(
        @WebParam(name = "first_name", targetNamespace = "")
        java.lang.String firstName,
        @WebParam(name = "last_name", targetNamespace = "")
        java.lang.String lastName,
        @WebParam(name = "company", targetNamespace = "")
        java.lang.String company,
        @WebParam(name = "source", targetNamespace = "")
        java.lang.String source,
        @WebParam(name = "phone", targetNamespace = "")
        java.lang.String phone,
        @WebParam(name = "email", targetNamespace = "")
        java.lang.String email,
        @WebParam(name = "status", targetNamespace = "")
        java.lang.String status,
        @WebParam(name = "rating", targetNamespace = "")
        java.lang.String rating
    );
}
