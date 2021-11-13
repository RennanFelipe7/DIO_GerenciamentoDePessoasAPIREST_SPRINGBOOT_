package one.digitalinnovation.personalapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
		public class PersonalapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalapiApplication.class, args);
	}

}
