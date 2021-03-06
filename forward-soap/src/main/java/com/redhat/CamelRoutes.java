package com.redhat;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.apache.cxf.message.MessageContentsList;
import org.springframework.stereotype.Component;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import com.redhat.wsdl.addleadservice.AddLead;
import com.redhat.wsdl.addleadservice.LeadInfo;


@Component
public class CamelRoutes extends RouteBuilder {
	

	
	@Override
	public void configure() throws Exception {
		
		
			
		from("activemq:topic:IncomingLeads")
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
			.process(
					new Processor(){

						@Override
						public void process(Exchange exchange) throws Exception {
							
							MessageContentsList list = (MessageContentsList)exchange.getIn().getBody();
							
							exchange.getOut().setBody((LeadInfo)list.get(0));
						}
					}
			)
			.log("RESPONSE BODY: [${body.status} ${body.email}]");
		;
	
	}
	
	

}
