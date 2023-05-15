import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Вариант 1");
        Scanner input = new Scanner(System.in);
            double y = 0;
            System.out.print("Введите x = ");
            double x = input.nextDouble();
            System.out.print("Введите r = ");
            double r = input.nextDouble();
            if (x >= -9 && x < -6) {
                y = Math.sqrt(r * r - (x + 6) * (x + 6)) * -1;
                System.out.println("y = " + y);
            } else if (x >= -6 && x < 3) {
                y = x + 3;
                System.out.println("y = " + y);
            } else if (x >= -3 && x < 0) {
                y = Math.sqrt(r * r - x * x);
                System.out.println("y = " + y);
            } else if (x >= 0 && x < 3) {
                y = 3 - x;
                System.out.println("y = " + y);
            } else if (x >= 3 && x < 9) {
                y = 0.5 * x - 1.5;
                System.out.println("y = " + y);
            } else {
                System.out.println("y не опреденен");
            }
        }

    }
