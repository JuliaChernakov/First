package lessons.lesson1to7;

public class LessonMethods {

    // methods
    // method signature (обозначение метода)
    // arrays

    // переменная для всех методов
    public static int n2 = 1;

    // вычисления - снаружи метода main, в main только ссылка
    public static void sumOfTwo (int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    // можно делать методы с одинаковым названием, но разными данными
    public static void m() {
        System.out.println("Hello");
    }

    public static void m(int x) {
        System.out.println(x);
    }

    public static void m(String x) {
        System.out.println(x);
    }

    public static void m(char x) {
        System.out.println(x);
    }

    // номер задания - способ 1
    public static void printTask1(int n1) {
        System.out.println("Task " + n1);
    }

    // номер задания - способ 2
    public static void printTask2() {
        System.out.println("Task " + n2);
        n2++;
    }
    public static void main(String[] args) {

        sumOfTwo(2, 3);
        sumOfTwo(1, 5);

        m(1);
        m();
        m("My dear");
        m("friend");

        int n1=1;
        printTask1(n1++);
        printTask1(n1++);
        printTask1(n1++);
        printTask1(n1++);
        printTask1(n1++);
        printTask1(n1++);

        printTask2();
        printTask2();
        printTask2();
        printTask2();
        printTask2();
        printTask2();

    }
}
