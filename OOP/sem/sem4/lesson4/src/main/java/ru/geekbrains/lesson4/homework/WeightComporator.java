package ru.geekbrains.lesson4.homework;

import java.util.Comparator;

public class WeightComporator implements Comparator <Box> {
    @Override
    public int compare(Box o1, Box o2) {
        return Double.compare(o2.getWeight(), o1.getWeight());
    }
}
