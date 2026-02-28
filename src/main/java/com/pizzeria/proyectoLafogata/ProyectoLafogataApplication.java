package com.pizzeria.proyectoLafogata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProyectoLafogataApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(ProyectoLafogataApplication.class, args);

		WebServerApplicationContext webServerContext =
				(WebServerApplicationContext) context;

		int port = webServerContext.getWebServer().getPort();

		System.out.println("🖥 Servidor iniciado en el puerto: " + port);
	}
}