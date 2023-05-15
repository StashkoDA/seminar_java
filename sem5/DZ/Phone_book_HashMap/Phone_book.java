package sem5.DZ.Phone_book_HashMap;

// Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.
// Нужны методы добавления новой записи в книгу и метод поиска записей в телефонной книге

import java.util.*;

public class Phone_book {
    public static void main(String[] args) {
        System.out.println("Добропожаловать в телефонную книгу!");
        Map<String, List<String>> contact = new HashMap<>();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        // Заполним первично телефонную книгу:
        list1.add("123456");
        contact.put("Иванов", list1);
        list2.add("456789");
        list2.add("123789");
        contact.put("Петров", list2);
        System.out.println(contact + "\n");

        mainMenu(contact);
    }
    
    static void addСontact(Map<String, List<String>> contact) {
        
        List<String> numbers = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Имя контакта: ");
        String name = sc.nextLine();
        System.out.println("Введите количество номеров телефона: ");
        String n = sc.nextLine();
        if (n.equals("1")) {
            System.out.println("Введите номер телефона : ");
            String num = sc.nextLine();
            // добавим в список
            numbers.add(num);
            contact.putIfAbsent(name, numbers);
        }
        
        if (n.equals("2")) {
            System.out.println("Введите номер телефона № 1: ");
            String num = sc.nextLine();
            // добавим в список
            numbers.add(num);
            contact.putIfAbsent(name, numbers);

            System.out.println("Введите номер телефона № 2: ");
            String num2 = sc.nextLine();
            // добавим в список
            numbers.add(num2);
            contact.putIfAbsent(name, numbers);
        } else {
            System.out.println("Можно сохранить не более двух номеров!");
            addСontact(contact);
        }

        System.out.println(contact); // посмотрим полученный список
        // или
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, List<String>> entry: contact.entrySet()){
            stringBuilder.append(entry.getKey());
            stringBuilder.append(": ");
            stringBuilder.append(entry.getValue());
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder.toString());
        //mainMenu(contact);
    }

    static void findAcontact(Map<String, List<String>> contact) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Имя контакта: ");
        String name = sc.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, List<String>> entry: contact.entrySet()){
            if (entry.getKey().equalsIgnoreCase(name)){
                stringBuilder.append(entry.getKey());
                System.out.println(entry.getKey());
                stringBuilder.append(": ");
                stringBuilder.append(entry.getValue());
                System.out.println(entry.getValue());
                stringBuilder.append("\n");
            }
        }
        System.out.println(stringBuilder);
        //mainMenu(contact);
    }

    static void mainMenu(Map<String, List<String>> contact) {

        

        
        System.out.println("МЕНЮ:");
        System.out.println("1: Добавить контакт");
        System.out.println("2: Найти контакт");
        System.out.println("3: Выход");

        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите номер функции: ");
        String numb = sc.nextLine();

        if (numb.equals("3")) {
            System.out.println("~ Спасибо за использование Телефонной книги! ~\n");
            sc.close();
            return;
        }
            
        if (numb.equals("1")) {
            addСontact(contact);
            // mainMenu();
        }
        if (numb.equals("2")) {
            findAcontact(contact);
            // mainMenu();
        }
    }
}