package angiprestano.FirstProgect1.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Component
public class Menù {
    private List<Pizza> pizzaList;
    private List<Drinks> drinksList;

    public Menù(@Qualifier("ListOfPizze") List<Pizza> pizzaList, List<Drinks> drinksList) {
        this.pizzaList = pizzaList;
        this.drinksList = drinksList;
    }

    @Override
    public String toString() {
        return "Menù{" + "\n" +
                "pizzaList=" + pizzaList + "\n" +
                ", drinksList=" + drinksList + "\n" +
                '}';
    }
}
