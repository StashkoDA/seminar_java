package ru.geekbrains.lesson4.homework;

public class Orange extends Fruit {
    private String name;
    private float weight;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getWeight() {
        return weight;
    }

    public Orange(String name, float weight) {
        super(name, 1.5f);
    }
}
