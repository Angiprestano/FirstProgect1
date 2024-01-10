package angiprestano.FirstProgect1.entities;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Drinks {
    private String name;
    private double quantity;
    private int degree;
    private int calories;
    private double price;
}
