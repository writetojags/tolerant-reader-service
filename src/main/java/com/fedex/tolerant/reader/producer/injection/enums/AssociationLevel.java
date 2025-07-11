package com.fedex.tolerant.reader.producer.injection.enums;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum AssociationLevel {
	ORDER, ORDERLINEITEM, 
	
	@JsonEnumDefaultValue
	UNKNOWN

}
