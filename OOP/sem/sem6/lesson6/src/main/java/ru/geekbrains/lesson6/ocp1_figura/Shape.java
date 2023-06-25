package ru.geekbrains.lesson6.ocp1_figura;

/**
 * Фигура
 */
public class Shape {

    private ShapeType type;


    public Shape(ShapeType type) {
        this.type = type;
    }

    public ShapeType getType() {
        return type;
    }
}
