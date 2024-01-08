package daniel.introductionToSpring.entities;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Bibite {
    private String nome;
    private double prezzo;
    private int calorie;


}


