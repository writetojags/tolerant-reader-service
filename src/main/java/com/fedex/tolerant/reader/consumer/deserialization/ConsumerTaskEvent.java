package com.fedex.tolerant.reader.consumer.deserialization;

public class ConsumerTaskEvent {
	private ConsumerAssociationLevel associationLevel;
	private String associationUUID;
	private String effectiveDateTime;

	public ConsumerAssociationLevel getAssociationLevel() {
		return associationLevel;
	}

	public void setAssociationLevel(ConsumerAssociationLevel associationLevel) {
		this.associationLevel = associationLevel;
	}

	public String getAssociationUUID() {
		return associationUUID;
	}

	public void setAssociationUUID(String associationUUID) {
		this.associationUUID = associationUUID;
	}

	public String getEffectiveDateTime() {
		return effectiveDateTime;
	}

	public void setEffectiveDateTime(String effectiveDateTime) {
		this.effectiveDateTime = effectiveDateTime;
	}
}
