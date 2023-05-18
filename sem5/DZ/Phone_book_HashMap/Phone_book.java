package sem5.DZ.Phone_book_HashMap;

// Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.
// Нужны методы добавления новой записи в книгу и метод поиска записей в телефонной книге

import java.util.*;

public class Phone_book {
    public static void main(String[] args) {
        System.out.println("\n~Welcome to the phone book!~ \n ~Добро пожаловать в телефонную книгу!~");
        Map<String, List<String>> contact = new HashMap<>();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.add("123456");
        contact.put("Ivanov", list1);
        list2.add("456789");
        list2.add("123789");
        contact.put("Petrov", list2);

        mainMenu(contact);
    }

    static void addContact(Map<String, List<String>> contact) {

        
        List<String> numbers = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter last name: \n Введите фамилию: ");
        String name = sc.nextLine();
        System.out.print("Enter the number of phone numbers \n Введите количество номеров телефона: ");
//        int n = sc.nextInt();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter phone number № " + i + ": "  + "\n" + "Введите номер телефона № " + i + ": ");
            String num = sc.nextLine();
            numbers.add(num);
        }
        contact.putIfAbsent(name, numbers);

        System.out.println("\nВывод списка контактов в строку:\n" + contact); // вывод списка контактов в строку
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, List<String>> entry: contact.entrySet()){
            stringBuilder.append(entry.getKey());
            stringBuilder.append(": ");
            stringBuilder.append(entry.getValue());
            stringBuilder.append("\n");
        }
        System.out.println("\nВывод списка контактов в столбик:\n" + stringBuilder.toString()); // вывод списка контактов в столбик
    }

    static void findContact(Map<String, List<String>> contact) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter last name: \n Введите фамилию: ");
        String name = sc.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, List<String>> entry: contact.entrySet()){
            if (entry.getKey().equalsIgnoreCase(name)){
                stringBuilder.append(entry.getKey());
                stringBuilder.append(": ");
                stringBuilder.append(entry.getValue());
                stringBuilder.append("\n");
            }
        }
        System.out.println(stringBuilder.toString());
    }

    static void mainMenu(Map<String, List<String>> contact) {

        

        System.out.println("\nMENU \n МЕНЮ");
        System.out.println("1: Add contact \n Добавить контакт");
        System.out.println("2: Find a contact \n Найти контакт");
        System.out.println("3: Exit \n Выход");
        System.out.print("Select function number: \n Выберите номер функции: ");

        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();

        if (numb == 3) {
            System.out.println("\n~Thanks for using the phone book!~\n ~Спасибо за использование телефонного справочника!~\n");
            sc.close();
            return;
        }

        if (numb == 1) {
            addContact(contact);
            mainMenu(contact);
        }
        if (numb == 2) {
            findContact(contact);
            mainMenu(contact);
        }
    }
}