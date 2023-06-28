package ru.geekbrains.lesson7.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Supervisor implements Observer{

    List<JobVacancy> jobVacancySupervisors = new ArrayList<>();
    private static Random random = new Random();

    private Publisher jobAgency;
    private String name;
    private double minSalary;

    public Supervisor(Publisher jobAgency, String name) {
        this.jobAgency = jobAgency;
        this.name = name;
        minSalary = random.nextDouble(80000, 120000);
    }

    @Override
    public void receiveOffer(String companyName, JobVacancy jobVacancy, double salary) {
        for (JobVacancy jobVacancy1: jobVacancySupervisors) {
            if (minSalary <= salary && jobVacancy1 == jobVacancy){
                System.out.printf("Руководитель %s (%f) >>> Мне нужна эта работа %s! [%s - %f]\n",
                        name, minSalary, jobVacancy.getNameVacancy(), companyName, salary);
                minSalary = salary;
                leaveAgency();
            }
            else {
                System.out.printf("Руководитель %s >>> Я найду работу получше (%f)! [%s - %f]\n",
                        name, minSalary, companyName, salary);
            }
        }
    }

    @Override
    public void leaveAgency() {
        System.out.printf("Студент %s >>> Я отказываюсь от услуг агентства %s\n",
                name, jobAgency);
        //jobAgency.removeObserver();
    }

    @Override
    public void getVacancy(JobVacancy jobVacancy) {
        jobVacancySupervisors.add(jobVacancy);
    }
}
