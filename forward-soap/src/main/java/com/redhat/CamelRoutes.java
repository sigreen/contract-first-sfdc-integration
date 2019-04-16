package com.redhat;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

@Component
public class CamelRoutes extends RouteBuilder {
	

	@Override
	public void configure() throws Exception {
		
		
			
		from("direct:getalllocationphone")
			.setBody().constant("{\"first_name\":\"Simon\",\"last_name\":\"Green\",\"company\":\"Red Hat\",\"source\":\"Partner Referral\",\"phone\":\"(212) 333-1234\",\"email\":\"sigreen@redhat.com\",\"status\":\"Closed Converted\",\"rating\":\"Warm\"}")
			.unmarshal().json(JsonLibrary.Jackson)
			.to("cxf://http://localhost:8080/ws/lead?wsdl?serviceClass=com.redhat.LocationDetailServicePortType&defaultOperationName=contact")
			.log("RESPONSE BODY: [${body}]");
		;
	
	}
	
	

}
