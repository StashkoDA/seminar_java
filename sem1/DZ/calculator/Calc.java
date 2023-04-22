// Реализовать простой калькулятор
// Минимум -- > Условия + Цикл
// Введите число
// Введите число
// Выберите операцию
// 1 - сложить
// 2 - умножить и т.д.

package calculator;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        mainMenu();
    }
        
    static void mainMenu() {
    
        System.out.println("\nWelcome to Calculator!");
        System.out.println("Main menu:");
        System.out.println("1. Sum");
        System.out.println("2. Difference");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter the function number: ");
        int numb = iScanner.nextInt();

        if (numb == 5) {
            System.out.println("~ Thank you for using the calculator! ~\n");
            iScanner.close();
            return;
        }
        System.out.printf("Enter the first number: ");
        int a = iScanner.nextInt();
        System.out.printf("Enter the second number: ");
        int b = iScanner.nextInt();
            
        
        if (numb == 1) {
            System.out.println("Sum = " + (a+b) + "\n");
            mainMenu();
        }
        if (numb == 2) {
            System.out.println("Difference = " + (a-b) + "\n");
            mainMenu();
        }

        if (numb == 3) {
            System.out.printf("3. Multiplication = " + (a*b) + "\n");
            mainMenu();
        }
        if (numb == 4) {
            System.out.println("Division = " + (a/b) + "\n");
            mainMenu();
        }
        
        
        iScanner.close();
    }
}
