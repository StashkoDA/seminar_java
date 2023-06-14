package ru.geekbrains.lesson4.homework;

public abstract  class Fruit {

    private final String name;
    private final float weight;

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public Fruit(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }
}
