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
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class DZ_Notebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите данные (Фамилия Имя Отчество дата рождения номер телефона пол): ");
        String input = scanner.nextLine();

        String[] data = input.split(" ");

        if (data.length != 6) {
            System.out.println("Ошибка! Введено неверное количество данных.");
            return;
        }

        try {
            String surname = data[0];
            String firstName = data[1];
            String middleName = data[2];
            String birthDate = data[3];
            String phoneNumber = data[4];
            String gender = data[5];

            String output = surname + firstName + middleName + birthDate + " " + phoneNumber + gender;

            FileWriter fileWriter = new FileWriter(surname + ".txt");
            fileWriter.write(output);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Ошибка! Не удалось создать файл.");
            return;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка! Введены неполные данные.");
            return;
        }

        System.out.println("Данные успешно сохранены в файле " + data[0] + ".txt");
    }
}