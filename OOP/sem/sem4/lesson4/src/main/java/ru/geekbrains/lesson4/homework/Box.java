package ru.geekbrains.lesson4.homework;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit>{
    private List<T> container = new ArrayList<>();

    public Box(List<T> container) {
        this.container = container;
    }
    public void addFruit(T fruit) {
        container.add(fruit);
    }
    public int compare(Box<T extends Fruit> other);
    static void getWeight() {

    }


    //    private ArrayList<T> fruits;
//
//    public ArrayList<T> getFruits() {
//        return fruits;
//    }
//
//    public Box(ArrayList<T> fruits) {
//        this.fruits = fruits;
//    }
}
