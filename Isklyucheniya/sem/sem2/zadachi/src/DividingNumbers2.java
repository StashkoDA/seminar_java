public class DividingNumbers2 {
    public static void main(String[] args) {
        int a;
        int b;

        if (args.length == 0) {
            a = 12;
            b = 5; // Default values if no arguments are provided
        } else {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        }

        double result = Expr.expr(a, b);
        System.out.println(result);
    }

    class Expr {

        public static void printSum(int a, int b) {
            // Введите свое решение ниже
            System.out.println(a + b);
        }

        public static double expr(int a, int b) {
            // Введите свое решение ниже
            printSum(a, b);
            try {

                double res = a / b;
                if (b != 0) {
                    return (double)a / b;
                }
                return res;
            } catch (ArithmeticException e) {
                return 0;
            }
        }
    }
}
