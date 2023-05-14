package sem5.DZ.Phone_book_HashMap;

// ���������� ��������� ���������� ����� � ������� HashMap,
// ��������, ��� 1 ������� ����� ����� ��������� ���������.
// ����� ������ ���������� ����� ������ � ����� � ����� ������ ������� � ���������� �����

import java.util.*;

public class Phone_book {
    public static void main(String[] args) {
        // Map<String, List<String>> contact = new HashMap<>();
        // List<String> list1 = new ArrayList<>();
        // List<String> list2 = new ArrayList<>();

        // // �������� �������� ���������� �����:
        // list1.add("123456");
        // contact.put("������", list1);
        // list2.add("456789");
        // list2.add("123789");
        // contact.put("������", list2);

        mainMenu();
    }
    
    static void add�ontact(Map<String, List<String>> contact) {
        
        List<String> numbers = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("������� ��� ��������: ");
        String name = sc.nextLine();
        System.out.println("������� ���������� ������� ��������: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("������� ����� �������� " + i + ": ");
            String num = sc.nextLine();
            // ������� � ������
            numbers.add(num);
        }
        contact.putIfAbsent(name, numbers);

        System.out.println(contact); // ��������� ���������� ������
        // ���
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, List<String>> entry: contact.entrySet()){
            stringBuilder.append(entry.getKey());
            stringBuilder.append(": ");
            stringBuilder.append(entry.getValue());
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder.toString());

        sc.close();
    }

    static void findAcontact(Map<String, List<String>> contact) {

        Scanner sc = new Scanner(System.in);
        System.out.println("������� ��� ��������: ");
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
        sc.close();
    }

    static void mainMenu() {

        Map<String, List<String>> contact = new HashMap<>();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        // �������� �������� ���������� �����:
        list1.add("123456");
        contact.put("������", list1);
        list2.add("456789");
        list2.add("123789");
        contact.put("������", list2);

        System.out.println("��������������� � ���������� �����!");
        System.out.println("����:");
        System.out.println("1: �������� �������");
        System.out.println("2: ����� �������");
        System.out.println("3: �����");

        Scanner sc = new Scanner(System.in);
        System.out.printf("������� ����� �������: ");
        int numb = sc.nextInt();

        if (numb == 3) {
            System.out.println("~ ������� �� ������������� ���������� �����! ~\n");
            sc.close();
            return;
        }
            
        if (numb == 1) {
            add�ontact(contact);
            mainMenu();
        }
        if (numb == 2) {
            findAcontact(contact);
            mainMenu();
        }

        sc.close();
    }
}