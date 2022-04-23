package homework;

import java.util.Objects;

public class HW5 {
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

        /** Task 11 */
//        Написать метод, который принимает на вход необходимые параметры
//        и печатает строку ведомости выдачи зарплаты сотрудникам.
//        Например:
//
//        Смирнова Мария Ивановна 		70000 руб 00 коп
//
//        Распечатать ведомость для нескольких сотрудников, например:
//
//        Март 2022
//        Смирнова Мария Ивановна 		70000 руб 00 коп
//        Серебряков Иван Петрович 		128059 руб 00 коп
        printTask();
        String month = "Март 2022";
        System.out.println(month);
        String name11 = "Смирнова Мария Ивановна ";
        double zpl11 = 70000;
        strokaVedomosti(name11, zpl11);
        name11 = "Серебряков Иван Петрович";
        zpl11 = 128059;
        strokaVedomosti(name11, zpl11);
        name11 = "Кузнецов Михаил Иванович";
        zpl11 = 30783.5;
        strokaVedomosti(name11, zpl11);
        name11 = "Михайлова Полина Сергеевна";
        zpl11 = 59879.65;
        strokaVedomosti(name11, zpl11);

        System.out.println(line);

        /** Task 12 */
//        Записать блок-схему в виде метода
        printTask();
        String defX = defineX(10);
        System.out.println(defX);
        String expectedResult12 = "x is positive"; //negative, positive, zero

        /** Test 12 */
        System.out.println(verifyEquals(expectedResult12, defX));

        System.out.println(line);

        /** Task 13 */
//        Написать метод, который принимает на вход год рождения и возвращает
//        ваше счастливое число. Счастливое число рассчитывается по формуле:
//        сумма всех чисел, если результат больше 9, снова считается сумма всех чисел.
//        Например:
//        год рождения 1999
//        1 + 9 + 9 + 9 = 28
//        2 + 8 = 10
//        1 + 0 = 1
//        Счастливое число - 1
        printTask();
        int year = 1996;
        int expectedResult13 = 7;
        int happy = happy(year);
        if (happy == 0) {
            System.out.println("Вы ввели неверный год");
        } else {
            System.out.println("Ваше счастливое число = " + happy);
        }

        /** Test 13 */
        System.out.println(verifyEquals(expectedResult13, happy));

        System.out.println(line);

        /** Task 14 */
        printTask();
//        а) Дано 3 числа. Необходимо рассчитать разницу между средним значением
//        и медианой (median) значением. Если разница больше 2,
//        необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.
//        Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.
//        b) Посчитать все то же самое с помощью методов класса Math, где возможно их использовать
        double k = 5.54444;
        double l = 12.266667;
        double m = 15;
        String sr = "Среднее значение ";
        String otl = " отличается от медианы ";
        String na = " на ";
        String rav = " = ";
        String med = ", медиана ";
        double srednee = srednee(k, l, m);
        double median = median(k, l, m);
        double razn = razn(srednee, median);
        double expectedResult14 = 1.33;
        if (razn > 2) {
            System.out.println(sr + srednee + otl + median + na + razn);
        } else {
            System.out.println(sr + rav + srednee + med + rav + median);
        }

        /** Test 14 */
        System.out.println(verifyEquals(expectedResult14, razn));

        System.out.println(line);

        /** Task 15 */
//        Написать метод, который использует методы класса Math, принимает на вход
//        сумму к оплате (например, 10.75) и округляет сумму в пользу покупателя.
//        Метод возвращает новую сумму к оплате в виде строки, например “10 руб 00 коп”.
        printTask();

        double sum15 = 10.75;
        String expectedResult15 = "10 руб 00 коп";
        String sumPok = sumPok(sum15);
        System.out.println(sumPok);

        /** Test 15 */
        System.out.println(verifyEquals(expectedResult15, sumPok));

        System.out.println(line);

