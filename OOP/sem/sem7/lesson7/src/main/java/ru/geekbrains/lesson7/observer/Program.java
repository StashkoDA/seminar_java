package ru.geekbrains.lesson7.observer;

public class Program {

    /**
     * TODO: 1. Доработать приложение, поработать с шаблоном проектирования Observer,
     *  добавить свой собственный тип/типы соискателя.
     *  2**. Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  3**. Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();

        JobVacancy programmer = new JobVacancy("Programmer");
        JobVacancy tester = new JobVacancy("Tester");
        JobVacancy director = new JobVacancy("Director");

        Company geekBrains = new Company("GeekBrains", 70000, jobAgency);
        Company google = new Company("Google", 100000, jobAgency);
        Company yandex = new Company("Yandex", 120000, jobAgency);

        Master ivanov = new Master(jobAgency,"Ivanov");
        ivanov.getVacancy(programmer);
        Master petrov = new Master(jobAgency,"Petrov");
        petrov.getVacancy(programmer);
        Student sidorov = new Student(jobAgency, "Sidorov");
        sidorov.getVacancy(tester);
        Supervisor krasnov = new Supervisor(jobAgency,"Krasnov");
        krasnov.getVacancy(director);

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(krasnov);

        geekBrains.getVacancyAgency(programmer);
        google.getVacancyAgency(tester);
        yandex.getVacancyAgency(director);


        for (int i = 0; i < 5; i++){
            geekBrains.needEmployee();
            google.needEmployee();
            yandex.needEmployee();
        }
    }

}
