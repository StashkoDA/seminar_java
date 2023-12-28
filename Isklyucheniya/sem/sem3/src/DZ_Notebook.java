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
import java.io.FileWriter;
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
        System.out.println("Введите через пробел на ЛАТИННИЦЕ: фамилию, дату рождения (формата dd.mm.yyyy)," +
                "номер телефона (формат 89991112233), пол (формат f или m): ");
        String data = in.nextLine();
        System.out.println(data);
        String[] els = data.split(" ");
        options(els);
        String name = getName(els);
        String date = getDate(els);
        String tel = getTel(els);
        String gender = getGender(els);
        String output = name + date + " " + tel + " " + gender;
        getFile(output, name);
        System.out.println("Данные после проверки: " + output);
    }

    private static void getFile(String output, String name) {
        String[] els = output.split(" ");
        int count = 6;
        try {
            for (int i = 0; i < els.length; i++) {
                if (els[i] != "") {
                    count--;
                    if (count == 0) {
                        FileWriter fileWriter = new FileWriter((name.split(" "))[0] + ".txt");
                        fileWriter.write(output);
                        fileWriter.close();
                        System.out.println("Данные успешно сохранены в файле " + (name.split(" "))[0] + ".txt");
                    }
                }
                if (els[i] == "") {
                    System.out.println("Ошибка! Не удалось создать файл." +
                            "Не все параметры внесены правильно, повторите ввод.");
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка! Не удалось создать файл.");
        }

    }

    public static void options(String[] els) {

        try {
            if (els.length == 6) {
                System.out.println("Введено нужное количество параметров: " + els.length);
            } else if (els.length < 6) {
                System.out.println("Введено недостаточное количество параметров: меньше 6");
                String el = els[5];
            } else {
                System.out.println("Введено избыточное количество параметров: больше 6");
                String el = els[els.length];
            }
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Повторите попытку.");
            }
    }

    public static String getName (String[] els) { // Проверяем ФИО
        String resName = "";

        for (String el : els) {
            if (el.length() > 1 && el.matches("[A-Za-z]+")){
                resName += el + " ";
            }
        }
        try {
            String[] res = resName.split(" ");
            String firstName = res[0];
            String lastName = res[1];
            String patronymic = res[2];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка в ФИО.");
            return " ";
        }


        return resName;
    }

    public static String getDate(String[] els) { // Проверяем дату:
        SimpleDateFormat ft = new SimpleDateFormat ("dd.MM.yyyy");
        String resDate = "";

        try {
            for (String el : els) {
                if (el.matches("\\d{1,2}\\.\\d{1,2}\\.\\d{4}")) {
                    String[] arrayDate = el.split("\\.");
                    int year = Integer.parseInt(arrayDate[2]);
                    int month = Integer.parseInt(arrayDate[1]);
                    int day = Integer.parseInt(arrayDate[0]);
                    // сравниваем дату с разрешённым диапазоном:
                    if ( year > 1900 && year < 2024 && month > 0 && month < 13 && day > 0 && day < 32) {
                        if (day < 32 && (month == 1 || month == 3 || month == 5 || month == 7 ||
                                month == 8 || month == 10 || month == 12)) {
                            resDate = el;
                        } else if (day < 31 && (month == 4 || month == 6 || month == 9 || month == 11)) {
                            resDate = el;
                        } else if (day < 30 && month == 2) {
                            resDate = el;
                        } else {
                            resDate = "";
                            Date errorPars = ft.parse(resDate);
                        }
                    } else {
                        resDate = "";
                        Date errorPars = ft.parse(resDate);
                    }
                }
            }

        } catch (ParseException e) {
            System.out.println("Ошибка при вводе даты");
        } catch (NullPointerException e) {
            System.out.println("Ошибка в дате");
        }
        return resDate;
    }

    private static String getTel(String[] els) { // Проверяем номер телефона:
        String resTel = "";
        for (String el : els) {
            if (el.length() == 11 && el.matches("[0-9]+")) {
                //Integer.parseInt(el);
                return el;
            } else if (el.length() != 11 && el.matches("[0-9]+")) {
                //Integer.parseInt(el);
                System.out.println("Номер телефона, возможно, введён с ошибкой.");
                return el;
            }
        }
        System.out.println("Номер телефона введён с ошибкой.");
        return resTel;
    }

    private static String getGender(String[] els) {
        String resGender = "";
            for (String el : els) {
                if (el.equals("f") || el.equals("m")) {
                    resGender = el;
                }else if ((el.length() == 1) && (!el.equals("f")) && !(el.equals("m"))) {
                    System.out.println("Введён не правильно гендер");
                    return resGender;
                }
            }
        return resGender;
    }
}
