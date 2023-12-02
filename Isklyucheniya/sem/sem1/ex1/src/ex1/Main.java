package ex1;//ex1. Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
//Если длина массива меньше некоторого заданного минимума,
//метод возвращает -1, в качестве кода ошибки, иначе - длину массива.

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(getLength(arr, 2));
    }

    public static int getLength(int[] array, int minLength) {
        if (array.length < minLength) {
            return -1;
        }
        return array.length;
    }
}