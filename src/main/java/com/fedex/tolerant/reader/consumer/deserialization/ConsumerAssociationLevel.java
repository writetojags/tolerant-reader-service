package com.fedex.tolerant.reader.consumer.deserialization;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonFormat(shape = JsonFormat.Shape.STRING)
@JsonDeserialize(using = ConsumerAssociationLevelDeserializer.class)
public enum ConsumerAssociationLevel {
	ORDER, ORDERLINEITEM, 
	
	@JsonEnumDefaultValue
	UNKNOW

}
