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

        /** Task 12 */
//        Распечатать средний возраст котов из массива catsAges
        printTask();
        int avAge = 0;
        for (int i = 0; i < catsAges.length; i++) {
            avAge = avAge + catsAges[i];
        }
        avAge = avAge / catsAges.length;
        System.out.println(avAge + "");

        System.out.println(line);

        /** Task 13 */
//        Распечатать возраст самого молодого кота
        printTask();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 8; i++) {
            if (min > catsAges[i]) {
                min = catsAges[i];
            }
        }
        System.out.println("возраст самого молодого кота = " + min);
        System.out.println(line);

        /** Task 14 */
//        Распечатать возраст самого старого кота
        printTask();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 8; i++) {
            if (max < catsAges[i]) {
                max = catsAges[i];
            }
        }
        System.out.println("возраст самого старого кота = " + max);
        System.out.println(line);

        /** Task 15 */
//        Распечатать количество серых котов
        printTask();
        int greyCats = 0;
        for (int i = 0; i < 8; i++) {
            if (catsColors[i].equals("Серый")) {
                greyCats++;
            }
        }
        System.out.println("количество серых котов = " + greyCats);
        System.out.println(line);

        /** Task 16 */
//        Распечатать имя кота, если кот находится в коробке с четным индексом
//        и его возраст не больше 3 лет
        printTask();
        if (catsNames.length == catsAges.length && catsNames.length > 0) {
            for (int i = 0; i < 8; i++) {
                if ((i % 2 == 0) && (catsAges[i] < 4)) {
                    System.out.println(i + " - " + catsNames[i]);
                }
            }
        }
        System.out.println(line);

        /** Task 17 */
