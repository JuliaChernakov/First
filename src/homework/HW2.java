package homework;

public class HW2 {

    public static void main(String[] args) {

        int k, l, m;
        int apple, student;
        String line = "---------------------";

        k = 5;
        l = 10;
        m = 15;

        /** Test 12  */
        System.out.println("Test 12");
        System.out.println(k + "\n" + l + "\n" + m);
        System.out.println(line);

        /** Test 13 */
        System.out.println("Test 13");
        System.out.println(k + "\t" + l + "\t" + m);
        System.out.println(k + " " + l + " " + m);
        System.out.println(line);

        /** Test 14 */
        System.out.println("Test 14");
        System.out.println(k + ", " + l + ", " + m);
        System.out.println(line);

        /** Test 15 */
        System.out.println("Test 15");
        System.out.println("k = " + k + ", l = " + l + ", m = " + m);
        System.out.println(line);

        /** Test 16 */
        System.out.println("Test 16");
        System.out.println("Sum of k and l = " + (k + l));
        System.out.println("k * m = " + (k * l));
        System.out.println("Разность переменных l и m = " + (l - m));
        System.out.println(line);

        /** Test 17 */

        String res = "Результат деления ";
        String ost = ", а остаток от деления = ";

        System.out.println("Test 17");
        System.out.println(res + "k на l = " + k / l + ost + k % l);
        System.out.println(res + "k на m = " + k / m + ost + k % m);
        System.out.println(res + "l на k = " + l / k + ost + l % k);
        System.out.println(res + "l на m = " + l / m + ost + l % m);
        System.out.println(res + "m на k = " + m / k + ost + m % k);
        System.out.println(res + "m на l = " + m / l + ost + m % l);
        System.out.println(line);

        /** Test 18 */
        System.out.println("Test 18");

        apple = 40;
        student = 6;

        System.out.println("Если " + apple + " яблок поделить на " + student
                + " учеников, то каждый ученик получит по " + apple / student + " яблок(а), и " + apple % student
                + " яблок(а) достанется учителю.");

        apple = 100;
        student = 21;

        System.out.println("Если " + apple + " яблок поделить на " + student
                + " учеников, то каждый ученик получит по " + apple / student + " яблок(а), и " + apple % student
                + " яблок(а) достанется учителю.");
        System.out.println(line);

        /** Test 19 */
        System.out.println("Test 19");

        int sumKLM, sumKLM0, sumKLMPlusPlus, sumKLMMinusMinus;

        sumKLM = k + l + m;
        sumKLM0 = k + l + m;
        m++;
        sumKLMPlusPlus = k + l + m;
        sumKLM--;
        sumKLMMinusMinus = sumKLM;

        System.out.println("Сумма чисел k, l, m++ = " + sumKLMPlusPlus);
        System.out.println("sumKLM-- = " + sumKLMMinusMinus);
        System.out.println("сумма чисел k, l, m++ и sumKLM-- = " + (sumKLMPlusPlus + sumKLMMinusMinus));
//        System.out.println("m++ = " + m);
//        System.out.println("sumKLM = " + sumKLM0);
        System.out.println(", а разность m++ и sumKLM = " + (m - sumKLM0));
        System.out.println(line);

        /** Test 20 */
        System.out.println("Test 20");
        System.out.println("Число 48 кратно 8 потому что остаток от деления 48 на 8 = " + (48 % 8));
        System.out.println("Числа 48 и 8 четные потому что остаток от деления 48 на 2 = " + (48 % 2)
                + " и остаток от деления 8 на 2 = " + (8 % 2));
        System.out.println("Числа 47 и 49 нечетные потому что остаток от деления 47 на 2 = " + (47 % 2)
                + " и остаток от деления 49 на 2 = " + (49 % 2));
        System.out.println(line);

        /** Test 21,22,23 */
        System.out.println("\u001B[32m"+ "Test 21,22,23" + "\u001B[0m");

        int x, y, a, b, c, d;
        int result21, result22, result23;

        k=5;
        l=10;
        m=15;
        x = 2;
        y = 3;
        a = k;
        b = l;
        c = m;
        d = y - x;

        System.out.println("\u001B[31m"+ "(x + 3)\u00b2" + "\u001B[0m");

        result21 = (x+3)*(x+3);
        System.out.println(line);
        System.out.println("| task |\tresult\t|");
        System.out.println(line);
        System.out.println("|\t21 |\t " + result21 + "\t\t|");
        System.out.println(line);

        result22 = ((3+4*x)/5)-((10*(y-5)*(a+b+c))/x)+(9*((4/x)+((9+x)/y)));
        System.out.println("|\t22 |\t" + result22 + "\t\t|");
        System.out.println(line);

        result23 = ((((5*x+7*y)/(8*x+10*y))/((3*x-y)/(x+y)))/((a+b)+(c/d)+((a+b)/(c+d))+(a*b)));
        System.out.println("|\t23 |\t  " + result23 + "\t|");
        System.out.println(line);
    }
}
