package model;

import datatypes.Shop;

import java.util.List;

public class Model {

    ToyCreator toyCreator = new ToyService();
    Shop shop = new Shop();

    public String addToy(List<String> data) {
        shop.addToy(toyCreator.create(data));
        return "Создание успешно";
    }

    public String deleteToy(int page, int toy) {
        shop.removeToy(shop.selectToy(page, toy));
        return "Удаление успешно";
    }

    public String editToy(int page, int toy, int change, String data) {
        shop.editToy(shop.selectToy(page, toy), change, data);
        return "Изменение успешно";
    }

    public String getPage(int page) {
        return String.format("Страница %d\n%s", page + 1, shop.selectPage(page));
    }

    public String getToy(int page, int toy) {
        return String.valueOf(shop.selectToy(page, toy));
    }
}
