public class Ex4 {
    public static void main(String[] args) {
        double a = 6.32;
        double b = 3.704;
        double x = 7.15;
        double z1 = Math.pow(b, 2) + 2 * Math.pow(Math.E, 2) - b * x;
        double z2 = a * x / Math.sqrt(z1);
        System.out.println("Ответ: " + z2);
    }
}
