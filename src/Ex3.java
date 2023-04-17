import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите день и месяц: ");
        int m = input.nextInt();
        int d = input.nextInt();
        if (m <= 20 && d <= 3) {
            System.out.println("false");
        } else if (m >= 20 && d >= 6) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}