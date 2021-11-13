package one.digitalinnovation.personalapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

		public class PersonalapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalapiApplication.class, args);
	}

}
