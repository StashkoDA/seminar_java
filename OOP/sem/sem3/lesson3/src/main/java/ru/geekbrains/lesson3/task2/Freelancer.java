package ru.geekbrains.lesson3.task2;

// 20 * 8

/**
 * TODO: Спроектировать класс Freelancer самостоятельно в рамках домашнего задания
 */
public class Freelancer extends Employee {

    public Freelancer(String name, String surname, int age,  double salary) {
        super(name, surname, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s - %d (лет); Freelancer; Среднемесячная заработная плата (почасовая оплата за месяц): %.2f (руб.)",
                surname, name, age, calculateSalary());
    }


}
