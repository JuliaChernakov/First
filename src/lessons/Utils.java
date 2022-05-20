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
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]");
    }

    public static void printArray(double[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]");
    }

    public static void printArray(boolean[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]");
    }

    public static void printArray(String[] array) {
        if (array != null && array.length > 0) {
            System.out.print("{");
            for (int i = 0; i < array.length - 1; i++) {
                System.out.print("\"" + array[i] + "\", ");
            }
            System.out.print("\"" + array[array.length - 1] + "\"" + "}");
        }
        System.out.println("Error");
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

    public static void line() {
        System.out.println("----------------------------");
    }

    public static void longline() {
        System.out.println("-------------------------------------------------------------");
    }

    public static String verify(int a, int b) {
        if (a == b) {

            return "Pass";
        } else {

            return "Fail";
        }
    }

    public static String verify(double a, double b) {
        if (a == b) {

            return "Pass";
        } else {

            return "Fail";
        }
    }

    public static String verify(String a, String b) {
        if (a.equals(b)) {

            return "Pass";
        } else {

            return "Fail";
        }

    }

    /**
     * Создает массив из любого количества любых элементов (в массиве могут быть разные типы элементов)
     */
    public static Object[] makeArray(Object... v) {
        Object[] array = new Object[v.length];
        for (int i = 0; i < v.length; i++) {
            array[i] = v[i];
        }
        return array;
    }

    /**
     * Cоздает массив из определенного количества элементов любого типа (в массиве будет только один тип элементов)
     */
    // это из темы generic и это не работает :)
    public static <T> T[] createArray(T a, T b, T c, T d, T e) {
        return (T[]) new Object[]{a, b, c, d, e};
    }


    /**
     * Проверяет что все числа в массиве положительные
     */
    public static boolean checkPositive(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Считает количество четных чисел в массиве
     */
    public static int countEven(int[] array) {
        int n = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                n++;
            }
        }
        return n;
    }

    /**
     * Cоздает массив из четных чисел массива
     */
    public static int[] makeArrayEven(int[] array) {
        int n = countEven(array);
        int[] arrayNew = new int[n];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayNew[j] = array[i];
                j++;
            }
        }
        return arrayNew;
    }

    /**
     * Считает количество нечетных чисел в массиве
     */
    public static int countOdd(int[] array) {
        int n = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                n++;
            }
        }
        return n;
    }


    /**
     * Cоздает массив из нечетных чисел массива
     */
    public static int[] makeArrayOdd(int[] array) {
        int n = countOdd(array);
        int[] arrayNew = new int[n];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                arrayNew[j] = array[i];
                j++;
            }
        }
        return arrayNew;
    }

    /**
     * Cоздает массив случайных чисел от begin до end включительно, длина массива - length
     */
    public static int[] makeRandomArray(int begin, int end, int length) {
        if (begin >= end || length <= 0) {
            return new int[]{};
        }
        int[] arrayNew = new int[length];
        if (begin < 0) {
            begin--;
        }
        if (end < 0) {
            end--;
        }
        for (int i = 0; i < length; i++) {
            arrayNew[i] = (int) (Math.random() * (end - begin + 1) + begin);
        }
        return arrayNew;
    }


}
