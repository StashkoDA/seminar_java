package ru.geekbrains.lesson6;

import ru.geekbrains.lesson6.srp2_zayavka.Order;
import ru.geekbrains.lesson6.srp2_zayavka.SaveFile;

public class Program {

    /**
     * TODO: Задача 1. Домашняя работа. Оптимизировать работу класса Order в  рамках принципа SRP.
     * Разбить класс Order на классы в зависимости от возможного расширения функционала.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new Order("", "", 0, 0);
        order.inputFromConsole();
        SaveFile saveFile = new SaveFile(order);
        saveFile.saveToJson();
    }

}
