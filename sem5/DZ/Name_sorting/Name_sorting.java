package sem5.DZ.Name_sorting;

// ����� ��� ������ �����������:
// ���� ������, �������� �������, �������� ������, ���� ������, ���� �������, ���� ����,
// ���� �����, ����� ������, ���� ��������, ����� ��������, ������ ��������, ����� ������,
// ����� ������, ������ ������, ���� �����������, ���� ��������, ���� �����, ���� ����.
// �������� ���������, ������� ������ � ������� ������������� ����� � ����������� ����������.
// ������������� �� �������� ������������.
// ��� ���������� ������������ TreeMap.

import java.util.*;
public class Name_sorting {
    public static void main(String[] args) {
        String line = "���� ������, �������� �������, �������� ������, ���� ������, ���� �������, ���� ����, " + 
        "���� �����, ����� ������, ���� ��������, ����� ��������, ������ ��������, ����� ������, " + 
        "����� ������, ������ ������, ���� �����������, ���� ��������, ���� �����, ���� ����.";
        line = line.replace(".", ""); // �������� "." �� �������� ""
        String[] words = line.split(", "); // ������ ������ ����� (��� �������)
        ArrayList<String> name = new ArrayList<String>(); // ������ ������ ������ ����� � ��������� ��� �������
        for (String word : words) {
            String[] line_word = word.split(" ");
            
            for (int i = 0; i < line_word.length; i++) {
                if (i == 0) {
                    name.add(line_word[i]);
                }
            }
        }
        // for (String n : name) {
        //     System.out.println(n);
        // }
        Map<String, Integer> map = new TreeMap<>(Comparator.reverseOrder()); // �������� ����������
        for (String n : name) {
                if (map.containsKey(n)){    // ��������� ���� �� ������� � ����� ������
                    
                    map.replace(n, map.get(n) + 1);
                } else {
                    int count = 1; // ���� ��� ������ ��������, �� ��������� ��� � ����� ������

                    map.put(n, count);
                }
        }
        //System.out.println(map);

        Map<Integer, List<String>> map2 = new TreeMap<>(Comparator.reverseOrder()); // �������� ����������
        for(Map.Entry<String, Integer> item : map.entrySet()){
            if (map2.containsKey(item.getValue())){    // ��������� ���� �� ������� � ����� ������
                List<String> list = map2.get(item.getValue()); // ������ ������������ ������ list  �� ����� �������� map
                list.add(item.getKey()); // ��������� � ���� ������ ����� ���������� ��� � ������ ����������� �������   
                
            } else {
                List<String> list = new ArrayList<>(); // ���� ��� ������ ��������, �� ��������� ��� � ������ - ����� ���,
                                                        // �������� - ���-�� ��������
                
                list.add(item.getKey());
                map2.put(item.getValue(), list);
            }  
        }
        System.out.println("\n������������� �� �������� ������� ������ ���:\n" + map2 + "\n");
    }
}

