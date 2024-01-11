package angiprestano.FirstProgect1.entities;

import angiprestano.FirstProgect1.FirstProgect1Application;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("application.properties")
public class Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(FirstProgect1Application.class);
        System.out.println("PizzaList");
        System.out.println(ctx.getBean("margherita"));
        System.out.println(ctx.getBean("Hawain"));
        System.out.println(ctx.getBean("Salame"));
        System.out.println("Ecco il menù");
        Menù menù = (Menù)ctx.getBean("menù");
        System.out.println(menù);
    }
}
