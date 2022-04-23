package homework;

public class HW4Apples {

    public static int ten(int n) {
        if (n > 100) {
            n = n % 100;
        }
        return n;
    }

    public static String applePad(int qAp) {

        qAp = ten(qAp);
        String ap1 = "яблок";
        if (qAp / 10 != 1) {
            if (qAp % 10 == 1) {
                ap1 = "яблоко";
            }
            if (qAp % 10 >= 2 && qAp % 10 <= 4) {
                ap1 = "яблокa";
            }
        }
        return ap1;
    }

    public static String studPad(int qSt) {

        qSt = ten(qSt);
        String st = "учеников";
        if (qSt / 10 != 1) {
            if (qSt % 10 == 1) {
                st = "ученика";
            }
        }
        return st;
    }

    public static String applePad2(int qAp) {

        qAp = ten(qAp);
        String ap2 = "яблок";
        if (qAp / 10 != 1) {
            if (qAp % 10 == 1) {
                ap2 = "яблоку";
            }
            if (qAp % 10 >= 2 && qAp % 10 <= 4) {
                ap2 = "яблокa";
            }
        }
        return ap2;
    }

    public static void fraze(int apple, int student) {
        int chas = apple / student;
        int ost = apple % student;

        String fraze1 = applePad(apple);
        String fraze2 = studPad(student);
        String fraze3 = applePad2(chas);
        String fraze4 = applePad(ost);
        String e = "Если ";
        String s = " ";
        String p = " поделить на ";
        String t = ", то каждый ученик получит по ";
        String i = " и ";
        String d = " достанется преподавателю.";

        System.out.println(e + apple + s + fraze1 + p + student + s + fraze2 + t + chas + s + fraze3 + i + ost + s
                + fraze4 + d);
    }

    public static void main(String[] args) {
        int apple = 4;
        int student = 2;
        if (apple < 0 || student < 0) {
            System.out.println("неверное значение");
        } else {
            fraze(apple, student);
        }

    }
}
