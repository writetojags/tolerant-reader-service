package com.fedex.tolerant.reader.producer.injection.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TolerantHealtController {
	
	@GetMapping("/health")
	public String health() {
		return "OK";
		
	}

}
