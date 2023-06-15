package ru.geekbrains.lesson4.homework_2variant;

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
        System.out.println("\n*** Фрукты ***\n");

        // Создадим коробку с 3 яблоками внутри
        Box<Apple> appleBox1 = new Box<>(
                new Apple(),
                new Apple(),
                new Apple()
        );

        // Создадим коробку с 500 яблоками внутри
        Box<Apple> appleBox2 = new Box<>();
        for (int i = 0; i < 500; i++) {
            appleBox2.add(new Apple());
        }

        // Создадим коробку с 2 апельсинами внутри
        Box<Orange> orangeBox1 = new Box<>(
                new Orange(),
                new Orange()
        );

        // Создадим коробку с 500 апельсинами внутри
        Box<Orange> orangeBox2 = new Box<>();
        for (int i = 0; i < 500; i++) {
            orangeBox2.add(new Orange());
        }

        // Отобразим общий вес фруктов по коробкам:
        System.out.println("Вес коробки 1 с яблоками: " + appleBox1.getWeight());
        System.out.println("Вес коробки 2 с яблоками: " + appleBox2.getWeight());
        System.out.println("Вес коробки 1 с апельсинами: " + orangeBox1.getWeight());
        System.out.println("Вес коробки 2 с апельсинами: " + orangeBox2.getWeight());
        System.out.println();

        // Сравнение веса коробок:
        System.out.println("Больше ли вес коробки 1 с яблоками (true - больше или равны): " + appleBox1.compare(orangeBox1));

        // Переложим фрукты из одной коробки в другую:
        orangeBox1.replaceAll(orangeBox2);
        // Результаты сортировки фруктов:
        System.out.println("Вес коробки 1 с яблоками после перекладки: " + orangeBox1.getWeight());
        System.out.println("Вес коробки 2 с яблоками после перекладки: " + orangeBox2.getWeight());

        //#endregion

    }


}
