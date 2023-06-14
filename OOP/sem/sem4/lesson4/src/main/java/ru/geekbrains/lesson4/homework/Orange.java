package ru.geekbrains.lesson4.homework;

public class Orange extends Fruit {
    private String orange;
    private float weight;

    @Override
    public String getOrange() {
        return orange;
    }

    @Override
    public float getWeight() {
        return weight;
    }

    public Orange(String orange, float weight) {
        super(orange, 1.5f);
    }
}
