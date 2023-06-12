package ru.geekbrains.lesson4.homework;

import java.util.ArrayList;

public class BoxOrange <T extends Fruit> extends Box<T>{
    private ArrayList<T> fruits;

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public BoxOrange(ArrayList<T> fruits) {
        super(fruits);
    }

}
