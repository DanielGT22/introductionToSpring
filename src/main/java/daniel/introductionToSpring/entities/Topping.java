package daniel.introductionToSpring.entities;


import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Topping extends Prodotto{
    private String nome;

    public Topping(int calories, double price, String nome) {
        super(calories, price);
        this.nome = nome;
    }
}
