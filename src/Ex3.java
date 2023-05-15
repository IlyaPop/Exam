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


        System.out.println("\n9 вариант");
        System.out.println("Введите x1 и y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Введите x2 и y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Евклидово расстояние = " + distance);


        System.out.println("\n10 вариант");
        System.out.println("Введите t: ");
        double t = input.nextDouble();
        System.out.println(Math.sin(2 * t) * Math.sin(3 * t) - Math.cos(2 * t) * Math.cos(3 * t));
    }
}



