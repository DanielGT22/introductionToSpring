package daniel.introductionToSpring;

import daniel.introductionToSpring.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class IntroductionToSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringApplication.class, args);


		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(IntroductionToSpringApplication.class);

		Menu m = (Menu) ctx.getBean("menu");

		m.printMenu();
		ctx.close();
	}

}
