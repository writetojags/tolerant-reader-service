package com.fedex.tolerant.reader.producer.injection.controller;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fedex.tolerant.reader.producer.injection.dto.AssociationProducerRequestDto;
import com.fedex.tolerant.reader.producer.injection.service.ProducerInjectionService;
//Controller class
@RestController
@RequestMapping("/api")
public class AssociationProducerController {
	private static final Logger logger = LoggerFactory.getLogger(AssociationProducerController.class);
	private final ProducerInjectionService injectionService;

	public AssociationProducerController(ProducerInjectionService injectionService) {
		this.injectionService = injectionService;
	}

	@PostMapping("/produce-event")
	public List<AssociationProducerRequestDto> produceEvent(@RequestBody List<AssociationProducerRequestDto> input) {
		logger.info("Received input payload with {} items", input.size());
		List<AssociationProducerRequestDto> result = new ArrayList<>(input);
		if (injectionService.isInjectionEnabled()) {
			String overrideValue = injectionService.getOverrideValue();
			if (overrideValue != null && !overrideValue.isBlank()) {
				AssociationProducerRequestDto injected = new AssociationProducerRequestDto();
				injected.setAssociationLevel(overrideValue);
				injected.setAssociationUUID("Random-" + UUID.randomUUID());
				injected.setEffectiveDateTime(Instant.now().toString());
				result.add(injected);
				logger.warn("Producer Injection ENABLED - Appended random entry with value: {}", overrideValue);
			} else {
				logger.warn("Producer Injection ENABLED - But no overrideValue configured! Nothing appended.");
			}
		} else {
			logger.info("Producer Injection DISABLED - Returning input unchanged");
		}
		logger.info("Returning response payload with {} items", result.size());
		return result;
	}
}
