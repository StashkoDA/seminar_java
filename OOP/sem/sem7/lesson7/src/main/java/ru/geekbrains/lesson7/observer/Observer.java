package ru.geekbrains.lesson7.observer;

public interface Observer {     // Наблюдатель

    void receiveOffer(String companyName, JobVacancy jobVacancy, double salary); // Получить предложение от работодателя
    void getVacancy(JobVacancy jobVacancy);
}
