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
            case 2 -> getToy(0);
            case 3 -> getToy(1);
            case 4 -> exit();
        }
    }

    private void addToy() {
        view.info(model.addToy(view.inputToy()));
    }

    private void getToy(int action) {
        int page = 0;
        int toy = view.showToy(model.getPage(page));
        while (toy != 8){
            if (0 < toy && toy < 5) {
                if (action == 0) {
                    view.info(model.deleteToy(page, toy, view.deleteCount()));
                }
                else if (action == 1) {
                    view.info(model.getToy(page, toy));
                    view.pause();
                }
            }
            else if (toy == 6) {
                if (page != 0) {
                    page--;
                }
            }
            else if (toy == 7) {
                page++;
            }
            toy = view.showToy(model.getPage(page));
        }
    }


    public void exit() {
        System.exit(0);
    }
}
