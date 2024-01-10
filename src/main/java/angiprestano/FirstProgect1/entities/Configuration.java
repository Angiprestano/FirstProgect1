package angiprestano.FirstProgect1.entities;

import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@org.springframework.context.annotation.Configuration
public class Configuration {

    //PIZZE

    @Bean
    public Pizza margherita(){
        Pizza pizza=new Pizza();
        pizza.setName("Margherita");
        pizza.setToppingsList(Arrays.asList(Tomato(),Cheese()));
        pizza.setCalories(1010);
        pizza.setPrice(4.99);
        return pizza;
    }

    @Bean
    public Pizza Hawain() {
        Pizza pizza = new Pizza();
        pizza.setName("Hawain");
        pizza.setToppingsList(Arrays.asList(Tomato(), Cheese(), Ham(), Pineapple()));
        pizza.setCalories(1024);
        pizza.setPrice(6.99);
        return pizza;
    }

    @Bean
    public Pizza Salame() {
        Pizza pizza = new Pizza();
        pizza.setName("Salame");
        pizza.setToppingsList(Arrays.asList(Tomato(), Cheese(), Salami()));
        pizza.setCalories(1160);
        pizza.setPrice(5.99);
        return pizza;
    }

    // TOPPINGS

    @Bean
    Toppings Cheese() {
        return new Toppings("Cheese", 350, 2.00);
    }

    @Bean
    Toppings Tomato(){
        return new Toppings("Tomato",150,1.00);
    }

    @Bean
    Toppings Salami() {
        return new Toppings("Salame", 200, 1.50);
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

    //DRINKS

    @Bean
    Drinks Water() {
        return new Drinks("Water",0.50, 0, 0, 1.50);
    }

    @Bean
    Drinks CocaCola() {
        return new Drinks("CocaCola", 0.75, 0, 150, 2.00);
    }

    @Bean
    Drinks Aranciata() {
        return new Drinks("Aranciata", 0.50, 0, 140, 2.00);
    }

    @Bean
    Drinks Wine() {
        return new Drinks("Wine", 1.00, 13, 800, 12.00);
    }

    @Bean
    Drinks Beer() {
        return new Drinks("Beer", 0.75, 4, 270, 3.00);
    }

    @Bean("ListOfPizze")
            List<Pizza> ListOfPizza() {
        List<Pizza> Pizzas = new ArrayList<>();
        Pizzas.add(margherita());
        Pizzas.add(Hawain());
        Pizzas.add(Salame());
        return Pizzas;
    }
}
