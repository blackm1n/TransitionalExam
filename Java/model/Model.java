package model;

import datatypes.Shop;

import java.util.List;

public class Model {

    Shop shop = new Shop();

    public String addToy(List<String> data) {
        shop.addToy(data.get(0), Integer.parseInt(data.get(1)), Integer.parseInt(data.get(2)));
        return "Создание успешно";
    }
}
