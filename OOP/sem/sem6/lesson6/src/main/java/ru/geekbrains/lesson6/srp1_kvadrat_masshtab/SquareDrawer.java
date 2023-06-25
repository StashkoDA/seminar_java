package ru.geekbrains.lesson6.srp1_kvadrat_masshtab;

public class SquareDrawer {

    private final Square square;
    private int scale = 1;

    /**
     * Задаём квадрат и величину масштаба:
     * @param square
     * @param scale
     */
    public SquareDrawer(Square square, int scale) {
        this.square = square;
        this.scale = scale;
    }

    /**
     * Задаём квадрат, если величина масштаба = 1
     * @param square
     */
    public SquareDrawer(Square square) {
        this.square = square;
    }

    public Square getSquare() {
        return square;
    }

    public int getScale() {
        return scale;
    }

    /**
     * Отрисовка квадрата с учётом масштаба:
     */
    public void draw(){
        for (int i = 0; i < square.getSide() * scale * 2; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < square.getSide() * scale - 2; i++) {
            System.out.print("*");
            for (int j = 1; j < square.getSide() * scale * 2 - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < square.getSide() * scale * 2; i++) {
            System.out.print("*");
        }
    }

}
