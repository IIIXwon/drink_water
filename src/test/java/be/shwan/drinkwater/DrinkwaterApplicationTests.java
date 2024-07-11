package be.shwan.drinkwater;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class DrinkwaterApplicationTests {

	@Test
	void contextLoads() {
		ConfigurableApplicationContext run = SpringApplication.run(DrinkwaterApplication.class, "");
		String[] beanDefinitionNames = run.getBeanDefinitionNames();
		System.out.println("beanDefinitionNames count = " + beanDefinitionNames.length);
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}
	}

}
