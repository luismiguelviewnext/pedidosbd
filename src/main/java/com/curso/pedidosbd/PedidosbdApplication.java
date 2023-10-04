package com.curso.pedidosbd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

/**
 * Clase principal de la aplicación Spring Boot para gestionar pedidos en una
 * base de datos.
 */
@EntityScan(basePackages = "com.curso.model.")
@EnableJpaRepositories(basePackages = "com.curso.dao")
@SpringBootApplication(scanBasePackages = { "com.curso.controller", "com.curso.service" })
public class PedidosbdApplication {

	public static void main(String[] args) {
		SpringApplication.run(PedidosbdApplication.class, args);
	}

	/**
	 * Configura y proporciona una instancia de RestTemplate para realizar
	 * solicitudes HTTP.
	 *
	 * @return Una instancia de RestTemplate configurada.
	 */
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
