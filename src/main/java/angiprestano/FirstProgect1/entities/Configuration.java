package angiprestano.FirstProgect1.entities;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public PizzaMargherita Margherita() {
        PizzaMargherita pizzaMargherita = new PizzaMargherita();
        pizzaMargherita.setIngredient1("Tomato");
        pizzaMargherita.setIngredient2("Cheese");
        pizzaMargherita.setCalories(1010);
        pizzaMargherita.setPrice(4.99);
        return pizzaMargherita;
    }

    @Bean
    public PizzaHawain Hawain() {
        PizzaHawain pizzaHawain = new PizzaHawain();
        pizzaHawain.setIngredient1("Tomato");
        pizzaHawain.setIngredient2("Cheese");
        pizzaHawain.setHam("Ham");
        pizzaHawain.setPineapple("Pineapple");
        pizzaHawain.setCalories(1024);
        pizzaHawain.setPrice(6.99);
        return pizzaHawain;
    }

    @Bean
    public PizzaSalame Salame() {
        PizzaSalame pizzaSalame = new PizzaSalame();
        pizzaSalame.setIngredient1("Tomato");
        pizzaSalame.setIngredient2("Cheese");
        pizzaSalame.setSalame("Salami");
        pizzaSalame.setCalories(1160);
        pizzaSalame.setPrice(5.99);
        return pizzaSalame;
    }

    @Bean
    Toppings Cheese() {
        return new Toppings("Cheese", 350, 2.00);
    }

    @Bean
    Toppings Mushrooms() {
        return new Toppings("Mushrooms", 400, 2.00);
    }

    @Bean
    Toppings Fries() {
        return new Toppings("Fries", 700, 2.50);
    }

    @Bean
    Toppings Ham() {
        return new Toppings("Ham", 300, 1.50);
    }

    @Bean
    Toppings Pineapple() {
        return new Toppings("Pineapple", 400, 2.00);
    }
}
