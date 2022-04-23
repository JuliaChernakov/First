package lessons.lesson1to7;

public class Lesson2 {

    public static void main(String[] args) {

        String line = "_______________";
        int a = +5;
        int b = 13;
        int c = 113;
        int d = -5;
        int sumAB = a + b;
        int sumABC = a + b + c;
        int subBA = b - a;
        int multAB = a * b;
        int divBA = b / a;
        int divAB = a / b;
        int ostBA = b / a;
        int ostAB = a / b;

        // конкатенация
        System.out.println("a =   " + a);
        System.out.println("b =  " + b);
        System.out.println("c = " + c);

        // арифметическое сложение
        System.out.println("сумма переменных a и b = " + (a + b));
        System.out.println("сумма переменных a и b = " + sumAB);
        System.out.println(a + b);
        System.out.println(sumAB);
        System.out.println(sumABC);

        // до "" - арифметика, после - конкатенация
        System.out.println(line);
        System.out.println(a + b + " " + a + b);
        System.out.println(line);
        System.out.println("Он сказал \"поехали\" и махнул рукой");

        // escape symbols
        System.out.println("Сегодня\nсуббота"); //новая строка
        System.out.println("Сегодня\t\tсуббота"); //табуляция (4 символа)


        // конкатенация
        System.out.println(""+ a + b + c);
        System.out.println(a + " " + b + " " + c);

        System.out.print(a);
        System.out.print(b);
        System.out.println(c);

        // конкатенация
        System.out.print("Сегодня ");
        System.out.println("суббота");

        // арифметическое вычитание
        System.out.println(b - a);
        System.out.println(subBA);
        System.out.println(d);
        System.out.println(a - d);
        System.out.println(a + d);

        // умножение
        System.out.println(5 * 13);
        System.out.println(a * b);
        System.out.println(multAB);

        // деление
        System.out.println(b / a);
        System.out.println(divBA);
        System.out.println(a / b);
        System.out.println(divAB);

        // остаток от деления
        System.out.println(b % a);
        System.out.println(ostBA);
        System.out.println(a % b);
        System.out.println(ostAB);

        // Покажите что 25 кратно 5
        System.out.println(25 % 5);

        // Покажите что 100 не кратно 3
        System.out.println(100 % 3);

        // унарные операторы
        a++;
        System.out.println(a);
        System.out.println(a+1);
        // так не сработает! System.out.println(a++);

        b--;
        System.out.println(b);
        System.out.println(b-1);
    }
}
