public class Ex1 {
    public static void main(String[] args) {
        double a = 2;
        double z1 = 1 - 2 * Math.pow(Math.sin(a), 2) / (1 + 2 * Math.sin(a) * Math.cos(a));
        double z2 = (1 - Math.tan(a)) / Math.tan(a);
        System.out.println(z1);
        System.out.println(z2);
    }
}