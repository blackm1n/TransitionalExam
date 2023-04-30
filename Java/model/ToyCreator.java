package model;

import datatypes.Toy;

import java.util.List;

public interface ToyCreator {

    Toy create(List<String> data);
}
