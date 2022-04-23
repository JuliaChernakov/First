package homework;

import java.text.DecimalFormat;
import static lessons.Utils.*;

public class HW6 {

    public static void method10(double start, double end, double step) {
        if (start < end && step > 0) {
            for (; start < end; start += step) {
                System.out.print(start + ", ");
            }
        } else if (start > end && step < 0) {
            for (; start > end; start += step) {
                System.out.print(start + ", ");
            }
        } else {
            System.out.print("Последовательность невозможна");
        }
    }

    public static void method11(int l) {
        int i;
        if (l < 1) {
            System.out.println("Invalid data");
        } else {
            for (i = 0; l > 0; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                    l--;
                }
            }
        }
    }

    public static void method12(int n) {
        if (n <= 0) {
            System.out.println("Invalid data");
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.print((int) Math.pow(2, i) + " ");
            }
        }
    }

    public static void method16(int n, int m, int l) {
        if (m == 0 || l < 1) {
            System.out.print("Invalid data");
        } else {
            if (n % 2 == 0 && m % 2 == 0) {
                System.out.print("No odd numbers");
            } else {
                for (int i = n; l > 0; i += m) {
                    if (i % 2 != 0) {
                        System.out.print(i + " ");
                        l--;
                    }
                }
            }
        }
        System.out.println();
    }

    public static void method17(int n, int l) {
        l = n + l;
        for (; n < l; n++) {
            System.out.println((n + 1) + " = " + (n + 2));
        }
    }

    public static void method18(int l, int n) {
        System.out.println(n + " = " + n);
        for (int i = n + 1; i < l + n; i++) {
            System.out.println(i + " = " + 2 * (i - 1));
        }
    }

    public static void method20(double x) {
        double y;
        if (x > 1.5) {
            y = (2.5 * x * x * x) + (6 * x * x) - 30;
        } else if (x >= 0 && x <= 1.5) {
            y = x + 1;
        } else {
            y = x;
        }
        y = (Math.round(y * 10));
        System.out.println(y / 10);
//        String ySt = new DecimalFormat("#0.00").format(y);
//        System.out.println(ySt);
    }

    public static void main(String[] args) {
        String line = "---------------------------";

        /** Task 1 */
//        Распечатать последовательность чисел от 0 до 9 включительно.
        printTask();
        int i;
        for (i = 0; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + line);

        /** Task 2 */
//        Распечатать последовательность чисел от 10 исключительно до 0 включительно.
        printTask();
        for (i = 10; i > -1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + line);

        /** Task 3 */
//        Распечатать последовательность чисел от 50 до 55 включительно с шагом 2
        printTask();
        for (i = 50; i < 56; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + line);

        /** Task 4 */
//        Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)
        printTask();
        for (i = 326; i > 300; i--) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n" + line);

        /** Task 5 */
//        Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1
        printTask();
        for (i = 120; i < 131; i++) {
            System.out.print((double) i / 10 + " ");
        }
        System.out.println("\n" + line);

        /** Task 6 */
//        Распечатать последовательность четных чисел от 215 до 237 включительно
        printTask();
        i = 215;
        if (i % 2 == 1) {
            i++;
        }
        for (; i < 238; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + line);

        /** Task 7 */
//        Распечатать последовательность чисел, кратных 7,
//        в промежутке от 7 исключительно до 14 исключительно
        printTask();
        for (i = 8; i < 14; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n" + line);

        /** Task 8 */
//        Распечатать последовательность которая начинается с минимального значения
//        типа данных short и заканчивается максимальным значением short.
//        Числа в последовательности должны быть кратны 15001.
        printTask();
        /** Option 1 */
        for (i = Short.MIN_VALUE; i <= Short.MAX_VALUE; i++) {
            if (i % 15001 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        /** Option 2 */
        for (i = Short.MIN_VALUE; i % 15001 != 0; i++) {
        }
        for (; i <= Short.MAX_VALUE; i += 15001) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + line);

        /** Task 9 */
//        Распечатать последовательность чисел в промежутке от -10 до 34 включительно.
//        Числа, кратные 11, должны быть распечатаны синим цветом.
//        Числа, кратные 12, должны быть распечатаны красным цветом.
//        А ноль необходимо распечатать словом ZERO
        printTask();
        for (i = -10; i < 35; i++) {
            if (i == 0) {
                System.out.print("ZERO ");
            } else if (i % 11 == 0) {
                System.out.print("\u001B[34m" + i + "\u001B[0m" + " ");
            } else if (i % 12 == 0) {
                System.out.print("\u001B[31m" + i + "\u001B[0m" + " ");
//            } else {
//                System.out.print(i + " ");
            }
        }
        System.out.println("\n" + line);

        /** Task 10 */
//        Написать метод, который принимает на вход параметры start, end, step,
//        и печатает последовательность десятичных  чисел, начиная с числа start,
//        с шагом step. Точка выхода из цикла - число end
        printTask();
        // happy path
        method10(10.5, 20.75, 1.29);
        System.out.println("");
        method10(15.9, 0, -1.5);
        // negative test
        System.out.println("");
        method10(19, 0, 0);
        System.out.println("");
        method10(19, 0, 1);
        System.out.println("");
        method10(0, 15, -1);
        System.out.println("");
        method10(19, 19, 1);
        System.out.println("\n" + line);

        /** Task 11 */
//        Написать метод, который принимает параметр l и печатает последовательность
//        четных чисел от нуля. Длина последовательности = l.
        printTask();
        int l = 10;
        method11(l);
        System.out.println("\n" + line);

        /** Task 12 */
//        Напишите метод, который принимает целое число n, и выводит
//        все степени числа 2 от 1 до n включительно
        printTask();
        int n = 10;
        method12(n);
        System.out.println("\n" + line);

        /** Task 13 */
//        Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.
        /** Option 1 */
        printTask();
        for (i = 0; i < 10; i++) {
            System.out.print(i);
        }
        System.out.print("00");
        for (i = 11; i < 100; i += 11) {
            System.out.print(i);
        }
        System.out.print("000");
        for (i = 111; i < 1000; i += 111) {
            System.out.print(i);
        }
        System.out.print("0000");
        for (i = 1111; i < 10000; i += 1111) {
            System.out.print(i);
        }
        System.out.println();

        /** Option 2 */
        String result1 = "";
        String result2 = "";
        String result3 = "";
        String result4 = "";
        for (i = 0; i < 10; i++) {
            result1 = result1 + i;
            result2 = result2 + i + i;
            result3 = result3 + i + i + i;
            result4 = result4 + i + i + i + i;
        }
        System.out.println(result1 + result2 + result3 + result4);

        /** Option 3 */
        for (i = 0; i < 10; i++) {
            System.out.print(i);
        }
        for (i = 0; i < 10; i++) {
            System.out.print("" + i + i);
        }
        for (i = 0; i < 10; i++) {
            System.out.print("" + i + i + i);
        }
        for (i = 0; i < 10; i++) {
            System.out.print("" + i + i + i + i);
        }
        System.out.println();

        /** Option 4 */
        for (i = 1; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < i; k++) {
                    System.out.print(j);
                }
            }
        }
        System.out.println();

        /** Option 5 */
        for (i = 1; i < 5; i++) {
            System.out.print("0".repeat(i) + "1".repeat(i) + "2".repeat(i) + "3".repeat(i) + "4".repeat(i)
                    + "5".repeat(i) + "6".repeat(i) + "7".repeat(i) + "8".repeat(i) + "9".repeat(i));
        }
        System.out.println();
        System.out.println(line);

        /** Task 14 */
//        Распечатайте последовательность чисел:
//        0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5
        printTask();
        /** Option 1 */
        System.out.print("0");
        for (i = 1; i < 6; i++) {
            System.out.print(", " + i + ", " + i * -1);
        }
        System.out.println();

        /** Option 2 */
        System.out.print("0");
        for (int j = 1, k = -1; j < 6 || k > -6; j++, k--) {
            System.out.print(", " + j + ", " + k);
        }
        System.out.println("\n" + line);

        /** Task 15 */
//        Распечатать последовательность чисел:
//        0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25
        printTask();
        for (i = 0; i < 26; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n" + line);

        /** Task 16 */
//        Написать метод, который принимает параметры n, m, l, и печатает последовательность
//        нечетных чисел начиная с числа n, с шагом m, длина последовательности l.
        printTask();
        method16(0, 3, 15);
        method16(5, 2, 15);
        method16(40, -3, 15);
        method16(-400, 3, 15);
        method16(40, -4, 15);
        method16(2, 4, 15);
        method16(-40, -4, 15);
        method16(3, 0, 15);
        method16(0, 3, 0);
        method16(0, 3, -15);

        System.out.println("\n" + line);

        /** Task 17 */
//        Сгенерируйте и распечатайте последовательность по формуле:
//        n + 1 = n + 2
        printTask();
        method17(1, 10);
        System.out.println("\n" + line);

        /** Task 18 */
//        Написать метод, который принимает параметры l, n, и печатает последовательность
//        чисел, начиная с числа n, по формуле для n + 1 члена последовательности:
//        n + 1 = 2n. Длина последовательности l.
        printTask();
        method18(10, 1);
        System.out.println("\n" + line);

        /** Task 19 */
//        Сгенерируйте последовательность целых положительных  двузначных чисел, в которых
//        разница между первой цифрой (десятки) и второй цифрой (единицы) не превышает 3.
        printTask();
        for (i = 10; i < 100; i++) {
            if (i == 50) {
                System.out.println();
            }
            if (Math.abs((i / 10) - (i % 10)) < 4) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n" + line);

        /** Task 20 */
//        Написать метод, который вычислит значение функции
        printTask();
        method20(2.7);
        method20(1.2);
        method20(0);
        method20(-3);
    }
}
