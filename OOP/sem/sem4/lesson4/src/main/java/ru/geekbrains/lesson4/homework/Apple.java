package ru.geekbrains.lesson4.homework;

public class Apple extends Fruit{
    private String apple;
    private float weight;

    @Override
    public String getApple() {
        return apple;
    }

    @Override
    public float getWeight() {
        return weight;
    }

    public Apple(String apple, float weight) {
        super(apple, 1.0f);
    }


}
