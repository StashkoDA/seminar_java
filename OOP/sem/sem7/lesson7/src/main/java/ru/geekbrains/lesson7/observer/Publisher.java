package ru.geekbrains.lesson7.observer;

public interface Publisher {    // Интерфейс для взаимодействия Компании и Агентства

    /**
     * Регистрация нового наблюдателя
     * @param observer
     */
    void registerObserver(Observer observer); // Регистрация соискателя работы

    /**
     * Убрать наблюдателя из списка
     * @param observer
     */
    void removeObserver(Observer observer);


    /**
     * Компания отправляет новую вакансию
     * @param companyName
     * @param salary
     */
    void sendOffer(String companyName, JobVacancy jobVacancy, double salary);

}
