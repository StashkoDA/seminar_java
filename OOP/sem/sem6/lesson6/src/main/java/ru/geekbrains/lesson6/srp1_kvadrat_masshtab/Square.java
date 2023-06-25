package ru.geekbrains.lesson6.srp1_kvadrat_masshtab;

import java.util.ArrayList;
import java.util.List;

/**
 * Задаём параметры квадрата
 * @Square
 */
public class Square {

    /**
     * Исходная точка
     * @points
     */
    private List<Point> points;

    /**
     * длина стороны квадрата
     * @side
     */
    private int side;

    /**
     * Масштаб отображения
     * @scale
     */
    private int scale;

    /**
     * Задаём координаты точки квадрата
     * @param point1
     * @param side
     */
    public Square(Point point1, int side) {
        this.side = side;

        Point point2 = new Point(point1.getX() + side, point1.getY());
        Point point3 = new Point(point1.getX() + side, point1.getY() + side);
        Point point4 = new Point(point1.getX(), point1.getY() + side);

        points = new ArrayList<>(4);
        points.add(point1);
        points.add(point2);
        points.add(point3);
        points.add(point4);

    }

    public int getSide() {
        return side;
    }

    public List<Point> getPoints() {
        return points;
    }

    /**
     * Площадь квадрата
     * @return
     */
    public int getArea(){
        return side * side;
    }



}
