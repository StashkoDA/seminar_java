package ru.geekbrains.lesson6.isp;

/**
 * Канал проведения платежа
 */
public class InternetPaymentService extends PaymentService implements CreditCardPayable, WebMoneyPayable, PhonePayable {
    @Override
    public void payWebMoney(int amount) {
        System.out.printf("Internet pay by web money %d\n", amount); // Оплата интернета вебмани
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Internet pay by credit card %d\n", amount);
    }

    @Override
    public void payPhoneNumber(int amount) {
        System.out.printf("Internet pay by phone number %d\n", amount);
    }
}
