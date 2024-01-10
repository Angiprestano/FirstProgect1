package angiprestano.FirstProgect1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class FirstProgect1Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(FirstProgect1Application.class);
		SpringApplication.run(FirstProgect1Application.class, args);
		System.out.println("PizzaList");
		System.out.println(ctx.getBean("Margherita"));
	}
}
