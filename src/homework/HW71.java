package homework;

import static lessons.Utils.*;

public class HW71 {

    public static int method18(int[] array) {
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            a += array[i];
        }

        return a / array.length;
    }

    public static int[] method21(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
            average = average + array[i];
        }
        average = average / array.length;
        return new int[]{min, max, average};
    }

    public static void main(String[] args) {
        String line = "---------------------------";

        /** Task 1 */
//        Создать массив catsNames, заполнить его любыми значениями (см картинку котов из презентации)
        printTask();
        String[] catsNames = {"Мурка", "Беляш", "Пушок", "Чешир", "Гарфилд", "Дымка", "Бегемот", "Базилио"};
        for (int i = 0; i < 8; i++) {
            System.out.print(catsNames[i] + ", ");
        }
        System.out.println("\n" + line);

        /** Task 2 */
//        В массиве catsNames изменить значение элемента с индексом 4 на “Рыжик”,
//        а значение элемента с индексом 1 на “Черныш”.
        printTask();
        catsNames[4] = "Рыжик";
        catsNames[1] = "Черныш";
        System.out.println("4 - " + catsNames[4] + ", 1 - " + catsNames[1]);

        System.out.println(line);

        /** Task 3 */
//        Создать массив catsColors и заполнить его значениями.
        printTask();
        String[] catsColors = {"Серый", "Черный", "Белый", "Серый", "Рыжий", "Серый", "Рыжий", "Серый"};
        for (int i = 0; i < 8; i++) {
            System.out.print(catsColors[i] + ", ");
        }
        System.out.println("\n" + line);

        /** Task 4 */
        //       Создать массив catsAges и заполнить его любыми значениями.
        printTask();
        int[] catsAges = {3, 5, 6, 2, 1, 8, 10, 6};
        for (int i = 0; i < 8; i++) {
            System.out.print(catsAges[i] + ", ");
        }
        System.out.println("\n" + line);

        /** Task 5 */
//        Создать массив isCatRed и заполнить его соответствующими значениями
        printTask();
        boolean[] isCatRed = new boolean[catsColors.length];
        for (int i = 0; i < isCatRed.length; i++) {
            if (catsColors[i].equals("Рыжий")) {
                isCatRed[i] = true;
            } else {
                isCatRed[i] = false;
            }
        }
        printArray(isCatRed);
        System.out.println("\n" + line);

        /** Task 6 */
        //       Распечатать для массивов catsNames и catsColors:
        printTask();
        int numPoint = 1;
//       * имя кота в коробке с номером 6
        printPoint(numPoint);
        System.out.println(catsNames[6]);

//       * имена котов из коробок с четными индексами
        printPoint(++numPoint);
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " - " + catsNames[i]);
            }
        }
//       * имена котов из коробок, чьи индексы кратны 4
        printPoint(++numPoint);
        for (int i = 0; i < 8; i++) {
            if (i % 4 == 0) {
                System.out.println(i + " - " + catsNames[i]);
            }
        }
//       * цвет котов из коробок с нечетными индексами
        printPoint(++numPoint);
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 1) {
                System.out.println(i + " - " + catsColors[i]);
            }
        }
//       * цвет котов из коробок, чьи индексы кратны 3
        printPoint(++numPoint);
        for (int i = 0; i < 8; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " - " + catsColors[i]);
            }
        }
        System.out.println(line);

        /** Task 7 */
//        Распечатать “Накорми кота!” для всех серых котов
        printTask();
        for (int i = 0; i < 8; i++) {
            if (catsColors[i].equals("Серый")) {
                System.out.println(i + " - Накорми кота!");
            }
        }
        System.out.println(line);

        /** Task 8 */
//        Распечатать “Отнеси кота на прививку!”, если возраст кота меньше 2 лет
        printTask();
        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] < 0 || catsAges[i] > 50) {
                System.out.println("Error");
            } else if (catsAges[i] < 2) {
                System.out.println(i + " - Отнеси кота на прививку!");
            }
        }
        System.out.println(line);

        /** Task 9 */
//        Для кота в последней коробке распечатать имя, цвет, возраст
        printTask();
        if (catsNames.length == catsColors.length && catsNames.length == catsAges.length && catsNames.length > 0) {
            int i = catsNames.length - 1;
            System.out.println(catsNames[i] + ", " + catsColors[i] + ", " + catsAges[i]);
        }

        System.out.println(line);

        /** Task 10 */
//        Распечатать имена всех котов, чей возраст больше 2 лет
        printTask();
        if (catsNames.length == catsAges.length && catsNames.length > 0) {
            for (int i = 0; i < 8; i++) {
                if (catsAges[i] > 2) {
                    System.out.print(catsNames[i] + ", ");
                }
            }
        }
        System.out.println("\n" + line);

        /** Task 11 */
//        Распечатать “Накорми кота!” если имя кота “Рыжик” и значение isCatRed == true
        printTask();
        if (catsNames.length == isCatRed.length && catsNames.length > 0) {
            for (int i = 0; i < 8; i++) {
                if (catsNames[i].equals("Рыжик") && isCatRed[i]) {
                    System.out.println(i + " - Накорми кота!");
                }
            }
        }
        System.out.println(line);
    }}