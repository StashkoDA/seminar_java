public class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("В тарелке осталось еды: " + food);
    }
    public boolean addition(Plate plate, Cat cat) {
        System.out.printf("%s не смог(ла) покушать в обёме: %d," +
                "остался(ась) голодным(ой)\n", cat.getName(), cat.getAppetite());
        System.out.println("В тарелку добавлено еды: " + (cat.getAppetite() - plate.getFood()));
        setFood(plate.getFood() + (cat.getAppetite() - plate.getFood()));
        if (!cat.isSatiety()) {
            System.out.printf("%s покушал(а) в обёме: %d\n", cat.getName(), cat.getAppetite());
            return true;
        }
        return false;
    }
}