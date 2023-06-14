package ru.geekbrains.lesson4.homework;

public class Apple extends Fruit{
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

    public Apple(String name, float weight) {
        super(name, 1.0f);
    }


}
