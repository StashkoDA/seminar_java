package ex2;//Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
//Метод ищет в массиве заданное значение и возвращает его индекс. При этом,
//например:
//1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в
//качестве кода ошибки.
//2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//3. если вместо массива пришел null, метод вернет -3
//4. придумайте свои варианты исключительных ситуаций и верните соответствующие
//коды ошибок.
//Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот
//метод запросит искомое число у пользователя, вызовет первый, обработает возвращенное
//значение и покажет читаемый результат пользователю. Например, если вернулся -2,
//пользователю выведется сообщение: “Искомый элемент не найден”.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        message(array,5,10); // получить ошибку -1
        message(array,7,4); // получить ошибку -2
        message(null,5,4); // получить ошибку -3
        message(array,3,4); // корректный результат
    }
    public static int findElem(int[] array, int number, int minLength) {
        if(array == null) // Проверяем не нулевой ли массив
            return -3;
        if (array.length < minLength) { // Проверяем длина массива меньше минимума?
            return -1;
        }
        for (int i = 0; i < array.length; i++) { // Ищим заданный элемент number в массиве
            if (array[i] == number)
                return i;
        }
        return -2;
    }

    public static void message(int[] array, int number, int minLength) {
        int result = findElem(array, number, minLength);
        if(result == -1)
            System.out.println("Длина массива меньше минимума");
        else if (result == -2)
            System.out.println("Элемент не найден");
        else if (result == -3)
            System.out.println("Массив null");
        else
            System.out.println("Индекс искомого элемента: " + result);
    }
}