        /** Task 16 */
//        Посчитать с помощью методов класса Math
//        a = 3
//        b = 4
//        c = 20
//        Вернуть значение с округлением в бОльшую сторону.
        printTask();
        int a = 3;
        int b = 4;
        int c = 20;
        int expectedResult16 = 17;
        int formula = formula(a, b, c);
        System.out.println(formula);

        /** Test 16 */
        System.out.println(verifyEquals(expectedResult16, formula));

        System.out.println(line);

        /** Task 17 */
        printTask();
        /** 17.1 */
//        Write the java statement that assigns 1 to x if y is greater than 0
        int numPoint = 1;
        printPoint(numPoint);

        double y17 = 15.4;
        int expectedResult171 = 1;
        int x17 = x17(y17);
        System.out.println(x17);

        /** Test 17.1 */
        System.out.println(verifyEquals(expectedResult171, x17));

        System.out.println(lineP);
        /** 17.2 */
//        Suppose that score is a variable of type double. Write the java statement
//        that increases the score by 5 marks if score is between 80 and 90
        printPoint(++numPoint);

        double score = 81;
        double expectedResult172 = 86.0;
        score = score(score);
        System.out.println(score);

        /** Test 17.2 */
        System.out.println(verifyEquals(expectedResult172, score));

        System.out.println(lineP);
        /** 17.3 */
//        Rewrite in Java the following statement without using the NOT(!) operator:
//        item = ! ((i < 10) || (v >= 50))
        printPoint(++numPoint);

        int i = 3;
        int v = 5;
        boolean item = (i >= 10) && (v < 50);
        System.out.println(item);

        System.out.println(lineP);
        /** 17.4 */
//        Write a java statement that prints true if x is an odd number and positive
        printPoint(++numPoint);

        int x174 = 4;
        boolean st174 = false;
        if (x174 % 2 == 1 && x174 > 0) {
            st174 = true;
        }
        System.out.println(st174);

        System.out.println(lineP);
        /** 17.5 */
//        Write a java statement that prints true if both x and y are positive numbers
        printPoint(++numPoint);

        int x175 = 4;
        int y175 = 6;
        boolean st175 = false;
        if (x175 % 2 == 0 && y175 % 2 == 0) {
            st175 = true;
        }
        System.out.println(st175);

        System.out.println(lineP);
        /** 17.6 */
//        Write a java statement that prints true if x and y have the same sign (+/-)
        printPoint(++numPoint);

        int x176 = 0;
        int y176 = 6;
        boolean st176 = false;
        if (x176 * y176 != 0) {
            if (x176 * y176 > 0) {
                st176 = true;
            }
        }
        System.out.println(st176);

        System.out.println(line);

        /** Task 18 */
//        Написать метод, который с помощью методов класса Math высчитывает любую степень
//        сгенерированного случайного числа. Метод возвращает математически округленное
//        целое значение и выводит на экран: “Число … в степени … = …”
        printTask();
        int stepen = 2;
        double chislo = Math.random();
        int expectedResult18 = (int) (chislo * chislo);
        int actualRezult = stepen(chislo, stepen);

        System.out.println(line);

        /** Test 18 */
        System.out.println(verifyEquals(expectedResult18, actualRezult));

        System.out.println(line);


        /** Task 19 */
//        Написать метод, который возвращает случайное число в пределах от 1 до 99 включительно.
        printTask();

        int s = sluch99();
        System.out.println(s);

        System.out.println(line);

        /** Task 20 */
//        Assume that the following declarations have been made:
//        int year;
//        boolean isLeapYear;
//
//        Write a fragment that will assign isLeapYear to true
//        if year represents a leap year and false otherwise
        printTask();

        int year20 = 2000;
        boolean expectedResult20 = true;
        boolean isLeapYear = isLeapYear(year20);
        System.out.println(year20 + " это высокосный год = " + isLeapYear);

        /** Test 20 */
        System.out.println(verifyEquals(expectedResult20, isLeapYear));

        System.out.println(line);
    }
}
