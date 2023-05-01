package datatypes;

import java.util.ArrayList;
import java.util.List;

public class Toy {

    int id;
    String name;
    int count;
    int weight;
    static List<Integer> idList = new ArrayList<>();

    public Toy(String name, int count, int weight) {
        this.name = name;
        this.count = count;
        this.weight = Math.min(weight, 100);
        int id = 0;
        while (idList.contains(id)) {
            id += 1;
        }
        idList.add(id);
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public int getCount() {
        return this.count;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("ID: %d\nName: %s\nCount: %d\nWeight: %d", this.id, this.name, this.count, this.weight);
    }
}
