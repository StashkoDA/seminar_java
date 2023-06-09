package ru.geekbrains.lesson4.homework;

import java.util.*;

public class Program {

    /**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
     */
    public static void main(String[] args) {
        Box<Apple> box1 = new Box<>("apple");
        box1.addFruit(new Apple("apple1", 1.0f));
        box1.addFruit(new Apple("apple2", 1.0f));

        Box<Apple> box11 = new Box<>("apple11");
        box11.addFruit(new Apple("apple1", 1.0f));
        box11.addFruit(new Apple("apple2", 1.0f));
        box11.addFruit(new Apple("apple2", 1.0f));

        Box<Orange> box2 = new Box<>("orange");
        box2.addFruit(new Orange("orange1", 1.5f));
        box2.addFruit(new Orange("orange2", 1.5f));

        box1.PrintGetWeight();
        box11.PrintGetWeight();
        box2.PrintGetWeight();

        box1.compare(box2);
        // Переложим фрукты из одной коробки в другую:
        box1.replaceAll(box11);
        // Результаты сортировки фруктов:

            System.out.println("Вес коробки 1 с яблоками после перекладки: " + box1.getWeight());
            System.out.println("Вес коробки 11 с яблоками после перекладки: " + box11.getWeight());
    }


}
