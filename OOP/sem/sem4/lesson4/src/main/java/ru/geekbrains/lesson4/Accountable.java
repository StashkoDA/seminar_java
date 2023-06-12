package ru.geekbrains.lesson4;

/**
 * обобщённый интерфейс
 * @param <T>
 */
public interface Accountable<T> {

    T getId();

    double getAmount();

    void setAmount(double amount);

}
