package daniel.introductionToSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import daniel.introductionToSpring.entities.*;

@Configuration
public class BeansConfig {

@Bean
    public Topping mozzarella() {
    Topping mozzarella = new Topping();
    mozzarella.setNome("Mozzarella");
    return  mozzarella;
}
    @Bean
    public Topping pomodoro() {
        Topping pomodoro = new Topping();
        pomodoro.setNome("Pomodoro");
        return  pomodoro;
    }

}
