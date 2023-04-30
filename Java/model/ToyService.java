package model;

import datatypes.Toy;

import java.util.List;

public class ToyService implements ToyCreator{
    @Override
    public Toy create(List<String> data) {
        return new Toy(data.get(0), Integer.parseInt(data.get(1)), Integer.parseInt(data.get(2)));
    }
}
