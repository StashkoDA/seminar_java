package ru.geekbrains.lesson6.isp;

/**
 * Способы проведения платежа
 */
public interface Payable {
    void payWebMoney(int amount);
    void payCreditCard(int amount);
    void payPhoneNumber(int amount);
}
