package sem5.DZ.Phone_book_HashMap;

// ���������� ��������� ���������� ����� � ������� HashMap,
// ��������, ��� 1 ������� ����� ����� ��������� ���������.
// ����� ������ ���������� ����� ������ � ����� � ����� ������ ������� � ���������� �����

import java.util.*;

public class Phone_book {
    public static void main(String[] args) {
        System.out.println("\n~Welcome to the phone book!~ \n ~����� ���������� � ���������� �����!~");
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
        System.out.print("Enter last name: \n ������� �������: ");
        String name = sc.nextLine();
        System.out.print("Enter the number of phone numbers \n ������� ���������� ������� ��������: ");
//        int n = sc.nextInt();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter phone number � " + i + ": "  + "\n" + "������� ����� �������� � " + i + ": ");
            String num = sc.nextLine();
            numbers.add(num);
        }
        contact.putIfAbsent(name, numbers);

        System.out.println("\n����� ������ ��������� � ������:\n" + contact); // ����� ������ ��������� � ������
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, List<String>> entry: contact.entrySet()){
            stringBuilder.append(entry.getKey());
            stringBuilder.append(": ");
            stringBuilder.append(entry.getValue());
            stringBuilder.append("\n");
        }
        System.out.println("\n����� ������ ��������� � �������:\n" + stringBuilder.toString()); // ����� ������ ��������� � �������
    }

    static void findContact(Map<String, List<String>> contact) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter last name: \n ������� �������: ");
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

        

        System.out.println("\nMENU \n ����");
        System.out.println("1: Add contact \n �������� �������");
        System.out.println("2: Find a contact \n ����� �������");
        System.out.println("3: Exit \n �����");
        System.out.print("Select function number: \n �������� ����� �������: ");

        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();

        if (numb == 3) {
            System.out.println("\n~Thanks for using the phone book!~\n ~������� �� ������������� ����������� �����������!~\n");
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