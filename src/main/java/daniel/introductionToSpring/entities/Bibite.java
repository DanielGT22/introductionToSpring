package daniel.introductionToSpring.entities;

import lombok.*;


@Getter
@Setter

public class Bibite  extends Prodotto{
    private String name;


    public Bibite(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bibite{" +
                "name='" + name + '\'' +
                '}';
    }
}


