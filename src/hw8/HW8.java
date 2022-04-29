package hw8;

import static hw8.HW8_1.*;
import static lessons.Utils.*;
import static lessons.Utils.checkPositive;

public class HW8 {

    static Integer int8 = 5;
    static Double dou8 = 5.5;
    static String str8 = "batman";

    public static void table(String a, String b, String c) {
        longline();
        System.out.println("\t\tHW8\t\t\t\t| HW8_1\t\t\t\t\t| areEquals?");
        longline();
        System.out.println("Integer int8 = " + int8 + "\t\t| Integer int81 = " + int81 + "\t\t| " + a);
        longline();
        System.out.println("Double dou8 = " + dou8 + "\t\t| Double dou81 = " + dou81 + "\t| " + b);
        longline();
        System.out.println("String str8 = " + str8 + "\t| String str81 = " + str81 + "\t| " + c);
        longline();
    }

    public static int[] makeArray(int a, int b, int c, int d, int e) {
        int[] array = new int[]{a, b, c, d, e};
        return array;
    }

    public static double[] makeArray(double a, double b, double c, double d, double e) {
        double[] array = new double[]{a, b, c, d, e};
        return array;
    }

    public static String[] makeArray(String a, String b, String c, String d, String e) {
        String[] array = new String[]{a, b, c, d, e};
        return array;
    }

    public static double[] multArray(int[] array) {
//        if (array.length > 0) {   (можно без проверки, т.к. вернется пустой массив)
        double[] arrayNew = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayNew[i] = array[i] * 2.5;
        }
        return arrayNew;
    }
