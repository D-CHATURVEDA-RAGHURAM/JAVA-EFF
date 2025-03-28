package com.effigo.shared.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

import org.springframework.util.StringUtils;

public class TrimStringDeserializer extends JsonDeserializer<String> {
	@Override
	public String deserialize(JsonParser p, DeserializationContext context) throws IOException {
		String dateAsString = p.getValueAsString();
		return StringUtils.hasText(dateAsString) ? dateAsString.trim() : dateAsString;
	}
}
