package ru.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.Basket;


@Configuration
@ComponentScan("ru.nutrition")
public class ConfigCPFC {
    @Bean
    public Basket getBasket() {
        return new Basket("MassGain");
    }

    @Bean("BasketName")
    public String getBasketName() {
        return "MassGain";
    }
}
