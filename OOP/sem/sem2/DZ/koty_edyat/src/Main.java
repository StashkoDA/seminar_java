import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 5, false);
        Cat cat2 = new Cat("Марыся", 10, false);
        Cat cat3 = new Cat("Брюс", 15, false);
        Cat cat4 = new Cat("Муся", 10, false);
        Plate plate = new Plate(35);
        plate.info();
        List<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);

        processEat(cats, plate);

    }

    static void processEat(List<Cat> cats, Plate plate) {
        for (Cat cat: cats) {
            if (plate.getFood() > cat.getAppetite()) {
                cat.eat();
                plate.setFood(plate.getFood() - cat.getAppetite());
                plate.info();
            } else {
                plate.addition(plate, cat);
            }

        }
    }

}


