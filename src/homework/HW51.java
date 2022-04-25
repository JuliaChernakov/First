package homework;

import java.util.Objects;

public class HW51 {
    public static int numTask = 2;
    public static int numPoint;

    public static void printTask() {
        System.out.println("★★★★★★★★★★★★ Task " + numTask + " ★★★★★★★★★★★★");
        numTask++;
    }

    public static void printPoint(int numPoint) {
        System.out.println("Point " + numPoint);
    }

    //    ВСЕ!!! результаты должны быть протестированы, для этого необходимо создать
//    метод с названием verifyEquals(expectedResult, actualResult)
    public static boolean verifyEquals(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean verifyEquals(String expectedResult, String actualResult) {
        if (Objects.equals(expectedResult, actualResult)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean verifyEquals(double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean verifyEquals(boolean expectedResult, boolean actualResult) {
        if (expectedResult == actualResult) {
            return true;
        } else {
            return false;
        }
    }

    public static String weekDay(int weekDay) {
        if (weekDay >= 1 && weekDay <= 7) {
            if (weekDay == 1) {
                return "Понедельник";
            } else if (weekDay == 2) {
                return "Вторник";
            } else if (weekDay == 3) {
                return "Среда";
            } else if (weekDay == 4) {
                return "Четверг";
            } else if (weekDay == 5) {
                return "Пятница";
            } else if (weekDay == 6) {
                return "Суббота";
            } else {
                return "Воскресенье";
            }
        } else {
            return "день недели не определен";
        }
    }

    public static int largest(int x, int y, int z) {
        int largest;
        if (x > y) {
            largest = x;
        } else {
            largest = y;
        }
        if (largest < z) {
            largest = z;
        }
        return largest;
    }

    public static int smallest(int x, int y, int z) {
        int smallest;
        if (x < y) {
            smallest = x;
        } else {
            smallest = y;
        }
        if (smallest > z) {
            smallest = z;
        }
        return smallest;
    }

    public static String perevodVRubli(double chislo) {
        int rubli = (int) Math.floor(chislo);
        int kopeiki = (int) ((chislo - rubli + 0.001) * 100);
        return (rubli + " руб " + kopeiki + " коп");
    }

    public static String perevodVKg(double chislo) {
        int kilo = (int) Math.floor(chislo);
        int gramm = (int) ((chislo - kilo + 0.0001) * 1000);
        return (kilo + " кг " + gramm + " гр");
    }

    public static double summaPokupki(double price, double quantity) {
        double sum = price * quantity;
        return sum;
    }

    public static double printReceipt(String name, double price, double quantity) {
        String line = "-----------------------------------------";
        double summaPokupki = price * quantity;
        System.out.println(line);
        System.out.println("| " + name + "\t\t\t\t\t\t\t\t|");
        System.out.println("| Цена за 1 кг\t\t\t  " + perevodVRubli(price) + "\t|");
        System.out.println("| Количество товара\t\t\t" + perevodVKg(quantity) + "\t|");
        System.out.println(line);
        System.out.println("| Сумма к оплате\t\t  " + summaPokupki(price, quantity) + "\t|");
        System.out.println(line);
        return summaPokupki;
    }

    public static String zplVMes(int chas, double stoim, int kolRabDney) {
        return perevodVRubli(chas * stoim * kolRabDney);
    }

    public static void strokaVedomosti(String name11, double zpl11) {
        System.out.println(name11 + "\t\t" + perevodVRubli(zpl11));
    }

    public static String defineX(double x) {
        String defX;
        if (x < 0) {
            return "x is negative";
        } else if (x > 0) {
            return "x is positive";
        } else {
            return "x is zero";
        }
    }

    public static int sumOfDigits(int chislo) {
        int x = chislo / 1000;
        int sumOfDigits = x;
        chislo = chislo - x * 1000;
        x = chislo / 100;
        sumOfDigits = sumOfDigits + x;
        chislo = chislo - x * 100;
        x = chislo / 10;
        sumOfDigits = sumOfDigits + x;
        chislo = chislo - x * 10;
        x = chislo;
        sumOfDigits = sumOfDigits + x;
        return sumOfDigits;
    }

    public static int happy(int year) {
        if (year > 0 && year < 2050) {
            int happy = sumOfDigits(year);
            if (happy > 9) {
                happy = sumOfDigits(happy);
            }
            return (happy);
        } else {
            return 0;
        }
    }

    public static double srednee(double k, double l, double m) {
        return (Math.round(((k + l + m) / 3) * 100)) / 100.0;
    }

    public static double max(double k, double l, double m) {
        double max = k;
        if (max < l) {
            max = l;
        }
        if (max < m) {
            max = m;
        }
        return max;
    }

    public static double min(double k, double l, double m) {
        double min = k;
        if (min > l) {
            min = l;
        }
        if (min > m) {
            min = m;
        }
        return min;
    }

    public static double median(double k, double l, double m) {
//        double max = max(k,l,m);
//        double min = min(k,l,m);
        double max = Math.max(k, Math.max(l, m));
        double min = Math.min(k, Math.min(l, m));

        if ((k != max) && (k != min)) {
            return (Math.round(k * 100)) / 100.0;
        } else if ((l != max) && (l != min)) {
            return (Math.round(l * 100)) / 100.0;
        } else {
            return (Math.round(m * 100)) / 100.0;
        }
    }

    public static double razn(double a, double b) {
//        double razn = a - b;
//        if (razn < 0) {
//            razn = razn * -1;
//        }
        return Math.abs(a - b);
    }

    public static String sumPok(double sum15) {
        int s = (int) Math.floor(sum15);
        String sumPok = s + " руб 00 коп";
        return sumPok;
    }

    public static int formula(int a, int b, int c) {
        int formula = (int) Math.ceil((Math.sqrt(((a * b) + c) * Math.pow(a, b))) / Math.PI);
        return formula;
    }

    public static int x17(double y17) {
        int x17 = 0;
        if (y17 > 0) {
            x17 = 1;
        }
        return x17;
    }

    public static double score(double s) {
        if (s > 80 && s < 90) {
            s = s + 5;
        }
        return s;
    }

    public static int stepen(double chislo, int stepen) {
        int num;
        if (stepen >= 0 && stepen <= 10) {
            num = (int) Math.round(Math.pow(chislo, stepen));
            System.out.println("Число " + chislo + " в степени " + stepen + " = " + num);
        } else {
            System.out.println("неверное значение степени");
            num = Integer.MIN_VALUE;
        }
        return num;
    }

    private static int sluch99() {
        return (int) (Math.random() * 99 + 1);
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        String line = "---------------------------";
        String lineP = "---------";

        /** Task 2 */
//        Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели
        printTask();

        int weekDay = 7;
        String expectedResult2 = "Воскресенье";
        String result2 = weekDay(weekDay);
        System.out.println("сегодня " + result2);

        /** Test 2 */
        String actualResult2 = result2;
        System.out.println(verifyEquals(expectedResult2, actualResult2));

        System.out.println(line);

        /** Task 3 */
//        Given three values: x, y and z, determine the largest value
//        and assign this value to the variable "largest"
        printTask();
        int x = 25;
        int y = 10;
        int z = 15;
        int expectedResult3 = 25;
        int largest = largest(x, y, z);
        System.out.println("максимум = " + largest);

        /** Test 3 */
        int actualResult3 = largest;
        System.out.println(verifyEquals(expectedResult3, actualResult3));

        System.out.println(line);

        /** Task 4 */
//        Using nested if statements, write a fragment of code that prints
//        the smallest value contained in the variables a, b and c.
        printTask();
        x = 5;
        y = 10;
        z = 15;
        int expectedResult4 = 5;
        int smallest = smallest(x, y, z);
        System.out.println("минимум = " + smallest);

        /** Test 4 */
        System.out.println(verifyEquals(expectedResult4, smallest));

        System.out.println(line);

        /** Task 5 */
//        Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота.
        printTask();

        double t1 = 36.78;
        double t2 = 37;
        double t3 = 38;
        double t4 = 35.13;
        double t5 = 35;
        String expectedResult5 = "36.2";

        double avTemp = (t1 + t2 + t3 + t4 + t5) / 5;
        String result5 = String.format("%.2f", avTemp);

        System.out.println("Средняя температура тела кота = " + result5);

        /** Test 5 */
        System.out.println(verifyEquals(expectedResult5, result5));

        System.out.println(line);

        /** Task 6 */
//        Написать метод, который принимает на вход десятичное число (например, 10.75),
//        и возвращает строку “10 руб 75 коп”
        printTask();

        double chislo6 = 10.75;
        String expectedResult6 = "10 руб 75 коп";

        String rubKop = perevodVRubli(chislo6);
        System.out.println(rubKop);

        /** Test 6 */
        System.out.println(verifyEquals(expectedResult6, rubKop));

        System.out.println(line);

        /** Task 7 */
//        Написать метод, который принимает на вход десятичное число и возвращает строку “10 кг 75 гр”
        printTask();

        double chislo7 = 10.275;
        String expectedResult7 = "10 кг 275 гр";

        String kgGr = perevodVKg(chislo7);
        System.out.println(kgGr);

        /** Test 7 */
        System.out.println(verifyEquals(expectedResult7, kgGr));

        System.out.println(line);

        /** Task 8 */
//        Написать метод, который принимает на вход 2 параметра - цену и
//        количество товара (может быть вес товара, или количество в штуках).
//        Алгоритм возвращает сумму покупки в виде десятичного числа.
        printTask();
        double price8 = 9;
        double quantity = 1.5;
        double expectedResult8 = 13.50;
        double sum = summaPokupki(price8, quantity);
        System.out.println(sum);

        /** Test 8 */
        System.out.println(verifyEquals(expectedResult8, sum));

        System.out.println(line);

        /** Task 9 */
//        Написать метод, который принимает на вход необходимые параметры, и печатает чек.
//        Например:
//
//        Яблоки
//        Цена за 1 кг			50 руб 13 коп
//        Количество товара	         3 кг 400 гр
//                _______________________________________
//        Сумма к оплате		170 руб 44 коп
//
//                или
//
//        Хлеб
//        Цена за 1 шт		30 руб 50 коп
//        Количество товара	5 шт
//                _______________________________________
//        Сумма к оплате		152 руб 50 коп
        printTask();
        String name9 = "Яблоки";
        double price9 = 1.5;
        double apple = 10;
        double expectedResult9 = 15;
        double summaPokupki9 = printReceipt(name9, price9, apple);

        /** Test 9 */
        System.out.println(verifyEquals(expectedResult9, summaPokupki9));

        System.out.println(line);

        /** Task 10 */
//        Написать метод, который принимает на вход количество часов работы в день
//        и стоимость одного часа работы, и возвращает заработную плату в месяц.
        printTask();
        int chas = 8;
        double stoim = 50.7;
        int kolRabDney = 21;
        String expectedResult10 = "8517 руб 60 коп ";
        String zpl10 = zplVMes(chas, stoim, kolRabDney);
        System.out.println(zpl10);

        /** Test 10 */
        System.out.println(verifyEquals(expectedResult10, zpl10));

        System.out.println(line);
    }
}
