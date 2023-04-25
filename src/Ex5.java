import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1 вариант");
        double x = input.nextDouble();
        double b = 2;
        double a = 3;
        if (x <= 3) {
            System.out.println(b + 2 * Math.log(Math.abs(x)));
        } else if (x > 3) {
            System.out.println(x * x / x * x + a);
        }

        System.out.println("\n9 вариант");
        double x1 = input.nextDouble();
        if (x >= 2) {
            System.out.println(Math.sqrt(1 + x1 * Math.sqrt(a * x1)));
        } else if (x < 2) {
            System.out.println(a * Math.sin(b * x1) + 3);
        }

        System.out.println("\n10 вариант");
        double x2 = input.nextDouble();
        if (x <= 0) {
            System.out.println(Math.sqrt(Math.pow(Math.E, 2 * x2 - b) - 1));
        } else if (x > 0) {
            System.out.println(1 / (x2 * x2 + a));
        }
    }
}
