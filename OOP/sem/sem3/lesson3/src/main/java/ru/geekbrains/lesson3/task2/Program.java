package ru.geekbrains.lesson3.task2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Program {

    static Random random = new Random();

    /**
     * TODO: Переработать метод generateEmployee в рамках домашнего задания,
     *  метод должен генерировать рабочих (Employee) разных типов.
     * @return
     */
    static Employee generateEmployee(int i){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int age = random.nextInt(18, 60);
        if (i % 2 == 0){
            int salary = random.nextInt(20000, 80000);
            return new Worker(names[random.nextInt(10)], surnames[random.nextInt(surnames.length)], age, salary);

        } else {
            int coefficient = 500;
            int days = random.nextInt(10, 20);
            int salary = 8*days*coefficient;
            return new Freelancer(names[random.nextInt(10)], surnames[random.nextInt(surnames.length)], age, salary);

        }
    }


    /**
     * TODO: Придумать новые состояния для наших сотрудников
     *   Придумать несколько Comparator'ов для сортировки сотрудников
     *   по фамилии + имени или по возрасту + уровню зп.
     * @param args
     */
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++)
        {
            employees[i] = generateEmployee(i);
        }

        // Сортировка по имени:
        // System.out.println("Cортировка по имени: ");
//        Arrays.sort(employees);
//
//        for (Employee employee: employees) {
//            System.out.println(employee);
//        }

//        // или сортировка по зарплате через компоратор:
//        System.out.println("Cортировка по зарплате: ");
//        Arrays.sort(employees, new SalaryComparator());
//        for (Employee employee: employees) {
//            System.out.println(employee);
//        }

        // или сортировка по возрасту через компоратор:
        System.out.println("Cортировка по возрасту: ");
        Arrays.sort(employees, new AgeComporator());
        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }

}
