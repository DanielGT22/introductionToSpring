package daniel.introductionToSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import daniel.introductionToSpring.entities.*;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeansConfig {

@Bean(name = "topping_tomato")
    public Topping toppingTomatoBean(){
    return new Topping(0, 0, "tomato");
}
    @Bean(name = "topping_mozzarella")
    public Topping toppingMozzarellaoBean(){
        return new Topping(92, 0.70, "mozzarella");
    }
    @Bean(name = "topping_pineapple")
    public Topping toppingPineappleBean(){
        return new Topping(92, 0.70, "pineapple");
    }
    @Bean(name = "topping_ham")
    public Topping toppingHamBean(){
        return new Topping(102, 0.50, "ham");
    }
    @Bean(name = "topping_salami")
    public Topping toppingSalamiBean(){
        return new Topping(85, 0.60, "salami");
    }

    @Bean(name = "pizza_margherita")
    public Pizza pizzaMargheritaBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingMozzarellaoBean());
        return new Pizza(1021, 4.99,"Pizza Margherita", tList );
    }

    @Bean(name = "hawaiian_pizza")
    public Pizza pizzaHawaiianBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingMozzarellaoBean());
        tList.add(toppingHamBean());
        tList.add(toppingPineappleBean());
        return new Pizza(1300, 7.99,"Pizza Hawaiian", tList );
    }

    @Bean(name = "salami_pizza")
    public Pizza pizzaSalamiBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingMozzarellaoBean());
        tList.add(toppingSalamiBean());
        return new Pizza(1100, 6.99,"Pizza Diavola", tList );
    }

    @Bean(name = "lemonade")
    public Bibite lemonadeBean() {
        return new Bibite("Lemonade", 128, 1.29);
    }

    @Bean(name = "water")
    public Bibite waterBean() {
        return new Bibite("Water", 0, 1.29);
    }

    @Bean(name = "wine")
    public Bibite wineBean() {
        return new Bibite("Wine", 607, 7.49);
    }



    @Bean(name = "menu")
    public Menu menuBean() {
        List<Pizza> pizzaList = new ArrayList<>();
        List<Bibite> bibiteList = new ArrayList<>();
        List<Topping> toppingsList = new ArrayList<>();

        pizzaList.add(pizzaMargheritaBean());
        pizzaList.add(pizzaHawaiianBean());
        pizzaList.add(pizzaSalamiBean());

        bibiteList.add(lemonadeBean());
        bibiteList.add(waterBean());
        bibiteList.add(wineBean());

        toppingsList.add(toppingTomatoBean());
        toppingsList.add(toppingMozzarellaoBean());
        toppingsList.add(toppingSalamiBean());
        toppingsList.add(toppingHamBean());
        toppingsList.add(toppingPineappleBean());

        return new Menu(pizzaList, bibiteList, toppingsList);
    }






}
