
package com.redhat.wsdl.addleadservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.redhat.wsdl.addleadservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddLead_QNAME = new QName("http://redhat.com/wsdl/AddLeadService/", "addLead");
    private final static QName _AddLeadResponse_QNAME = new QName("http://redhat.com/wsdl/AddLeadService/", "addLeadResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.redhat.wsdl.addleadservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddLead }
     * 
     */
    public AddLead createAddLead() {
        return new AddLead();
    }

    /**
     * Create an instance of {@link AddLeadResponse }
     * 
     */
    public AddLeadResponse createAddLeadResponse() {
        return new AddLeadResponse();
    }

    /**
     * Create an instance of {@link LeadInfo }
     * 
     */
    public LeadInfo createLeadInfo() {
        return new LeadInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLead }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://redhat.com/wsdl/AddLeadService/", name = "addLead")
    public JAXBElement<AddLead> createAddLead(AddLead value) {
        return new JAXBElement<AddLead>(_AddLead_QNAME, AddLead.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLeadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://redhat.com/wsdl/AddLeadService/", name = "addLeadResponse")
    public JAXBElement<AddLeadResponse> createAddLeadResponse(AddLeadResponse value) {
        return new JAXBElement<AddLeadResponse>(_AddLeadResponse_QNAME, AddLeadResponse.class, null, value);
    }

}
