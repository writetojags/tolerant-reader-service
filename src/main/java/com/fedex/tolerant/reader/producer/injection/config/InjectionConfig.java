package com.fedex.tolerant.reader.producer.injection.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "injection")
public class InjectionConfig {

	private boolean enabled;
	private String overrideValue;

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getOverrideValue() {
		return overrideValue;
	}

	public void setOverrideValue(String overrideValue) {
		this.overrideValue = overrideValue;
	}

}
