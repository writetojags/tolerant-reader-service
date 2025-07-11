package com.fedex.tolerant.reader.producer.injection.dto;

public class AssociationProducerRequestDto {
	private String associationLevel;
	private String associationUUID;
	private String effectiveDateTime;

	public String getAssociationLevel() {
		return associationLevel;
	}

	public void setAssociationLevel(String associationLevel) {
		this.associationLevel = associationLevel;
	}

	public String getAssociationUUID() {
		return associationUUID;
	}

	public void setAssociationUUID(String associationUUID) {
		this.associationUUID = associationUUID;
	}

	public String getEffectiveDateTimeString() {
		return effectiveDateTime;
	}

	public void setEffectiveDateTime(String effectiveDateTimeString) {
		this.effectiveDateTime = effectiveDateTimeString;
	}

	@Override
	public String toString() {
		return "AssociationRequestDemoDto [associationLevel=" + associationLevel + ", associationUUID="
				+ associationUUID + ", effectiveDateTimeString=" + effectiveDateTime + "]";
	}

}
