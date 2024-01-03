public class Main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();

        Toy toy1 = new Toy(1, "Cheburashka", 5, 20);
        toyStore.addToy(toy1);

        Toy toy2 = new Toy(2, "Doll Masha", 10, 30);
        toyStore.addToy(toy2);

        Toy toy3 = new Toy(3, "Robot", 15, 40);
        toyStore.addToy(toy3);

        toyStore.showAvailableToys();

        toyStore.updateToyWeight(3, 50);

        toyStore.playToys();

        toyStore.showAvailableToys();
    }
}