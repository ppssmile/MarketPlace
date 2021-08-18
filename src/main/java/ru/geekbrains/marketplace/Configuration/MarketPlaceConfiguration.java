package ru.geekbrains.marketplace.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.geekbrains.marketplace.Servise.impl.BasketImpl;

@Configuration
@ComponentScan("ru.geekbrains.marketplace")
public class MarketPlaceConfiguration {

    @Bean("basket")
    public BasketImpl basketImpl(){
        return new BasketImpl();
    }

//    @Bean(name = "basketImpl")
//    public BasketImpl basketImpl(){
//        return new BasketImpl();
//    }

}
