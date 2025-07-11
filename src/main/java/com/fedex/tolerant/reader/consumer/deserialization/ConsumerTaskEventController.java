package com.fedex.tolerant.reader.consumer.deserialization;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ConsumerTaskEventController {
	private static final Logger logger = LoggerFactory.getLogger(ConsumerTaskEventController.class);

	@PostMapping("consumer-task-event")
	public ResponseEntity<List<ConsumerTaskEvent>> handleTaskEvent(@RequestBody List<ConsumerTaskEvent> taskEventList) {
		for (ConsumerTaskEvent event : taskEventList) {
			logger.info("Received event with AssociationLevel: " + event.getAssociationLevel());
			logger.info("Received event with AssociationUUID: " + event.getAssociationUUID());
			logger.info("Received event with getEffectiveDateTime: " + event.getEffectiveDateTime());
		}
		return ResponseEntity.ok(taskEventList);
	}
}
