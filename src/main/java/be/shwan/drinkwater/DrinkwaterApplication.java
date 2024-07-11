package be.shwan.drinkwater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DrinkwaterApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DrinkwaterApplication.class, args);
	}

}
