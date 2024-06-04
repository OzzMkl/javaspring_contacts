package com.todotic.contactlistapi;

import com.todotic.contactlistapi.entity.Contact;
import com.todotic.contactlistapi.repository.ContactRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ContactlistapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactlistapiApplication.class, args);
	}


/**
 * Al ser esta una aplicacion con base de datos en memoria (que se borra cada ves que se inicia)
 * Ejecutamos el siguiete comando para proveer datos de prueba a nuestra aplicacion
 */
	//gestionado por spring
	@Bean
	CommandLineRunner runner(ContactRepository contactRepository){
		//Esto es una expresion lamda
		return args -> {

				List<Contact> contacts = Arrays.asList(
						new Contact("Carlos","carlos@gmail.com", LocalDateTime.now()),
						new Contact("John", "john@gmail.com", LocalDateTime.now()),
						new Contact("Jane", "jane@gmail.com", LocalDateTime.now()),
						new Contact("Doe", "doe@gmail.com", LocalDateTime.now()),
						new Contact("Smith", "smith@gmail.com", LocalDateTime.now())
				);
				contactRepository.saveAll(contacts);

		};
	}
}
