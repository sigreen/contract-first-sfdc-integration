package io.syndesis.extension.csv;

import java.util.Map;
import java.util.Optional;

import org.apache.camel.CamelContext;
import org.apache.camel.model.ProcessorDefinition;
import org.apache.camel.util.ObjectHelper;

import io.syndesis.extension.api.Step;
import io.syndesis.extension.api.annotations.Action;

@Action(id = "csv-unmarshal", name = "CSV Unmarshal", description = "Unmarshalling the exchange as CSV", tags = { "unmarshalling", "extension" })
public class CSVUnmarshalAction implements Step {

	@Override
    public Optional<ProcessorDefinition> configure(CamelContext context, ProcessorDefinition route, Map<String, Object> parameters) {
		ObjectHelper.notNull(route, "route");
		return Optional.of(route.unmarshal().csv());
	}
}