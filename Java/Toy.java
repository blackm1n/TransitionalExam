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
        this.weight = weight;
        int id = 0;
        while (idList.contains(id)) {
            id += 1;
        }
        idList.add(id);
        this.id = id;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
