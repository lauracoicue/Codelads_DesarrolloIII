package com.ejemplo.holamundo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //Se usa para marcar la clase principal de la aplicacion y habilitar automaticamente varias configuraciones esenciales, sin necesidad de una configuracion manualmente
public class HolaMundoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolaMundoApplication.class, args);
	}

}
