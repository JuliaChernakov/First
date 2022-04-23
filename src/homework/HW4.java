package homework;

public class HW4 {

    public static int numTask = 3;

    public static void printTask() {
        System.out.println("★★★★★★★★★★★★ Task " + numTask + " ★★★★★★★★★★★★");
        numTask++;
    }

    public static void printPoint(int numPoint) {
        System.out.println("Point " + numPoint);
    }

    public static void divide(String x14, int a14, String y14, int b14) {
        int res, rem;
        res = a14 / b14;
        rem = a14 % b14;
        System.out.println("Результат деления " + x14 + " на " + y14 + " = " + res + ", а остаток от деления = " + rem);
    }

    public static void apple(int apple, int student) {
        int x15 = apple / student;
        int y15 = apple % student;
        String ap1 = "яблок";
        String ap2 = "яблок";
        String ap3 = "яблок";
        String st = "учеников";

        if (apple / 10 != 1) {
            if (apple % 10 == 1) {
                ap1 = "яблоко";
            }
            if (apple % 10 >= 2 && apple % 10 <= 4) {
                ap1 = "яблокa";
            }
        }

        if (student / 10 != 1) {
            if (student % 10 == 1) {
                st = "ученика";
            }
        }

        if (x15 / 10 != 1) {
            if (x15 % 10 == 1) {
                ap2 = "яблоку";
            }
            if (x15 % 10 >= 2 && x15 % 10 <= 4) {
                ap2 = "яблокa";
            }
        }

        if (y15 / 10 != 1) {
            if (y15 % 10 == 1) {
                ap3 = "яблоко";
            }
            if (y15 % 10 >= 2 && y15 % 10 <= 4) {
                ap3 = "яблокa";
            }
        }

        System.out.println("Если " + apple + " " + ap1 + " поделить на " + student + " "
                + st + ", то каждый ученик получит по " + x15 + " " + ap2 + " и " + y15
                + " " + ap3 + " достанется преподавателю.");
    }

    public static void celcius(int cel) {
        double far = (cel * 1.8 + 32);
        System.out.println("Температура " + cel + " градусов по Цельсию и " + far + " градусов по Фаренгейту");
    }

    public static void paramI(Integer i) {

        String line18 = "-------------------------------------------------";
        int i2 = i * i;

        i = Integer.MIN_VALUE;
        System.out.println(line18);
        System.out.println("| int min\t\t\t\t\t| " + i + "\t\t|");
        i = Integer.MAX_VALUE;
        System.out.println(line18);
        System.out.println("| int max\t\t\t\t\t| " + i + "\t\t|");
        i = i2;
        System.out.println(line18);
        System.out.println("| i squared\t\t\t\t\t| " + i + "\t\t\t\t|");
        System.out.println(line18);
    }

