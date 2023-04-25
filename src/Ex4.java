public class Ex4 {
    public static void main(String[] args) {
        System.out.println("1 вариант");
        double a = 6.2;
        double b = 14.3;
        double c = 13.4;
        double x = 5.6;
        double y = Math.sqrt(x + 62.7 * Math.pow(Math.E, c * x) / (a * x * x) + (7 * x) + (b * Math.log(x)));
        System.out.println(y);

        System.out.println("\n9 вариант");
        double a1 = 1.53;
        double b1 = 5.14;
        double c1 = 3.97;
        double x1 = 7.1;
        double y1 = a1 * x1 + 3.8 * Math.tan(x1) / Math.sqrt((c1 * x1 * x1 * x1) + c1 * b1);
        System.out.println(y1);

        System.out.println("\n10 вариант");
        double a2 = 2.71;
        double b2 = 1.63;
        double c2 = 0.81;
        double x2 = 0.51;
        double y2 = Math.sqrt((a2 * x2 * x2 * x2) + Math.atan(x2)) / Math.sqrt((c2 * x2 + b2) * Math.abs(Math.log(x)));
        System.out.println(y2);
    }
}
