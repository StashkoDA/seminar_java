//Напишите программу, которая принимает символ a в качестве аргумента и выполняет следующую проверку:
//если символ a равен пробелу '', программа должна выбрасывать исключение с сообщением
//"Пустая строка введена.".
//В противном случае программа должна возвращать сообщение
//"Ваш ввод - [символ]", где [символ] заменяется на введенный символ a.

public class ThrowsException {
    public static void main(String[] args) {
        char a;

        if (args.length == 0) {
            a = '@'; // Значение по умолчанию, если аргументы не были предоставлены
        } else {
            a = args[0].charAt(0); // Преобразуйте первый аргумент командной строки в символ
        }

        try {
            String result = Expr.expr(a);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }

    class Expr {
        public static String expr(char a) throws Exception {
// Введите свое решение ниже
            if (a != ' ') {
                return "Введён символ - " + a;
            } else {
                throw new Exception("Введена пустая строка.");
            }
        }
    }
}

