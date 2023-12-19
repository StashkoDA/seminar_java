//Создайте класс Счетчик, у которого есть метод add(), увеличивающий
//значение внутренней int переменной на 1.Сделайте так, чтобы с объектом
//такого типа можно было работать в блоке try-with-resources. Нужно бросить
//исключение, если работа с объектом типа счетчик была не в ресурсном try
//и/или ресурс остался открыт. Подумайте какой тип исключения подойдет
//лучше всего.

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (TryWithResources count = new TryWithResources(0)){
            count.add(); // Проверяем, что всё работает, запуская метод
            count.add();
            count.add();
            System.out.println(count.getCounter()); // Печатаем полученный count
            count.close(); // закрываем экземпляр (вводим значение null)
            count.getCounter(); // Вызовем метод, чтобы выскочила ошибка после получения null
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
        // Или без try+catch, и тогда программную ошибка с показом её происхождения, но не напечает count:
//    public static void main(String[] args) throws IOException{
//        TryWithResources count = new TryWithResources(0);
//        count.add(); // Проверяем, что всё работает, запуская метод
//        count.add();
//        count.add();
//        System.out.println(count.getCounter()); // Печатаем полученный count
//        count.close(); // закрываем экземпляр (вводим значение null)
//        count.getCounter(); // Вызовем метод, чтобы выскочила ошибка после получения null
//    }
}