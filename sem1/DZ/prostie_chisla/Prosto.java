// Вывести все простые числа от 1 до 1000 (простые числа делятся только на себя и на единицу)

package prostie_chisla;

public class Prosto {
    public static void main(String[] args) {
        System.out.println("\n vivod prostie_chisla:");
        for(int i = 2; i <= 1000; ++i){
            int count = 0;
            for(int j = 2; j <= i && count < 2; ++j) {
              if(i % j == 0) {
                ++count;
              }
            }
            if(count < 2) {
                System.out.print(i + " ");
            }
          }
        }
    }
