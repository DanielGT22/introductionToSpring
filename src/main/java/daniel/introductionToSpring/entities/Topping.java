package daniel.introductionToSpring.entities;


import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Topping {
    private String nome;
    private int calorie;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }
}
