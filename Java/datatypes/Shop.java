package datatypes;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    List<Toy> availableToys;
    List<Toy> takeOut;

    public Shop() {
        availableToys = new ArrayList<>();
        takeOut = new ArrayList<>();
    }

    public void addToy(String name, int count, int weight) {
        this.availableToys.add(new Toy(name, count, weight));
    }
}
