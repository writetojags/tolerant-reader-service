package com.fedex.tolerant.reader.producer.injection.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fedex.tolerant.reader.producer.injection.config.InjectionConfig;

@Service
public class ProducerInjectionService {

	private static final Logger log = LoggerFactory.getLogger(ProducerInjectionService.class);
	private final InjectionConfig injectionConfig;

	public ProducerInjectionService(InjectionConfig injectionConfig) {
		this.injectionConfig = injectionConfig;
	}

	public boolean isInjectionEnabled() {
		return injectionConfig.isEnabled();
	}

	public String getOverrideValue() {
		return injectionConfig.getOverrideValue();
	}

}
