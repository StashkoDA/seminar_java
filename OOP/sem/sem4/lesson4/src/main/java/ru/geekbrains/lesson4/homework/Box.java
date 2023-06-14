package ru.geekbrains.lesson4.homework;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit>{
    List<T> container;
    private String name;

    public Box(String name) {
        this.container = new ArrayList<>();
        this.name = name;
        System.out.printf("\n  >>  %s created\n",this.name);

    }
    public void addFruit(T fruit) {         // добавление фруктов
        container.add(fruit);
    }
    public void getWeight() {
        float weight = container.get(0).getWeight() * container.size();
        System.out.println("Вес коробки с " + name + ": " + weight);
    }


//    public List<T> getContainer() {
//        return container;
//    }
//
//    public void setContainer(List<T> container) {
//        this.container = container;
//    }

//    public Box(List<T> container) {
//        this.container = container;
//    }

//    }
//    public int compare(Box<T extends Fruit> other);
//
}
