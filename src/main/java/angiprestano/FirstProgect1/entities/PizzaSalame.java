package angiprestano.FirstProgect1.entities;

public class PizzaSalame extends PizzaMargherita {
    protected String salame;

    public PizzaSalame() {
    }

    public PizzaSalame(String ingredient1, String ingredient2, int calories, double price, String salame) {
        super(ingredient1, ingredient2, calories, price);
        this.salame = salame;
    }

    public String getSalame() {
        return salame;
    }

    public void setSalame(String salame) {
        this.salame = salame;
    }

    @Override
    public String toString() {
        return "PizzaSalame{" +
                ", ingredient1='" + ingredient1 + '\'' +
                ", ingredient2='" + ingredient2 + '\'' +
                "salame='" + salame + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
