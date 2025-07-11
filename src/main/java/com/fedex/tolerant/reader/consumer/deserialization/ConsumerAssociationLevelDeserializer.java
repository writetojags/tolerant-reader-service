package com.fedex.tolerant.reader.consumer.deserialization;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class ConsumerAssociationLevelDeserializer extends JsonDeserializer<ConsumerAssociationLevel> {
	private static final Logger logger = LoggerFactory.getLogger(ConsumerAssociationLevelDeserializer.class);

	@Override
	public ConsumerAssociationLevel deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
		String value = p.getText().toUpperCase();
		try {
			return ConsumerAssociationLevel.valueOf(value);
		} catch (IllegalArgumentException ex) {
			logger.warn("Unknown enum value received: '{}'. Falling back to UNKNOWN.", value);
			return ConsumerAssociationLevel.UNKNOW;
		}
	}
}
