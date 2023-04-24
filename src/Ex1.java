public class Ex1 {
    public static void main(String[] args) {
        System.out.println("4 вариант");
        double a = 30;
        double z1 = (Math.sin(2 * a) + Math.sin(5 * a) - Math.sin(3 * a)) / (Math.cos(a) - Math.cos(3 * a) + Math.cos(5 * a));
        double z2 = Math.tan(3 * a);
        System.out.println(z1);
        System.out.println(z2);

        System.out.println("\n6 вариант");
        double b = 30;
        double z3 = Math.cos(b) + Math.cos(2 * b) + Math.cos(6 * b) + Math.cos(7 * b);
        double z4 = 4 * Math.cos(b / 2) * Math.cos(5 * b / 2) * Math.cos(4 * b);
        System.out.println(z3);
        System.out.println(z4);
    }
}
