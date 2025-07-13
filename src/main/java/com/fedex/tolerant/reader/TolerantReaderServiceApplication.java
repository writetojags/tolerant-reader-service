package com.fedex.tolerant.reader;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.fedex.tolerant.reader.producer.injection.config.InjectionConfig;

//main class

@SpringBootApplication(scanBasePackages = "com.fedex.tolerant.reader")
@EnableConfigurationProperties(InjectionConfig.class)
public class TolerantReaderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TolerantReaderServiceApplication.class, args);
	}

}
