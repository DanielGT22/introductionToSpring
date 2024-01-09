package daniel.introductionToSpring.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
    private List<Pizza> pizzaList;
    private List<Bibite> bibiteList;
    private List<Topping> toppingList;



    public void printMenu() {
        System.out.println("******* Menu *******");
        System.out.println("PIZZAS");
        this.pizzaList.forEach(System.out::println);
        System.out.println();

        System.out.println("TOPPINGS");
        this.toppingList.forEach(System.out::println);
        System.out.println();

        System.out.println("DRINKS");
        this.bibiteList.forEach(System.out::println);
        System.out.println();

    }

    @Override
    public String toString() {
        return "Menu{" +
                "pizzaList=" + pizzaList +
                ", bibiteList=" + bibiteList +
                ", toppingList=" + toppingList +
                '}';
    }
}
