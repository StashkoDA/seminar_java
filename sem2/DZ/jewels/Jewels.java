package sem2.DZ.jewels;

// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”

public class Jewels {
    public static void main(String[] args) {
        String jewels1 = "a";
        String jewels2 = "B";
        int count1 = 0;
        int count2 = 0;
        String stones = "aaaAbbbB";
        char[] char_stones = stones.toCharArray();
        for (int i = 0; i < char_stones.length; i++) {
            if (char_stones[i] == 'a') count1++;
            if (char_stones[i] == 'B') count2++;
        }
        System.out.print(jewels1 + count1 + jewels2 + count2 + "\n");
    }
}
