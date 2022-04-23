package lessons;

public class Utils {

    /**
     * Печатает номер задания
     */
    public static int numTask = 1;

    public static void printTask() {
        System.out.println("★★★★★★★★★★★★ Task " + numTask + " ★★★★★★★★★★★★");
        numTask++;
    }

    /**
     * Печатает номер подпункта
     */
    public static void printPoint(int numPoint) {
        System.out.println("Point " + numPoint);
    }

    /**
     * Округляет число n до q знаков после запятой
     */
    public static double formatDouble(double n, int q) {
        int result = (int) Math.round(n * Math.pow(10, q));
        return result / Math.pow(10, q);
    }

    /**
     * Печатает все элементы массива по порядку
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void printArray(boolean[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    /**
     * Находит самый большой элемент массива
     */
    public static int max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * Находит самый маленький элемент массива
     */

    public static int min(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * Находит большее из двух чисел
     */
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    /**
     * Находит меньшее из двух чисел
     */
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

        public static void line () {
            System.out.println("----------------------------");
        }

        public static void longline () {
            System.out.println("-------------------------------------------------------------");
        }

        public static String verify ( int a, int b){
            if (a == b) {

                return "Pass";
            } else {

                return "Fail";
            }
        }

        public static String verify ( double a, double b){
            if (a == b) {

                return "Pass";
            } else {

                return "Fail";
            }
        }

        public static String verify (String a, String b){
            if (a.equals(b)) {

                return "Pass";
            } else {

                return "Fail";
            }

        }
    }
