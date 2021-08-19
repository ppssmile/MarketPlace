package ru.geekbrains.marketplace.Domain;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<String> menu;

    public Menu() {
        this.menu = new ArrayList<>();
    }

    public List<String> getMenu() {
        return menu;
    }

    public void setMenu(List<String> menu) {
        this.menu = menu;
    }

    public void addItemToMenu(String str){
        this.menu.add(str);
    }
}
