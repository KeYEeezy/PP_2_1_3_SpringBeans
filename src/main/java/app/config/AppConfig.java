package app.config;

import app.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.sql.Time;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {
    @Bean
    public Animal catBean() {
        return new Cat();
    }
    @Bean
    public Animal dogBean() {
        return new Dog();
    }
    @Bean
    public AnimalsCage cageBean() {
        return new AnimalsCage();
    }
    @Bean
    public Timer timerBean() {
        return new Timer();
    }



}
