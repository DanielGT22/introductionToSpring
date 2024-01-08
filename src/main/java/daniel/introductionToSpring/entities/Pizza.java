package daniel.introductionToSpring.entities;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pizza {
    private String nome;
    private double prezzo;
    private int calorie;

    private Topping pomodoro;

    private Topping mozzarella;


    public Pizza(String nome, double prezzo, int calorie, Topping pomodoro, Topping mozzarella) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.calorie = calorie;
        this.pomodoro = pomodoro;
        this.mozzarella = mozzarella;
    }
}