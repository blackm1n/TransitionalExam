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

    public void addToy(Toy toy) {
        this.availableToys.add(toy);
    }

    public void removeToy(Toy toy, int count){
        int i = this.availableToys.indexOf(toy);
        this.availableToys.get(i).setCount(this.availableToys.get(i).getCount() - count);
        if (this.availableToys.get(i).getCount() <= 0) {
            this.availableToys.remove(i);
        }
    }

    public String selectPage(int page) {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            if (i + 5 * page < this.availableToys.size()) {
                output.append(String.format("%d. %dx %s\n", i + 1, this.availableToys.get(i + 5 * page).getCount(), this.availableToys.get(i + 5 * page).getName()));
            }
        }

        return output.toString();
    }

    public Toy selectToy(int page, int toy) {
        if (toy - 1 + 5 * page < this.availableToys.size()) {
            return this.availableToys.get(toy - 1 + 5 * page);
        }
        return null;
    }
}
