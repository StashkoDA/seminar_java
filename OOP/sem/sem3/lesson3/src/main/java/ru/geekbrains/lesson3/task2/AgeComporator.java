package ru.geekbrains.lesson3.task2;

import java.util.Comparator;

public class AgeComporator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o2.age, o1.age);
    }
}
