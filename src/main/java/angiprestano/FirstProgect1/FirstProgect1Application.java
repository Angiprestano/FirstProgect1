package angiprestano.FirstProgect1;

import angiprestano.FirstProgect1.entities.Menù;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class FirstProgect1Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(FirstProgect1Application.class);
		SpringApplication.run(FirstProgect1Application.class, args);
		System.out.println("PizzaList");
		System.out.println(ctx.getBean("margherita"));
		System.out.println(ctx.getBean("Hawain"));
		System.out.println(ctx.getBean("Salame"));
		System.out.println("Ecco il menù");
		Menù menù = (Menù)ctx.getBean("menù");
		System.out.println(menù);
	}
}
