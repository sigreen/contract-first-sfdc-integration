package io.syndesis.extension.csv;

import java.util.Map;
import java.util.Optional;

import org.apache.camel.CamelContext;
import org.apache.camel.model.ProcessorDefinition;
import org.apache.camel.util.ObjectHelper;

import io.syndesis.extension.api.Step;
import io.syndesis.extension.api.annotations.Action;

@Action(id = "csv-marshal", name = "CSV Marshal", description = "Marshalling the exchange as CSV", tags = { "marshalling", "extension" })
public class CSVMarshalAction implements Step {

	@Override
    public Optional<ProcessorDefinition> configure(CamelContext context, ProcessorDefinition route, Map<String, Object> parameters) {
		ObjectHelper.notNull(route, "route");
		return Optional.of(route.marshal().csv());
	}
}