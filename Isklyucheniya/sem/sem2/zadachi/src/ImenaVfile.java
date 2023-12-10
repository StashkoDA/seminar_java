//Запишите в файл следующие строки:
//        Анна=4
//        Елена=5
//        Марина=6
//        Владимир=?
//        Константин=?
//        Иван=4
//        Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap, если
//        студенты с ним знакомы). В отдельном методе нужно будет пройти по структуре данных, если сохранено
//        значение ?, заменить его на соответствующее число.Если на каком-то месте встречается символ, отличный от
//        числа или ?, бросить подходящее исключение.Записать в тот же файл данные с замененными символами ?.

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ImenaVfile {
    public static void main(String[] args) {
        // адрес файла:
        String patch = "D:\\МИТЯ\\ГикБрейн\\Разработчик\\Java\\seminar_java\\Isklyucheniya\\sem\\sem2\\imenaVfile\\src\\names.txt";
        // создаём список:
        List<String[]> list = readFile(patch);
        modificationArray(list); // заменяем все знаки вопроса в списке на числа
        writeFile(list, patch); // сохраняем изменённый список в файл.
    }

    // метод чтения файла по указанному пути, выводящий массив строк:
    public static List<String[]> readFile(String patch) {
        List<String[]> listNames = new ArrayList<>(); // Список строк, к-рый мы по итогу вернём
        try {
            BufferedReader reader = new BufferedReader(new FileReader(patch)); // чтение текста файла из массива строк
            String line = ""; // создание строки, в к-рую мы будем считывать новую строку
            while ((line = reader.readLine()) != null) {// чтение строк в файле пока не прочитает все
                listNames.add(line.split("=")); // формирование строки без = и добавление в список
            }
        } catch (IOException e) { // обработка ошибки ввода/вывода данных
            System.out.println(e.getMessage());
        }
        return listNames;
    }

    // метод изменения данных:
    public static void modificationArray(List<String[]> arrayNames) {
        for (String[] itemArray : arrayNames) { // перебираем строки с массивами (имя, число)
            if (!itemArray[1].equals("?") && !checkNumber(itemArray[1])) { // если эл-т с индексом 1 не знак ? и не явл-ся числом
                throw new IllegalCallerException("Элемент не знак ? и не число"); // получили не верный аргумент
            }
            // если ошибки нет выше, то перезапишем строку без изменения. То есть если получили знак ?, то заменим
            // ? на длину строки
            itemArray[1] = String.valueOf(itemArray[0].length());
        }
    }

    public static boolean checkNumber(String value) {
        try {
            Integer.parseInt(value); // проверка успешности перевода строки в число
            return true;
        } catch (NumberFormatException e) { // обработка ошибки перевода строки в число
            return false;
        }
    }

    // Метод записи новых данных в файл (принимает список и путь к файлу):
    public static void writeFile(List<String[]> list, String patch) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(patch));
            for (String[] itemList : list) { // идём по списку
                //создаём строку со знаком = и записываем в файл
                writer.write(itemList[0] + "=" + itemList[1] + "\n");
            }
            writer.close(); // чтобы сохранить, закрываем запись в файл.
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}