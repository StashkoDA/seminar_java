package ru.geekbrains.lesson3.task2;

// implements Comparable<Employee> - имплементируем обобщённый интерфейс, для реализации сортировки.

public abstract class Employee implements Comparable<Employee> {

    protected String name;
    protected String surname;
    protected double salary; // Ставка заработной платы
    protected Integer age;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public Integer getAge() {
        return age;
    }

    public Employee(String name, String surname, Integer age, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.age = age;
    }

    /**
     * Расчет среднемесячной заработной платы
     * @return
     */
    public abstract double calculateSalary();

        // Сортировка по принципу: 1 - ставит выше, 0 - равны/однинаковы, -1 - ставит ниже.
//    @Override
//    public int compareTo(Employee o) { // сортировка по зарплате через компоратор 'SalaryComparator'
//        int res = name.compareTo(o.name);
//        if (res == 0){
//            return Double.compare(calculateSalary(), o.calculateSalary());
//        }
//        return res;
//    }


    @Override
    public int compareTo(Employee o) {    // сортировка по зарплате через компоратор 'AgeComporator'
        int res = name.compareTo(o.name);
        if (res == 0){
            return Double.compare(age, o.age);
        }
        return res;
    }
}
