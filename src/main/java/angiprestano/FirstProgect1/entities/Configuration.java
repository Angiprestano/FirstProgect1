package angiprestano.FirstProgect1.entities;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public PizzaMargherita Margherita() {
        PizzaMargherita pizzaMargherita = new PizzaMargherita();
        pizzaMargherita.setIngredient1("Tomato");
        pizzaMargherita.setIngredient2("cheese");
        pizzaMargherita.setCalories(1010);
        pizzaMargherita.setPrice(4.99);
        return pizzaMargherita;
    }
    
}
