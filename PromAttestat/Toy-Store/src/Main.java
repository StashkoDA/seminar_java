public class Main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();

        Toy toy1 = new Toy(1, "Чебурашка", 5, 20);
        toyStore.addToy(toy1);

        Toy toy2 = new Toy(2, "Кукла Маша", 10, 30);
        toyStore.addToy(toy2);

        Toy toy3 = new Toy(3, "Робот", 15, 40);
        toyStore.addToy(toy3);

        toyStore.showAvailableToys();

        toyStore.updateToyWeight(3, 90);

        toyStore.playToys();

        toyStore.showAvailableToys();
    }
}