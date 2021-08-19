package ru.geekbrains.marketplace.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.geekbrains.marketplace.Servise.Card;

@Configuration
@ComponentScan({"ru.geekbrains.marketplace.Configuration", "ru.geekbrains.marketplace.Repository","ru.geekbrains.marketplace.Servise"})
public class MarketPlaceConfiguration {

}
