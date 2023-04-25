public class Ex1 {
    public static void main(String[] args) {
        System.out.println("1 вариант");
        double a = 35;
        double z1 = Math.cos(a) + Math.sin(a) + Math.cos(3 * a) + Math.sin(3 * a);
        double z2 = 0.25 - (0.25 * Math.sin(2.5 * Math.PI - 8 * a));
        System.out.println(z1);
        System.out.println(z2);

        System.out.println("\n9 вариант");
        double a1 = 45;
        double b = 30;
        double z3 = Math.pow(Math.cos(a1) - Math.cos(b), 2) - Math.pow(Math.sin(a1) - Math.sin(b), 2);
        double z4 = -4 * Math.sin((a1 - b) / 2) * Math.sin((a1 - b) / 2) * Math.cos(a1 + b);
        System.out.println(z3);
        System.out.println(z4);

        System.out.println("\n10 вариант");
        double a2 = 45;
        double z5 = Math.sin(Math.PI / 2 + 3 * a2) / (1 - Math.sin(3 * a2 - Math.PI));
        double z6 = 1 / Math.tan((5 * Math.PI / 4) + 3 * Math.PI * a2 / 2);
        System.out.println(z5);
        System.out.println(z6);
    }
}
