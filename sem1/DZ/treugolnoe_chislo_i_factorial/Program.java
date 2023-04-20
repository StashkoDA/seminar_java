// Вычислить n-ое треугольного число (сумма чисел от 1 до n), m! (произведение чисел от 1 до m)


import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        System.out.println("\nВычисление треугольного числа 'n':");
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число 'n': ");
        int n = iScanner.nextInt();
        //iScanner.close();
        int res = 0;
        int count = 1;
        while (count <= n) {
            res += count;
            count ++;
        }
        System.out.printf("Треугольное число (n = %s) равен: %s!\n", n, res);
        
        System.out.println("\nВычисление факториала числа 'm':");
        //Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число 'm': ");
        int m = iScanner.nextInt();
        iScanner.close();
        int result = 1;
        int i = 1;
        while (i <= n) {
            result *= i;
            i ++;
        }
        System.out.printf("Факториал числа (m = %s) равен: %s!\n", m, result);
    }
}

