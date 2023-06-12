package ru.geekbrains.lesson4.homework;

public class Apple extends Fruit{

    private float weight;

    @Override
    public float getWeight() {
        return 1.0f;
    }

    public Apple(float weight) {
        super(1.0f);
    }

}
