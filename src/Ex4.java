public class Ex4 {
    public static void main(String[] args) {
        System.out.println("4 вариант");
        double a = 1.2;
        double b = 2.3;
        double x = 5.6;
        double c = -1.2;
        double y = Math.log(Math.abs(a * Math.sin(x) + b * Math.cos(c * x * x)));
        System.out.println(y);

        System.out.println("\n6 вариант");
        double a1 = 2.1;
        double b1 = 5.3;
        double c1 = 1.4;
        double x1 = 1.2;
        double y1 = Math.sqrt(Math.pow(Math.E, a1 * x1) + x1 * x1) * Math.log(x1 * x1 + b1 * x1 + 10) / Math.sin(c1 * x1) + 4.2;
        System.out.println(y1);
    }
}
