package homework;

import static lessons.Utils.*;

public class HW61 {


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


    }
}
