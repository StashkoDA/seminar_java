//1. Напишите метод,на вход которогоподаётся двумерный строковый массив
//размером 4х4. При подаче массива другого размера необходимо бросить
//исключение MyArraySizeException.
//2. Далееметод долженпройтисьпо всем элементам массива,преобразоватьв
//int и просуммировать. Если в каком-то элементе массива преобразование
//не удалось (например, в ячейке лежит символ или текст вместо числа),
//должно быть брошено исключение MyArrayDataException с детализацией, в
//какой именно ячейкележат неверныеданные.
//3. В методе main() вызвать полученный метод, обработать возможные
//исключения MyArraySizeException и MyArrayDataException и вывести
//результатрасчета (сумму элементов,при условиичто подали на вход
//корректныймассив).

public class Ex4_Array {
    public static int checkArray(String[][] array) {
        if (array.length != 4 || array[0].length != 4) throw new MyArraySizeException(array.length, array[0].length);
        int sum = 0;
        for (String[] arr: array) {
            for (String i: arr) {
                try {
                    sum += Integer.parseInt(i);
                } catch (NumberFormatException e) {
                    throw new MyArraySizeException();
                }
            }
        }
        return sum;
    }
}

class MyArraySizeException extends RuntimeException {
    public MyArraySizeException (int row, int colum) {
        super("Массив должен быть 4х4, размеры вашего массива -> " + row + "x" + colum);
    }
    public MyArraySizeException() {
        super("Массив должен быть 4х4");
    }
}

class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException() {
        super("В каком-то элементе массива преобразование не удалось");
    }
    public MyArrayDataException(int i, int j) {
        super("Преобразование не удалось, индекс -> " + i + ":" +j);
    }
}