//        return new double[]{};
//    }

    public static int numEven(int[] array) {
        if (array.length > 0 && checkPositive(array)) {
            int n = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    n++;
                }
            }
            return n;
        }
        return Integer.MIN_VALUE;
    }

    public static int[] findOdd(int[] array) {
        if (checkPositive(array)) {
            return makeArrayOdd(array);
        }
        int[] arrayEmpty = new int[]{};
        return arrayEmpty;
    }

    public static boolean[] countBig(int[] array) {
        boolean[] arrayNew = new boolean[array.length];
        if (array == null || array.length == 0) {
            return arrayNew;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 10) {
                arrayNew[i] = true;
            } else {
                arrayNew[i] = false;
            }
        }
        return arrayNew;
    }

    public static String makeString(String[] array) {
        String string = "";
        for (int i = 0; i < array.length; i++) {
            string += array[i] + " ";
        }
        return string;
    }

    public static int sumHalf(int[] array) {
        int sum = 0;
        for (int i = array.length / 2; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int[] multTable(int m) {
        if (m < 2 || m > 9) {
            return new int[]{};
        }
        int[] multTable = new int[10];
        for (int i = 0; i < 10; i++) {
            multTable[i] = m * (i + 1);
        }

        return multTable;
    }

    public static int[] evenOrOdd(int[] array) {
        if (countEven(array) > countOdd(array)) {
            return makeArrayEven(array);
        } else if (countEven(array) < countOdd(array)) {
            return makeArrayOdd(array);
        } else {
            return new int[]{};
        }
    }

    public static int[] arrayNew18(int begin, int end, int length) {

        return makeRandomArray(begin, end, length);
    }

    public static int[] arrayNew19(int l, int d) {
        int begin = (int) Math.pow(10, d - 1);
        int end = (int) Math.pow(10, d) - 1;

        return makeRandomArray(begin, end, l);
    }
//        int[] arrayNew = new int[l];
//        for (int i = 0; i < l; i++) {
//            arrayNew[i] = (int) (Math.random() * (Math.pow(10, d) - Math.pow(10, (d - 1))) + Math.pow(10, (d - 1)));
//        }
//        return arrayNew;
//    }

    public static int[] chTwo(int[] array) {
        if (array.length > 0) {
            int n = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 9 && array[i] < 100) {
                    n++;
                }
            }
            int[] arrayTwo = new int[n];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 9 && array[i] < 100) {
                    arrayTwo[arrayTwo.length - n] = array[i];
                    n--;
                }
            }
            return arrayTwo;
        } else {
            return new int[]{};
        }
    }

    public static int[] arrayDiff(int[] array) {
        int[] arrayDiff = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayDiff[i] = Math.abs(array[i] / 10 - array[i] % 10);
        }

        return arrayDiff;
    }

    public static String[] tel(int[] array, String country) {
        String telephone = "";
        for (int i = 0; i < array.length; i++) {
            telephone = (telephone + array[i]);
            if (i == 0) {
                telephone = (telephone + "(");
            }
            if (i == 3) {
                telephone = (telephone + ")");
            }
            if (i == 6 || i == 8) {
                telephone = (telephone + "-");
            }
        }
        String[] arrayNew22 = new String[2];
        arrayNew22[0] = telephone;
        arrayNew22[1] = country;

        return arrayNew22;
    }

    public static int[] unik(int[] array) {
        int[] arrayHelp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int n = 0;
            for (int j = 0; j < (array.length); j++) {
                if (array[i] == array[j]) {
                    n++;
                }
            }
            if (n == 1) {
                arrayHelp[i] = array[i];
            }
        }
        int n = 0;
        for (int i = 0; i < arrayHelp.length; i++) {
            if (arrayHelp[i] == 0) {
                n++;
            }
        }
        int[] arrayNew = new int[arrayHelp.length - n];
        int k = 0;
        for (int i = 0; i < arrayHelp.length; i++) {
            if (arrayHelp[i] != 0) {
                arrayNew[k] = arrayHelp[i];
                k++;
            }
        }

        return arrayNew;
    }

    public static int[] countUnik(int[] array) {
        int unik = 0;
        for (int i = 0; i < array.length; i++) {
            int n = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    n++;
                }
            }
            if (n == 1) {
                unik = unik + 1;
            }
        }
        int[] arrayNew24 = new int[2];
        arrayNew24[0] = unik;
        arrayNew24[1] = array.length - unik;

        return arrayNew24;
    }

    public static int[] between(int[] array, int a, int b) {
        int min = min(a, b);
        int max = max(a, b);
        int[] arrayNew25 = new int[max - min + 1];
        for (int i = 0; i < arrayNew25.length; i++) {
            arrayNew25[i] = array[i + min];
        }
        return arrayNew25;
    }

    public static int[] oneOfTwo(int[] array1, int[] array2) {
        if (array1.length == 0 || array2.length == 0)
            return null;
        int[] arrayHelp = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            arrayHelp[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            arrayHelp[array1.length + i] = array2[i];
        }
        int[] arrayNew26 = unik(arrayHelp);
        printArray(arrayHelp);
        System.out.println();
        return arrayNew26;
    }

    public static void main(String[] args) {

        /** Task 6 */
//        Сравнить переменные соответствующих типов из классов HW8_1 и HW8
//        и распечатать результат сравнения в виде таблички
        numTask = 6;
        printTask();
        table(verify(int8, int81), verify(dou8, dou81), verify(str8, str81));
        System.out.println();

        /** Task 7 */
//        Написать метод, который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел
        printTask();
        int array7[] = makeArray(1, 2, 3, 4, 5);
        for (int i = 0; i < array7.length; i++) {
            System.out.print(array7[i] + ", ");
        }
        System.out.println();
        line();

        /** Task 8 */
//        Написать метод, который принимает на вход 5 чисел типа double, и возвращает массив из этих же чисел
        printTask();
        double array8[] = makeArray(1.5, 2, 3, 4, 5);
        for (int i = 0; i < array8.length; i++) {
            System.out.print(array8[i] + ", ");
        }
        System.out.println();
        line();

        /** Task 9 */
//        Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов
        printTask();
        String array9[] = makeArray("J", "U", "L", "I", "A");
        for (int i = 0; i < array9.length; i++) {
            System.out.print(array9[i]);
        }
        System.out.println();
        line();

        /** Task 10 */
//        Написать метод, который принимает на вход массив целых чисел,
//        и возвращает массив тех же чисел, умноженных на 2.5
        printTask();
        int[] array10 = {0, -2, 3, 4, -5, 6};
        double[] arrayNew10 = multArray(array10);
        for (int i = 0; i < arrayNew10.length; i++) {
            System.out.print(arrayNew10[i] + ", ");
        }
        System.out.println();
        line();

        /** Task 11 */
//        Написать метод, который принимает на вход массив целых положительных чисел,
//        и возвращает количество четных чисел в этом массиве
        printTask();
        int[] array11 = {3, 5, 4, 8, 5, 3};
        System.out.println(numEven(array11));
        line();

        /** Task 12 */
//        Написать метод, который принимает на вход массив целых положительных чисел,
//        и возвращает массив нечетных чисел
        printTask();
        int[] array12 = {2, 9, 4, 11, 6, 5};

        int[] arrayNew12 = findOdd(array12);
        printArray(arrayNew12);

        System.out.println();
        line();

        /** Task 13 */
//        Написать метод, который принимает на вход массив целых чисел,
//        и возвращает массив значений true или false, если числа больше 10
        printTask();
        int[] array13 = {11, 10, 13, 14, 5, 6};
        boolean[] arrayNew13 = countBig(array13);
        for (int i = 0; i < arrayNew13.length; i++) {
            System.out.print(arrayNew13[i] + ", ");
        }
        System.out.println();
        line();

        /** Task 14 */
//        Написать метод, который принимает на вход массив слов,  и возвращает строку, состоящую из этих слов
        printTask();
        String[] words = {"This", "is", "the", "house", "that", "Jack", "built"};
        String string = makeString(words);
        System.out.println(string);
        line();

        /** Task 15 */
//        Написать метод, который принимает массив целых чисел и считает сумму чисел во второй половине массива
        printTask();
        int[] array15 = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(sumHalf(array15));
        line();

        /** Task 16 */
//        Написать метод, который принимает на вход целое положительные число в пределах
//        от 1 до 10 исключительно, и возвращает таблицу умножения на это число в виде массива
        printTask();
        int m = 8;
        int[] multTable = multTable(m);
        printArray(multTable);

        System.out.println();
        line();

        /** Task 17 */
//        Написать метод, который принимает массив целых чисел и возвращает массив четных чисел,
//        если четных чисел больше, или массив нечетных чисел, если нечетных чисел больше.
        printTask();
        int[] array17 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] arrayNew17 = evenOrOdd(array17);
        printArray(arrayNew17);
        System.out.println();
        line();

        /** Task 18 */
        // Написать метод, который принимает на вход длину массива и генерирует
        // массив случайных положительных чисел от 0 до 100 исключительно
        printTask();
        int begin = 1;
        int end = 99;
        int length = 10;
        int array18[] = arrayNew18(begin, end, length);
        printArray(array18);
        System.out.println();
        line();

        /** Task 19 */
