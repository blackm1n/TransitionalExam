package controller;

import model.Model;
import view.View;

public class Controller {

    Model model = new Model();
    View view = new View();

    public void start() {
        int num = 0;
        while (num <= 0 || num > 5) {
            num = view.showMenu();
        }
        switch (num) {
            case 1 -> addToy();
            case 2 -> exit();
        }
    }

    private void addToy() {
        view.info(model.addToy(view.inputToy()));
    }

    public void exit() {
        System.exit(0);
    }
}
