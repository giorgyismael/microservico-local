package com.gioliveira.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Component
@NoArgsConstructor
//Realiza o Refres automatico da configuração que vem do servidor clod
@RefreshScope 
//Reliza binding das configraçõs de um determinado serviço automaticamente, seja local, ou cloud
@ConfigurationProperties("greeting-service") 
public class GreetingConfiguration {
	
	private String greeting;
	private String defaultValue;

}
