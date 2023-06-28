package ru.geekbrains.lesson7.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Student implements Observer {

    List<JobVacancy> jobVacancyStudent = new ArrayList<>();

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
        //jobAgency.removeObserver(jobVacancyStudent);
    }

    @Override
    public void getVacancy(JobVacancy jobVacancy) {
        jobVacancyStudent.add(jobVacancy);
    }

    @Override
    public void receiveOffer(String companyName, JobVacancy jobVacancy, double salary) {
        for (JobVacancy jobVacancy1: jobVacancyStudent) {
            if (minSalary <= salary && jobVacancy1 == jobVacancy){
                System.out.printf("Студент %s (%f) >>> Мне нужна эта работа %s! [%s - %f]\n",
                        name, minSalary, jobVacancy.getNameVacancy(), companyName, salary);
                minSalary = salary;
                leaveAgency();
            }
            else {
                System.out.printf("Студент %s >>> Я найду работу получше (%f)! [%s - %f]\n",
                        name, minSalary, companyName, salary);
            }
        }

    }


}
