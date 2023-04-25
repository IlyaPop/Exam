import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("1 вариант");
        Scanner input = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = input.nextInt();
        System.out.print("Введите второе число: ");
        double num2 = input.nextInt();

        if (num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }
        System.out.println("\n10 вариант");
        System.out.println("Введите t");
        double t = input.nextDouble();
        System.out.println(Math.sin(2 * t) * Math.sin(3 * t) - Math.cos(2 * t) * Math.cos(3 * t));
    }
}



