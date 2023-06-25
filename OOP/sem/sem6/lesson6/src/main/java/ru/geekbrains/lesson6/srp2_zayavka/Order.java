package ru.geekbrains.lesson6.srp2_zayavka;

import java.util.Scanner;

public class Order {

    private Scanner scanner = new Scanner(System.in);

    private String clientName;
    private String product;
    private int qnt; // Кол-во
    private int price; // Цена

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public int getPrice() {
        return price;
    }


    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    /**
     * Метод запросов инф-ции
     */
    public void inputFromConsole(){

        clientName = prompt("Имя клиента: ");
        product = prompt("Продукт: ");
        qnt = Integer.parseInt(prompt("Кол-во: "));
        price = Integer.parseInt(prompt("Цена: "));
    }

    private String prompt(String message){
        System.out.println(message);
        return scanner.nextLine();
    }
}
