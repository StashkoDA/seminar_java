package sem2.DZ.sortirovka;

// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [2,1,0] result “abc”

// Вариант - 1:
// public class Sortirovka {
//     public static void main(String[] args) {
//         StringBuffer s = new StringBuffer("cba");
//         s.reverse();
//         System.out.println(s.toString());
//         }
//     }

// Вариант - 2:
public class Sortirovka {
    public static void main(String[] args) {
        String s = "cab";
        char[] char_s = s.toCharArray();
        String ss = "";
        int[] index = {2, 1, 0};
        for (int i = 0; i < index.length; i++) {
            ss += char_s[index[i]];
        }
        System.out.println(ss);
    }
}
