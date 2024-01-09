package angiprestano.FirstProgect1.entities;

public class PizzaHawain extends PizzaMargherita{
    protected  String ham;
    protected String pineapple;

    public PizzaHawain() {
    }

    public PizzaHawain(String ingredient1, String ingredient2, int calories, double price, String ham, String pineapple) {
        super(ingredient1, ingredient2, calories, price);
        this.ham = ham;
        this.pineapple = pineapple;
    }

    public String getHam() {
        return ham;
    }

    public void setHam(String ham) {
        this.ham = ham;
    }

    public String getPineapple() {
        return pineapple;
    }

    public void setPineapple(String pineapple) {
        this.pineapple = pineapple;
    }

    @Override
    public String toString() {
        return "PizzaHawain{" +
                "ham='" + ham + '\'' +
                ", pineapple='" + pineapple + '\'' +
                ", ingredient1='" + ingredient1 + '\'' +
                ", ingredient2='" + ingredient2 + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
