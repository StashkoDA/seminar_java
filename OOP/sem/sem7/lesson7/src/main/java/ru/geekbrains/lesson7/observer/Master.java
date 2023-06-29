package ru.geekbrains.lesson7.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Master implements Observer {

    List<JobVacancy> jobVacancyMasters = new ArrayList<>();
    private static Random random = new Random();

    private Publisher jobAgency;
    private String name;
    private double minSalary;

    public Master(Publisher jobAgency, String name) {
        this.jobAgency = jobAgency;
        this.name = name;
        minSalary = random.nextDouble(60000, 80000);
    }

    @Override
    public void receiveOffer(String companyName, JobVacancy jobVacancy, double salary) {
        for (JobVacancy jobVacancy1: jobVacancyMasters) {
            if (minSalary <= salary && jobVacancy1 == jobVacancy){
                System.out.printf("Рабочий %s (%f) >>> Мне нужна эта работа %s! [%s - %f]\n",
                        name, minSalary, jobVacancy.getNameVacancy(), companyName, salary);
                minSalary = salary;
                System.out.printf("Рабочий %s >>> Я отказываюсь от услуг агентства\n", name);
                //jobAgency.removeObserver();
            }
            else {
                System.out.printf("Рабочий %s >>> Я найду работу получше (%f)! [%s - %f]\n",
                        name, minSalary, companyName, salary);
            }
        }
    }

    @Override
    public void getVacancy(JobVacancy jobVacancy) {
        jobVacancyMasters.add(jobVacancy);
    }
}
