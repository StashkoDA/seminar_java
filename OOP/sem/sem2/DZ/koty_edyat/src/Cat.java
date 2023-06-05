public class Cat {
    private final String name;
    private final int appetite;
    private final boolean satiety;

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public boolean eat() {
        if (!satiety) {
            System.out.printf("%s покушал(а) в обёме: %d\n", name, appetite);
            return true;
        }
        return false;
    }
}
