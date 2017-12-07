package org.bszana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TicketApiApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(TicketApiApplication.class, args);
	} 
}
