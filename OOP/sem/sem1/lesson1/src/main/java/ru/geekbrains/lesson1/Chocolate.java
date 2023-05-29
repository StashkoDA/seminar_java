package ru.geekbrains.lesson1;

public class Chocolate extends Product {
    public int kilocalories;

    public int getKilocalories() {
        return kilocalories;
    }

    public void setKilocalories(int kilocalories) {
        this.kilocalories = kilocalories;
    }

    public Chocolate(String brand, String name, double price, int kilocalories) {
        super(brand, name, price);
        this.kilocalories = kilocalories;
    }

    @Override
    public String displayInfo() {
        return String.format("[Шоколад]%s - %s - [цена: %f] - [килокалорий: %d]", brand, name, price, kilocalories);
    }
}