    public static void main(String[] args) {

        String line = "---------------------------";

        /** Task 3 */
        printTask();
        int numPoint = 1;
        printPoint(numPoint);

        boolean x;
        x = (2 == 2) && (7 == 7);
        System.out.println(x);

        ++numPoint;
        printPoint(numPoint);

        x = !(15 < 3);
        System.out.println(x);

        printPoint(++numPoint);

        x = ("Сосна" == "Дуб" || "Вишня" == "Клен");
        System.out.println(x);

        printPoint(++numPoint);

        x = !("Сосна" == "Дуб");
        System.out.println(x);

        printPoint(++numPoint);

        x = (!(15 < 3)) && (10 > 20);
        System.out.println(x);

        printPoint(++numPoint);

        String y = "Глаза даны чтобы видеть";
        String z = "Под третьим этажом находится второй этаж";
        if ((y == "Глаза даны чтобы видеть") && (z == "Под третьим этажом находится второй этаж")) {
            x = true;
        }

        System.out.println(x);

        printPoint(++numPoint);

        int a3 = 6 / 2;
        int b3 = 7 * 5;
        if ((a3 == 3) && (b3 == 20)) {
            x = true;
        } else {
            x = false;
        }
        System.out.println(x);

        System.out.println(line);

        /** Task 4 */
        printTask();
        numPoint = 1;
        printPoint(numPoint);

        String c4 = "В минуте 70 секунд";
        String d4 = "Работающие часы показывают время";
        if ((c4 == "В минуте 60 секунд") || (d4 == "Работающие часы показывают время")) {
            x = true;
        } else {
            x = false;
        }
        System.out.println(x);

        printPoint(++numPoint);

        int a4 = 300 / 5;
        x = ((!(28 > 7)) && (!(a4 == 60)));

        System.out.println(x);

        printPoint(++numPoint);

        c4 = "Телевизор - электрический прибор";
        d4 = "Стекло - дерево";
        if ((c4 == "Телевизор - электрический прибор") && (d4 == "Стекло - не дерево")) {
            x = true;
        } else {
            x = false;
        }
        System.out.println(x);

        printPoint(++numPoint);

        if (!(300 < 100)) {
            c4 = "Жажду можно утолить водой";
        } else {
            c4 = "null";
        }
        System.out.println(c4);

        printPoint(++numPoint);

        if ((75 < 81)) {
            x = 88 == 88;
        } else {
            x = false;
        }
        System.out.println(x);

        System.out.println(line);

        /** Task 5 */
        printTask();
        numPoint = 1;
        printPoint(numPoint);

        int ageAndrew, ageSveta, ageNataly;
        ageAndrew = 25;
        ageSveta = 20;
        ageNataly = 30;
        if (ageAndrew > ageSveta && ageNataly > ageSveta) {
            System.out.println("Андрей старше Светы. Наташа старше Светы");
        }

        printPoint(++numPoint);

        String place = "На полке";
        String book = " стоят учебники";
        String guide = " лежат справочники";
        if (place.equals("На полке")) {
            System.out.println(place + book);
        }
        place = "На столе";
        if (place.equals("На столе")) {
            System.out.println(place + guide);
        }

        printPoint(++numPoint);

        int kids = 10;
        int girls = 7;
        int boys = kids - girls;
        if (girls > boys) {
            System.out.println("Большая часть детей - девочки, остальные - мальчики");
        }

        System.out.println(line);

        /** Task 6 */
        printTask();

        int ageDrive = 16;
        int agePers = 5;
        if (agePers < 0 || agePers > 150) {
            System.out.println("Вы ввели неверный возраст");
        } else {
            if (agePers >= ageDrive) {
                System.out.println("Можно получить водительские права");
            } else {
                System.out.println("Нельзя получить водительские права");
            }
        }

        System.out.println(line);

        /** Task 7 */
        printTask();

        String go = "едет в автобусе";
        if (go != "едет в автобусе") {
            go = "не едет в автобусе";
        }
        String read = "читает книгу";
        if (read != "читает книгу") {
            read = "не читает книгу";
        }
        String look = "смотрит в дверь";
        if (look != "смотрит в окно") {
            look = "не смотрит в окно";
        }
        System.out.println("Петя " + go + ", но при этом " + read + " или " + look);

        System.out.println(line);

        /** Task 8 */
        printTask();

        String esli = "Если с другом ты, ";
        if (esli.equals("Если с другом ты, ")) {
            System.out.println("это хорошо");
        }
        esli = "а когда наоборот";
        if (esli.equals("а когда наоборот")) {
            System.out.println("плохо");
        }

        System.out.println(line);

        /** Task 9 */
        printTask();
        numPoint = 1;
        printPoint(numPoint);

        int you = 20;
        if (you < 0 || you > 150) {
            System.out.println("Введен неправильный возраст");
        } else if (you > 18) {
            System.out.println("Ты взрослый");
        } else {
            System.out.println("Ты ребенок");
        }

        printPoint(++numPoint);

        String ground = "Земля сухая";
        if (ground.equals("Земля сухая")) {
            System.out.println("Нет дождя");
        }
        if (ground.equals("Земля мокрая")) {
            System.out.println("Идет дождь");
        }

        printPoint(++numPoint);

        if (ground.equals("Земля сухая")) {
            System.out.println("Нет дождя");
        } else if (ground.equals("Земля мокрая")) {
            System.out.println("Идет дождь");
        } else {
            System.out.println("Идет снег");
        }

        printPoint(++numPoint);

        String sky = "На небе тучи";
        if (ground.equals("На небе тучи")) {
            System.out.println("Идет дождь");
        } else {
            System.out.println("Идет слепой дождь");
        }

        printPoint(++numPoint);

        String day = "сегодня суббота";
        if (day.equals("сегодня суббота")) {
            System.out.println("завтра воскресенье");
        } else if (day.equals("сегодня пятницк")) {
            System.out.println("вчера был четверг");
        } else {
            System.out.println("Вчера был не четверг а завтра не воскресенье");
        }

        printPoint(++numPoint);

        String rak = "На горе свистнул рак";
        if (rak.equals("На горе свистнул рак")) {
            System.out.println("Прошла вечность");
        } else {
            System.out.println("Ждите дальше");
        }

        printPoint(++numPoint);

        int yourAge = 20;
        boolean gradS = true;
        if (yourAge == 20 && gradS == true) {
            System.out.println("ты можешь не жить с родителями");
        } else {
            System.out.println("живи с родителями");
        }
        System.out.println(line);

        /** Task 10 */
        printTask();

        int a = 0;
        int expectedResult19 = 0;

        if ((a % 2) == 0) {
            a = a * 2;
        } else {
            a = a * a;
        }
        System.out.println(a);

        System.out.println(line);

        /** Task 11 */
        printTask();

        String res11 = "можно голосовать";
        String expectedResult20 = "можно к маме на ручки";
        int age = 1;
        if (age >= 0 || age < 150) {

            if (age >= 18) {
                System.out.println(res11);
            }
            if (age >= 16) {
                res11 = "можно водить машину";
                System.out.println(res11);
            }
            if (age >= 5) {
                res11 = "можно идти в школу";
                System.out.println(res11);
            } else {
                res11 = "можно к маме на ручки";
                System.out.println(res11);
            }
        }

        System.out.println(line);

        /** Task 12 */
        printTask();

        String next = "перевести в следующий класс";
        int grade = 5;
        if (grade <= 5 || grade >= 2) {

            if (grade == 5) {
                System.out.println("выдать похвальную грамоту и " + next);
            } else if (grade == 4) {
                System.out.println(next);
            } else if (grade == 3) {
                System.out.println("дать задание на лето и " + next);
            } else
                System.out.println("вызвать родителей и оставить в текущем классе на второй год");
        }

        System.out.println(line);

        /** Task 13 */
        printTask();

        int res = 0;
        int a13 = 15;
        int b13 = 10;

        if ((a13 % 3 == 0) && (b13 % 3 == 0)) {
            res = a13 + b13;
            System.out.println(res);
        }
        if ((a13 % 5 == 0) && (b13 % 5 == 0)) {
            res = a13 - b13;
            System.out.println(res);
        }
        if ((a13 % 2 == 0) && (b13 % 2 == 0)) {
            res = a13 * b13;
            if (a13 < 0 || b13 < 0) {
                res = res * -1;
            }
            System.out.println(res);
        }
        if (!((a13 % 3 == 0) && (b13 % 3 == 0)) && !((a13 % 5 == 0) && (b13 % 5 == 0)) &&
                !(a13 % 2 == 0) && (b13 % 2 == 0))
            System.out.println("Невозможно произвести действия");

        System.out.println(line);

        /** Task 14 */
        printTask();

        int k = 5;
        int l = 10;
        int m = 15;

        divide("k", k, "l", l);
        divide("k", k, "m", m);
        divide("l", l, "k", k);
        divide("l", l, "m", m);
        divide("m", m, "k", k);
        divide("m", m, "l", l);

        System.out.println(line);

        /** Task 15, 16 */
        printTask();
        printTask();

        int apple = 24;
        int student = 6;
        apple(apple, student);

        System.out.println(line);

        /** Task 17 */
        printTask();

        int cel = 29;
        celcius(cel);

        System.out.println(line);

        /** Task 18 */
        printTask();

        Integer i = 5;
        paramI(i);

        i = 10;
        paramI(i);

        System.out.println(line);

        /** Task 19 */
        printTask();

        if (a == expectedResult19) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        System.out.println(line);

        /** Task 20 */
        printTask();

        if (res11 == expectedResult20) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        System.out.println(line);

        /** Task 21 */
        printTask();

        short r = -1876;
        if (r <= Short.MAX_VALUE && r >= Short.MIN_VALUE) {
            if (r < 0) {
                r = (short) (r * -1);
            }
            String raz = "It's a one-digit number";
            if ((r / 10) != 0) {
                raz = "It's a two-digit number";
            }
            if ((r / 100) != 0) {
                raz = "It's a three-digit number";
            }
            if ((r / 1000) != 0) {
                raz = "It's a four-digit number";
            }
            if ((r / 10000) != 0) {
                raz = "It's a five-digit number";
            }
            System.out.println(raz);
        }
    }
}
