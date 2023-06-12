package ru.geekbrains.lesson4.homework;

import java.util.ArrayList;

public class BoxApple <T extends Fruit> extends Box<T>{
    private ArrayList<T> fruits;

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public BoxApple(ArrayList<T> fruits) {
        super(fruits);
    }

}
