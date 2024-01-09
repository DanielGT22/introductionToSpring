package daniel.introductionToSpring.entities;

import lombok.Getter;

@Getter
public abstract class  Prodotto {

    private int calories;
    private double Price;

    public Prodotto(int calories, double price) {
        this.calories = calories;
        Price = price;
    }
    public Prodotto() {
        this.calories = 0;
        this.Price = 0.0;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "calories=" + calories +
                ", Price=" + Price +
                '}';
    }
}
