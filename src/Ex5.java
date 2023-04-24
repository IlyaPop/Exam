import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("4 вариант");
        double x = input.nextDouble();
        double a = 3;
        double b = 4;
        if (x <= 2) {
            System.out.println((a + x * x) / (b + Math.log(Math.abs(x) + 1)));
        } else if (x > 2) {
            System.out.println(Math.pow(Math.E, x) + x * x);
        }

        System.out.println("\n6 вариант");
        double x1 = input.nextDouble();
        double a1 = 3;
        double b1 = 4;
        if (x1 <= -1) {
            System.out.println(a1 * Math.tan(x1 * x1));
        } else if (x > 1) {
            System.out.println(b1 + (x1 * x1 / x1 * x1 + a1));
        }
    }
}
