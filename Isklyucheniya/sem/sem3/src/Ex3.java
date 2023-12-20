//Создайте класс исключения, который будет выбрасываться при делениина 0.
//Исключение должно отображать понятное для пользователя сообщение об ошибке.

import java.io.FileNotFoundException;

public class Ex3 {
    public static void main(String[] args) {
        try { // Запускаем проверку деления на ноль
            System.out.println(delenie(10, 5));
            System.out.println(delenie(6, 4));
            System.out.println(delenie(5, 0));
        } catch (DelenireNaNol e) {
            System.out.println(e.getMessage());
        }
    }

    public static double delenie(int a, int b) { // Метод проверки на ошибку деления на ноль.
        if (b == 0) {
            throw new DelenireNaNol();
        }
        return (double) a / b;
    }
}

class DelenireNaNol extends ArithmeticException { // Создаём класс исключения Деления на ноль, наследованный
                                                  // от стандартного исключеня математической ошибки
    public DelenireNaNol() {                 // Конструктор родительского класса с передачей сообщения пользователю:
        super("Деление на ноль запрещено!");   // деление на ноль запрещено.
    }
}

//Создайте класс сключений, котороебудет возникать при обращении к
//пустому элементу в массиве ссылочного типа. Исключение должно
//отображать понятное для пользователя сообщение об ошибке.


class NullPointerArray extends NullPointerException { // Конструктор принимает число и сообщает,
    public NullPointerArray(int index) {              // что Обращение к пустому элементу в массиве запрещено и
                                                      // показывает итдекс элемента
        super("Обращение к пустому элементу в массиве запрещено, индекс элемента: " + index);
    }

    public NullPointerArray(){ // Конструктор принимает число и сообщает, что Обращение к пустому элементу в массиве запрещено
        super("Обращение к пустому элементу в массиве запрещено ");
    }
}

//Создайте класс исключения, которое будет возникать при попытке открыть
//несуществующий файл. Исключение должно отображать понятное для
//пользователя сообщение об ошибке.

class NotFile extends FileNotFoundException {
    public NotFile(String path) {
        super("Открыть несуществующий файл нельзя, ваш путь к файлу -> " + path);
    }
    public NotFile() { // Консруктор принимает строку с адресом и указывает на ошибку
        super("Открыть несуществующий файл нельзя");
    }
}


