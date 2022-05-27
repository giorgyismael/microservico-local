package com.gioliveira.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Component
@ConfigurationProperties("greeting-service")
public class GreetingConfiguration {
	
	private String greeting;
	private String defaultValue;

}
