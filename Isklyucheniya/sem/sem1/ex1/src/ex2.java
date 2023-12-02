//Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
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

public class ex2 {
    Scanner sc = new Scanner(System.in);
    public int ex2 () {
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