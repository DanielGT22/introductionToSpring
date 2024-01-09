package daniel.introductionToSpring.entities;

import lombok.*;

import java.util.List;


@Getter
@Setter
public class Pizza  extends Prodotto{
    private String nome;

    private List<Topping> toppingList;


    public Pizza(int calories, double price, String nome, List<Topping> toppingList) {
        super( 1021, 4.99 );
        this.nome = nome;
        this.toppingList = toppingList;


    }

    @Override
    public String toString() {
        return "Pizza{" +
                "nome='" + nome + '\'' +
                ", toppingList=" + toppingList +
                '}';
    }
}