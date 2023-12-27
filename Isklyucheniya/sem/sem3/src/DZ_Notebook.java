//Напишите приложение, которое будет запрашивать упользователя следующие данные в произвольномпорядке,
//разделенные пробелом: ФамилияИмя Отчество, дата_рождения,номер_телефона,пол
//Форматы данных:фамилия,имя, отчество - строки дата_рождения- строка формата dd.mm.yyyy
//номер_телефона - целое без знаковое число без форматирования пол - символ латиницей f или m.
//Критерии:
// Приложение должно проверить введенные данные по количеству. Если количествоне совпадает с требуемым,
//вернуть код ошибки, обработать его и показать пользователю сообщение, что он ввел меньше и больше
//данных, чем требуется.
// Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры.
//Если форматы данных не совпадают,нужно бросить исключение, соответствующее типу проблемы. Можно
//использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано,
//пользователю выведено сообщение с информацией, что именно неверно.
// Если всё введено и обработано верно, должен создаться файл с названием,равным фамилии, в него в одну
//строку должны записаться полученные данные, вида:
//<Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>.
//Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
//Не забудьте закрыть соединение с файлом.
//При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано,
//пользователь должен увидеть стектрейс ошибки.
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.zip.DataFormatException;

import static java.lang.Integer.parseInt;

public class DZ_Notebook {
    public static void main(String[] args) {
        System.out.println("Записная книжка ");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите через пробел: фамилию, дату рождения (формата dd.mm.yyyy)," +
                "номер телефона (формат 89991112233), пол (формат f или m): ");
        String data = in.nextLine();
        System.out.println(data);
        options(data);
        System.out.print(errorOptions(data));
    }

    public static void options(String data) {

        String[] els = data.split(" ");

        try {
            if (els.length == 6) {
                System.out.println("Введено нужное количество параметров: " + els.length);
            } else if (els.length < 6) {
                System.out.println("Введено недостаточное количество параметров: меньше 6");
                String e = els[5];
            } else {
                System.out.println("Введено избыточное количество параметров: больше 6");
                String e = els[els.length];
            }
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Повторите попытку.");
            }
    }

    public static String[] errorOptions(String data)  {
        String[] els = data.split(" ");
        String[] res = new String[6];
        SimpleDateFormat ft = new SimpleDateFormat ("dd.MM.yyyy");

        Date etalonMin = new Date(1900,01,01);
        Date etalonMax = new Date(2023,12,01);

        int count = 0;

        for (String el: els) {

            // Проверяем правльность ввода гендера:
            if (el == "f" || el == "m") {
                res[5] = el;
            } else if ((el.length() == 1) && (!el.equals("f")) && !(el.equals("m"))) {
                System.out.println("Введён не правильно гендер");
            }


            try {
                String[] elData = el.split("."); // Преобразуем дату в массив строк для анализа

                if (el.matches("\\d{12}")) { // Проверяем номер телефона:
                    parseInt(el);
                    res[4] = el;
                    break;
                } else if (el.length() != 11 && el.matches("\\d*")){
                    parseInt(el);
                    res[4] = el;
                    System.out.println("Номер телефона возможно введён с ошибкой.");
                    break;
                }

                else if (el.matches("\\d{1,2}\\.\\d{1,2}\\.\\d{4}")){
                    Date elPars = ft.parse(el);
                    System.out.println(elPars);
                    if
                    //((1900 + elPars.getYear()) >= 1900 && (1900 + elPars.getYear()) <= 2023)
                    (elPars.compareTo(etalonMin) > 0 && elPars.compareTo(etalonMax) < 0)
                    { // сравниваем дату с разрешённым диапазоном
                        res[3] = el;
                    } else {
                        System.out.println("Ошибка в дате");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Номер телефона введён с ошибкой.");
            } catch (ParseException e) {
                System.out.println("Ошибка при вводе даты");
            }


            // Проверяем ФИО
            if (el.matches("^[a-zA-Z]*$")){
                res[count] = el;
                count++;
            }
        }
        return res;
    }
}
