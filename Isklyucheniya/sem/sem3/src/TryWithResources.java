//Создайте класс Счетчик, у которого есть метод add(), увеличивающий
//значение внутренней int переменной на 1.Сделайте так, чтобы с объектом
//такого типа можно было работать в блоке try-with-resources. Нужно бросить
//исключение, если работа с объектом типа счетчик была не в ресурсном try
//и/или ресурс остался открыт. Подумайте какой тип исключения подойдет
//лучше всего.

import java.io.IOException;

public class TryWithResources implements AutoCloseable{ // Имплементировали интерфейс AutoCloseable
    private Integer counter;

    public TryWithResources(Integer counter) { // Применили конструктор
        this.counter = counter;
    }

    public void add() throws IOException { // Метод увеличения переменной на 1.
        checkClose();
        counter++;
    }

    public Integer getCounter() throws IOException {
        checkClose(); // проверяем если counter == null, то выдаст ошибку и пробросит ошибку на стек выше
        return counter; // если ошибки не, то получим новый counter.
    }

    public void checkClose() throws IOException { // Метод закрытия экземпляра, если null
        if (counter == null) {
            throw new IOException("Экземпляр закрыт: ошибка, получен null");
        }
    }

    @Override
    public void close() { // Метод нтерфейса AutoCloseable
        counter = null; // Произойдёт автозакрытие, если counter = null
    }
}
