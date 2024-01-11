package angiprestano.FirstProgect1.entities;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Drinks {
    private String name;
    private double quantity;
    private int degree;
    private int calories;
    private double price;

    @Override
    public String toString() {
        return " \n Drinks{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", degree=" + degree +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
