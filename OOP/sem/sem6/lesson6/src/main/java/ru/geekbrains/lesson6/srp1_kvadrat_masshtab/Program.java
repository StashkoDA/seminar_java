package ru.geekbrains.lesson6.srp1_kvadrat_masshtab;

public class Program {

    public static void main(String[] args) {

        Square square = new Square(new Point(1, 1), 5);
        System.out.printf("Площадь фигуры: %d , масштаб: %d \n", square.getArea(), 1);
        SquareDrawer squareDrawer1 = new SquareDrawer(square, 1);
        squareDrawer1.draw();
        System.out.println();
        System.out.printf("Площадь фигуры: %d, масштаб: %d \n", square.getArea(), 3);
        SquareDrawer squareDrawer2 = new SquareDrawer(square, 3);
        squareDrawer2.draw();


    }

}
