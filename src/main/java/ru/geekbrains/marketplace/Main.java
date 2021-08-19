package ru.geekbrains.marketplace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.geekbrains.marketplace.Configuration.MarketPlaceConfiguration;
import ru.geekbrains.marketplace.Domain.Menu;
import ru.geekbrains.marketplace.Servise.Card;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MarketPlaceConfiguration.class);
        int a;
        boolean b =true;
        Menu menu= new Menu();
        menu.addItemToMenu("Выберите пункт меню:");
        menu.addItemToMenu("1. Добавить продукт по ID");
        menu.addItemToMenu("2. Добавить все продукты из репозитория");
        menu.addItemToMenu("3. Удалить продукт по ID");
        menu.addItemToMenu("4. Получить новую корзину");
        menu.addItemToMenu("5. Покинуть меню");
        Scanner sc = new Scanner(System.in);
        Card basket = context.getBean("card", Card.class);
        do {
            for (String s : menu.getMenu()) {
                System.out.println(s);
            }
            a=sc.nextInt();
            switch (a){
                case 1:{
                    System.out.println("Введите ID добавляемого продукта:");
                    a=sc.nextInt();
                    basket.addProductBasket(a);
                    break;
                }
                case 2:{
                    basket.addAllProductsBasket();
                    break;
                }
                case 3:{
                    System.out.println("Введите ID удаляемого продукта:");
                    a=sc.nextInt();
                    basket.removeProductBasket(a);
                    break;
                }
                case 4:{
                    basket = context.getBean("card", Card.class);
                    break;
                }
                case 5:{
                    b=false;
                    break;
                }
                default:{
                    break;
                }
            }
            System.out.println("Ваша корзина содержит:");
            basket.getBasket().forEach((key, value) -> System.out.println("id = " + key + "   product = " + value.getTitle()));
        }while (b);
    }
}