//        Создать массив четных положительных чисел, значения которых не больше 10.
//        (заполняем значения с помощью цикла for)
        printTask();

        /** option 1 */
        int[] array17 = new int[30];
        for (int i = 0; i < array17.length; i++) {
            array17[i] = (int) (Math.random() * 10) + 1;
            if (array17[i] % 2 == 1) {
                array17[i] = array17[i] + 1;
            }
        }
        printArray(array17);
        System.out.println("\n" + line);

        /** option 2 */
        int count = 0;
        for (int i = 0; i < 11; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        int[] array172 = new int[count];
        int number = 0;
        for (int i = 0; i < array172.length; i++) {
            array172[i] = number;
            number = number + 2;
        }
        printArray(array172);
        System.out.println();
        line();

        /** option 3 - то же самое, но счетчик в условии "for" (не рекомендуется) */
        int count1 = 0;
        for (int i = 0; i < 11; i++) {
            if (i % 2 == 0) {
                count1++;
            }
        }
        int[] array173 = new int[count1];
        for (int i = 0, j = 0; i < array173.length; i++, j += 2) {
            array173[i] = j;
        }
        printArray(array173);
        System.out.println();
        line();

        /** Task 18 */
//        Написать метод, который принимает на вход массив int, и возвращает среднее значение.
//        Проверить работу метода тестом, если параметр - массив catsAges
        printTask();
        int rezult = method18(catsAges);
        System.out.println("среднее значение = " + rezult);

        /** Test 18 */
        System.out.println(avAge == rezult);
        System.out.println(line);

        /** Task 19 */
//        Создать массив нечетных отрицательных чисел в промежутке от -1000 до -900
        printTask();
        /** option 1 */
        int[] array19 = new int[15];
        for (int i = 0; i < array19.length; i++) {
            array19[i] = (int) (Math.random() * 100) - 1000;
            if (array19[i] % 2 == 0) {
                array19[i] = array19[i] + 1;
            }
            System.out.print(array19[i] + " ");
        }
        System.out.println("");
        line();

        /** option 2 */
        int n = 0;
        for (int i = -1000; i < -900; i++) {
            if (i % 2 != 0) {
                n++;
            }
        }
        int[] array192 = new int[n];
        int k = -1000;
        if (k % 2 == 0) {
            k++;
        }
        for (int i = 0; i < n; i++) {
            array192[i] = k;
            k += 2;
        }
        printArray(array192);
        System.out.println("\n" + line);

        /** Task 20 */
//        Создать массив из 10 случайных положительных целых чисел
        printTask();
        int[] array20 = new int[10];
        for (int i = 0; i < array20.length; i++) {
//            array20[i] = (int) (Math.random() * (Integer.MAX_VALUE-1) + 1); - так правильнее
            array20[i] = (int) (Math.random() * (100) + 1); // - так понятнее напечатанный результат
            System.out.println(array20[i]);
        }
        line();

        /** Task 21 */
//        Создать метод, который принимает на вход массив int,
//        и возвращает минимальное значение, максимальное значение и среднее значение
//        всех чисел массива. Проверить работу метода на массиве из задания 20.
        printTask();
        int[] array21 = method21(array20);
        System.out.println("минимальное значение = " + array21[0] + "\nмаксимальное значение = " + array21[1] + "\nсреднее значение = " + array21[2]);
        array21 = method21(catsAges);
        System.out.println("минимальное значение = " + array21[0] + "\nмаксимальное значение = " + array21[1] + "\nсреднее значение = " + array21[2]);
        System.out.println(line);
        for (int d : array21) {  // другой способ записи(?)
            System.out.println(d);
        }

        /** Task 22 */
//        Создать массив четных чисел и массив нечетных чисел из элементов массива из задания 20.
        printTask();
        int[] arrayOdd;
        int[] arrayEven;
        int odd = 0;
        int even = 0;
        if (array20.length == 0) {
            System.out.println("Invalid data");
        } else {
            for (int i = 0; i < array20.length; i++) {
                if (array20[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        arrayEven = new int[even];
        arrayOdd = new int[odd];
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < array20.length; i++) {
            if (array20[i] % 2 == 0 && countEven < arrayEven.length) {
                arrayEven[countEven] = array20[i];
                countEven++;
            } else if (countOdd < arrayOdd.length) {
                arrayOdd[countOdd] = array20[i];
                countOdd++;
            }
        }
        System.out.print("массив четных чисел: ");
        for (int i = 0; i < arrayEven.length; i++) {
            System.out.print(arrayEven[i] + " ");
        }
        System.out.print("\nмассив нечетных чисел: ");
        for (int i = 0; i < arrayOdd.length; i++) {
            System.out.print(arrayOdd[i] + " ");
        }

        System.out.println("\n" + line);

        /** Task 23 */
//        Создать двумерный массив, который состоит из имен, возрастов, цветов котов.
//        Распечатать все данные котов в коробках с четными индексами, используя двумерный массив

        printTask();
        /** option 1 - в строках коты, в столбцах признаки */
//        Object[][] cats = new Object[8][3]; - массив типа Objects - если разные типы данных
        String[][] cats1 = new String[8][3]; // если можно все данные перевести в String

        for (int i = 0; i < 8; i++) {
            cats1[i][0] = catsNames[i];
            for (int j = 0; j < catsAges.length; j++) {
                cats1[j][1] = Integer.toString(catsAges[j]); // перевод в String
            }
            cats1[i][2] = catsColors[i];
        }
        for (int i = 0; i < 8; i += 2) {
            for (int j = 0; j < 3; j++) {
                System.out.print(cats1[i][j] + "\t");
            }
            System.out.println();
        }
        line();

        /** option 2 - в строках признаки, в столбцах коты */
        String[][] cats2 = new String[3][8];
        cats2[0] = catsNames;
        for (int i = 0; i < catsAges.length; i++) {
            cats2[1][i] = Integer.toString(catsAges[i]);
        }
        cats2[2] = catsColors;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j += 2) {
                System.out.print(cats2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(line);

        /** Task 24 */
        printTask();

        int[][] array24 = new int[4][8];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                array24[i][j] = (int) (Math.random() * 10) + 1;
                System.out.print(array24[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(line);

        /** Task 25 */
        printTask();
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                if (array24[i][j] % 2 == 0) {
                    sum = sum + array24[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
