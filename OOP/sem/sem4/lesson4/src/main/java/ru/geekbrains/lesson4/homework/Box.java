package ru.geekbrains.lesson4.homework;

import java.util.ArrayList;

public class Box <T extends Fruit>{

    private ArrayList<T> fruits;

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }
}
