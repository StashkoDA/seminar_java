package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Student implements Observer {

    private static Random random = new Random();
    private Publisher jobAgency;
    private String name;

    private double minSalary;

    public Student(Publisher jobAgency, String name) {
        this.jobAgency = jobAgency;
        this.name = name;
        minSalary = random.nextDouble(2000, 4000);
    }

    @Override
    public void leaveAgency() {
        System.out.printf("Студент %s >>> Я отказываюсь от услуг агентства %s\n",
                name, jobAgency);
        jobAgency.removeObserver();
    }

    @Override
    public void receiveOffer(String companyName, double salary) {
        if (minSalary <= salary){
            System.out.printf("Студент %s (%f) >>> Мне нужна эта работа! [%s - %f]\n",
                    name, minSalary, companyName, salary);
            minSalary = salary;
            leaveAgency();
        }
        else {
            System.out.printf("Студент %s >>> Я найду работу получше (%f)! [%s - %f]\n",
                    name, minSalary, companyName, salary);
        }
    }


}
