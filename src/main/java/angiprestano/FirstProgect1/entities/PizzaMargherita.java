package angiprestano.FirstProgect1.entities;

public class PizzaMargherita {
    protected String ingredient1;
    protected String ingredient2;
    protected int calories;
    protected double price;

    public PizzaMargherita() {
    }

    public PizzaMargherita(String ingredient1, String ingredient2, int calories, double price) {
        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;
        this.calories = calories;
        this.price = price;
    }

    public String getIngredient1() {
        return ingredient1;
    }

    public void setIngredient1(String ingredient1) {
        this.ingredient1 = ingredient1;
    }

    public String getIngredient2() {
        return ingredient2;
    }

    public void setIngredient2(String ingredient2) {
        this.ingredient2 = ingredient2;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PizzaMargherita{" +
                "ingredient1='" + ingredient1 + '\'' +
                ", ingredient2='" + ingredient2 + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
