package ru.geekbrains.lesson7.observer;

public interface Observer {     // Наблюдатель

    void receiveOffer(String companyName, JobVacancy jobVacancy, double salary); // Получить предложение от работодателя
    void leaveAgency(); // Наблюдатель отказывается от услуг агентства
    void getVacancy(JobVacancy jobVacancy);
}
