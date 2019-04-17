package com.redhat;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.apache.cxf.message.MessageContentsList;
import org.springframework.stereotype.Component;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import com.redhat.wsdl.addleadservice.AddLead;

@Component
public class CamelRoutes extends RouteBuilder {
	

	
	@Override
	public void configure() throws Exception {
		
		
			
		from("timer://foo?fixedRate=true&period=10000")
			.setBody().constant("{\"first_name\":\"Simon\",\"last_name\":\"Green\",\"company\":\"Red Hat\",\"source\":\"Partner Referral\",\"phone\":\"(212) 333-1234\",\"email\":\"sigreen@redhat.com\",\"status\":\"Closed Converted\",\"rating\":\"Warm\"}")
			.unmarshal().json(JsonLibrary.Jackson, AddLead.class)
			.process(
					new Processor(){

						@Override
						public void process(Exchange exchange) throws Exception {
							AddLead leadPojo = (AddLead)exchange.getIn().getBody();
							MessageContentsList req = new MessageContentsList();
							
							req.add(leadPojo.getFirstName());
							req.add(leadPojo.getLastName());
							req.add(leadPojo.getCompany());
							req.add(leadPojo.getSource());
							req.add(leadPojo.getPhone());
							req.add(leadPojo.getEmail());
							req.add(leadPojo.getStatus());
							req.add(leadPojo.getRating());
							
							exchange.getOut().setBody(req);
						}
					}
			)
			.to("cxf://http://soap-endpoint-fuse-66c3b847-5d25-11e9-ad61-0a580a010007.apps.melbourne-c137.openshiftworkshop.com/ws/lead?serviceClass=com.redhat.wsdl.addleadservice.AddLeadService&defaultOperationName=addLead&dataFormat=POJO")
			.log("RESPONSE BODY: [${body}]");
		;
	
	}
	
	

}
