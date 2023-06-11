package ru.geekbrains.lesson3.task2;

import java.util.Comparator;

// implements Comparator<Employee> - имплементируем обобщённый интерфейс, для реализации сортировки.
public class SalaryComparator implements Comparator<Employee> {
    // Логика сравнения/сортировки по заработной плате:
    //если менять местами о1 и о2 в return, то меняется сортировка - убывание/возрастание
    @Override
    public int compare(Employee o1, Employee o2) {
        // 1 0 -1
        //return o1.calculateSalary() == o2.calculateSalary() ? 0 : (o1.calculateSalary() > o2.calculateSalary() ? 1 : -1);
        return Double.compare(o2.calculateSalary(), o1.calculateSalary());
    }
}
