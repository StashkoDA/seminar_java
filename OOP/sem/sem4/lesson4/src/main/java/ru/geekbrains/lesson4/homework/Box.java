package ru.geekbrains.lesson4.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Box <T extends Fruit>{
    List<T> container;
    private String name;

    public Box(String name) {
        this.container = new ArrayList<>();
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void addFruit(T fruit) {         // добавление фруктов
        container.add(fruit);
    }
    public float getWeight() {
        if (container.size() == 0) {
            return 0;
        } else {
            float weight = container.get(0).getWeight() * container.size();
            return weight;
        }
    }
    public float PrintGetWeight() {
        if (container.size() == 0) {
            return 0;
        } else {
            float weight = container.size() * container.get(0).getWeight();
            System.out.println("Вес коробки с " + name + ": " + weight);
            return weight;
        }
    }

    public boolean compare(Box <? extends Fruit> other) {
        if (this.getWeight() > other.getWeight()) {
            System.out.printf("Вес коробки %s больше %s\n", this.name, other.name);
            return true;
        }
        if (this.getWeight() < other.getWeight()) {
            System.out.printf("Вес коробки %s меньше %s\n", this.name, other.name);
            return true;
        } else {
            System.out.printf("Вес коробки %s равен весу %s\n", this.name, other.name);
            return false;
        }
    }

    //// или без консоли:
//    public void compare(Box <? extends Fruit> other) {
//        System.out.println(this.getWeight() > other.getWeight());
//    }

    /**
     * Переместить все фрукты из другой коробки в текущую (3f)
     * @param other - другая коробка
     */
    public void replaceAll(Box<T> other) {
        other.getFruits().addAll(container);
        container.clear();
    }

    /**
     * Получить все фрукты в коробке (вспомогательный метод, 3f)
     * @return
     */
    public List<T> getFruits() {
        return container;
    }

}
