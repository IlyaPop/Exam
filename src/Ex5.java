import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double a = 3;
        double b = 2;
        double z1 = a + Math.abs(Math.sin(x));
        if (x > 4) {
            System.out.println(Math.sqrt(z1));
        } else if (x <= 4) {
            System.out.println(Math.tan(b * x));
        }
    }
}
