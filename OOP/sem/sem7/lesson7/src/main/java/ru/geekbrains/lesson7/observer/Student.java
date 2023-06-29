package ru.geekbrains.lesson7.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Student implements Observer {

    List<JobVacancy> jobVacancyStudents = new ArrayList<>();

    private static Random random = new Random();
    private Publisher jobAgency;
    private String name;
    private double minSalary;

    public String getName() {
        return name;
    }

    public Student(Publisher jobAgency, String name) {
        this.jobAgency = jobAgency;
        this.name = name;
        minSalary = random.nextDouble(2000, 4000);
    }

    @Override
    public void getVacancy(JobVacancy jobVacancy) {
        jobVacancyStudents.add(jobVacancy);
    }

    @Override
    public void receiveOffer(String companyName, JobVacancy jobVacancy, double salary) {
        for (JobVacancy jobVacancy1: jobVacancyStudents) {
            if (minSalary <= salary && jobVacancy1 == jobVacancy){
                System.out.printf("Студент %s (%f) >>> Мне нужна эта работа %s! [%s - %f]\n",
                        name, minSalary, jobVacancy.getNameVacancy(), companyName, salary);
                minSalary = salary;
                System.out.printf("Студент %s >>> Я отказываюсь от услуг агентства\n", name);
                //.removeObserver();
            }
            else {
                System.out.printf("Студент %s >>> Я найду работу получше (%f)! [%s - %f]\n",
                        name, minSalary, companyName, salary);
            }
        }

    }


}
