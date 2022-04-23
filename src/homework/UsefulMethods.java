package homework;

public class UsefulMethods {
    /**
     * метод округляет число n до q знаков после запятой
     */
    public static double formatDouble(double n, int q) {
        int result = (int) Math.round(n * Math.pow(10, q));
        return result / Math.pow(10, q);
    }

    public static void main(String[] args) {
        System.out.println(formatDouble(13.781736918, 1));
    }
}