//        Написать метод, который принимает на вход длину массива l и количество знаков d
//        (однозначные, двузначные, трехзначные и тд числа), и генерирует массив случайных
//        целых положительных чисел длины l, в котором все числа имеют количество знаков d
        printTask();
        int l = 30;
        int d = 2;
        int array19[] = arrayNew19(l, d);
        printArray(array19);
        System.out.println();
        line();

        /** Task 20 */
//        Написать метод, который принимает на вход массив целых положительных чисел, и возвращает
//        массив только двузначных чисел. ПРоверить работу метода на массиве из задания 18.
        printTask();
        int[] array20 = chTwo(array18);
        printArray(array20);
        System.out.println();
        line();

        /** Task 21 */
//        Написать метод, который принимает на вход массив целых положительных
//        двузначных чисел, и возвращает массив разниц между десятками и единицами
        printTask();
        int[] array21 = {34, 23, 76, 46, 72, 65, 97, 37};
        int[] arrayNew21 = arrayDiff(array20);
        printArray(arrayNew21);
        System.out.println();
        line();

        /** Task 22 */
//        Написать метод, который принимает массив из 11 целых положительных чисел от 0 до 9,
//        и возвращает массив, который содержит номер телефона, состоящий из этих чисел,
//        и название страны, которой номер принадлежит. Например:
//        method({1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7}) -> {“1(800)123-45-67”, “USA”}
        printTask();
        int[] array22 = {8, 2, 3, 4, 5, 6, 7, 2, 1, 0, 8};
        String country = "Belarus";
        String[] arrayNew22 = tel(array22, country);
        printArray(arrayNew22);
        System.out.println("");
        line();

        /** Task 23 */
//        Написать метод, который принимает массив целых положительных чисел больше 0,
//        и возвращает массив уникальных чисел.
        printTask();
        int[] array23 = {1, 2, 3, 4, 4, 6, 4, 8, 3, 10};
        int[] arrayNew23 = unik(array23);
        printArray(arrayNew23);
        System.out.println("");
        line();

        /** Task 24 */
//        Написать метод, который принимает на вход массив целых положительных чисел,
//        и возвращает количество уникальных и неуникальных элементов в этом массиве
        printTask();
        int[] arrayNew24 = countUnik(array23);
        printArray(arrayNew24);
        System.out.println("");
        line();

        /** Task 25 */
//        Написать метод, который принимает на вход массив целых положительных чисел,
//        и 2 целых положительнх числа (значения индексов). Метод возвращает массив,
//        который содержит только числа из первого массива в промежутке между индексами.
//        Например: method({1, 2, 3, 4, 5}, 1, 3) -> {2, 3, 4}
        printTask();
        int a = 2;
        int b = 5;
        int[] arrayNew25 = between(array23, a, b);
        printArray(arrayNew25);
        System.out.println();
        line();

        /** Task 26 */
//        Написать метод, который принимает на вход 2 массива int[] и возвращает
//        объединенный массив уникальных неповторяющихся элементов
        printTask();
        int[] arrayNew26 = oneOfTwo(array22, array23);
        printArray(arrayNew26);
        System.out.println();
        line();
    }
}