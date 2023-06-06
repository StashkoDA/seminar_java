package ru.geekbrains.lesson3.task1;

public abstract class Animal {


    private int id;

    protected String name;
    protected int maxSwim;
    protected int maxRun;

    private static int counter;
    private static int identifier;

    public static int getIdentifier() {
        return identifier;
    }

    public static int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public int getMaxSwim() {
        return maxSwim;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getId() {
        return id;
    }

    // Статический инициализатор:
    static {
        System.out.println("Static Initializer");
        identifier = 2000; // Задаём исходник ID
    }

    // Обычный инициализатор:
    {
        System.out.println("Initializer");
        name = "Животное"; // Задаём значения полей по умолчанию
        maxRun = 10;
        maxSwim = 10;
        id = ++identifier; // Задание номера ID для каждого животного
        counter++; // Подсчёт количества животных
    }

    public Animal(String name, int maxSwim, int maxRun) {
        System.out.println("Constructor");

        this.name = name;
        this.maxSwim = maxSwim;
        this.maxRun = maxRun;
    }

    void run(int distance) {
        if (distance <= maxRun) {
            System.out.printf("%s пробежал %d метров\n", name, distance);
        } else System.out.printf("%s не смог пробежать %d метров\n", name, distance);
    }

    void swim(int distance) {
        if (distance <= maxSwim) {
            System.out.printf("%s проплыл %d метров\n", name, distance);
        } else System.out.printf("%s не смог проплыть %d метров\n", name, distance);
    }

}
