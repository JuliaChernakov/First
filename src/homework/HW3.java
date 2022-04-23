package homework;

public class HW3 {

    public static void main(String[] args) {

        String line = "--------------------------";

        /** Task 2 */
        System.out.println("Task 2");

        byte a, b;
        a = 1;
        b = -1;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println(line);

        /** Task 3 */
        System.out.println("Task 3");

        short s, t;

        s = -31000;

        System.out.println(line);

        /** Task 4 */
        System.out.println("Task 4");

        String line1 = "_____________________________";
        int i;

        i = Integer.MIN_VALUE;
        System.out.println(line1);
        System.out.println("| int min\t|\t" + i + "\t|");
        System.out.println(line1);

        i = Integer.MAX_VALUE;
        System.out.println("| int min\t|\t" + i + "\t|");
        System.out.println(line1);

        System.out.println(line);

        /** Task 5 */
        System.out.println("Task 5");

        long phoneNumber;
        phoneNumber = +79519057600L;
        System.out.println("Phone Number: +" + phoneNumber);
        System.out.println(line);

        /** Task 6 */
        System.out.println("Task 6 and 7");

        float f;
        f = 100.101101F;
        double d;
        d = 100.101101;
        String line2 = "_________________________________________";

        System.out.println(line2);
        System.out.println("|float f = 100.101101\t|\t" + f + "\t|");
        System.out.println(line2);
        System.out.println("|double d = 100.101101\t|\t" + d + "\t|");
        System.out.println(line2);

        /** Task 7 */

        Double dd;
        dd = 10.09999 + 20.099999;
        Float ff;
        ff = 10.09999F + 20.099999F;

        System.out.println("|Double dd = 30.199989\t|\t" + dd + "\t|");
        System.out.println(line2);
        System.out.println("|Float ff = 30.199989\t|\t" + ff + "\t|");
        System.out.println(line2);

        System.out.println(line);

        /** Task 8 */
        System.out.println("Task 8");

        Double result;
        result = 10/3d;
        System.out.println(result);

        System.out.println(line);

        /** Task 9 */
        System.out.println("Task 9");

        Double sum, product, quotient, remainder;
        sum = f + d;
        product = f * d;
        quotient = f / d;
        remainder = f % d;
        System.out.println("Сумма f и d = " + sum);
        System.out.println("Произведение f и d = " + product);
        System.out.println("Частное от деления f на d = " + quotient);
        System.out.println("Остаток от деления f на d = " + remainder);

        System.out.println(line);

        /** Task 10 */
        System.out.println("Task 10");

        System.out.println("..  ..  ......  ..      ..       ....");
        System.out.println("..  ..  ..      ..      ..      ..  ..");
        System.out.println("......  ......  ..      ..      ..  ..");
        System.out.println("..  ..  ..      ..      ..      ..  ..");
        System.out.println("..  ..  ......  ......  ......   ....");

        System.out.println("");

        String sym = "♡"; //★ ♡ ♥
        String n2 = sym + sym;
        String p2 = "  ";
        String p4 = "    ";
        String o = " " + sym + sym + sym + sym;
        String n6 = sym + sym + sym + sym + sym + sym;

        System.out.println(n2 + p2 + n2 + p2 + n6 + p2 + n2 + p4 + p2 + n2 + p4 + p2 + o +"\n"
                + n2 + p2 + n2 + p2 + n2 + p4 + p2 + n2 + p4 + p2 + n2 + p4 + p2 + n2 + p2 + n2 +"\n"
                + n6 + p2 + n6 + p2 + n2 + p4 + p2 + n2 + p4 + p2 + n2 + p2 + n2 +"\n"
                + n2 + p2 + n2 + p2 + n2 + p4 + p2 + n2 + p4 + p2 + n2 + p4 + p2 + n2 + p2 + n2 +"\n"
                + n2 + p2 + n2 + p2 + n6 + p2 + n6 + p2 + n6 + p2 + o);

        System.out.println(line);

        /** Task 11 */
        System.out.println("Task 11");

        Byte t1 = 0;
        Short t2 = 150;
        Byte t3 = -120;
        Float t4 = - 505.505F;
        Integer t5 = 100100;
        Long t6 = 100010001000L;
        Double t7 = 2.66666666666666;
        Double t8 = - 1000000.001;
        Short t9 = 1010;
        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println("t3 = " + t3);
        System.out.println("t4 = " + t4);
        System.out.println("t5 = " + t5);
        System.out.println("t6 = " + t6);
        System.out.println("t7 = " + t7);
        System.out.println("t8 = " + t8);
        System.out.println("t9 = " + t9);

        System.out.println(line);

        /** Task 12 */
        System.out.println("Task 12");

        String line3 = "_________________________________________________________________________";

        System.out.println(line3);
        System.out.println("| Type\t| Size in bits\t|\t\t\tmin\t\t\t|\t\t\tmax\t\t\t|");
        System.out.println(line3);
        System.out.println("| bite\t| " + Byte.SIZE + "\t\t\t\t| " + Byte.MIN_VALUE + "\t\t\t\t\t| " + Byte.MAX_VALUE
                + "\t\t\t\t\t|");
        System.out.println(line3);
        System.out.println("| short\t| " + Short.SIZE + "\t\t\t| " + Short.MIN_VALUE + "\t\t\t\t| " + Short.MAX_VALUE
                + "\t\t\t\t\t|");
        System.out.println(line3);
        System.out.println("| int\t| " + Integer.SIZE + "\t\t\t| " + Integer.MIN_VALUE + "\t\t\t| " + Integer.MAX_VALUE
                + "\t\t\t|");
        System.out.println(line3);
        System.out.println("| long\t| " + Long.SIZE + "\t\t\t| " + Long.MIN_VALUE + "\t| " + Long.MAX_VALUE + "\t|");
        System.out.println(line3);
        System.out.println("| float\t| " + Float.SIZE + "\t\t\t| " + Float.MIN_VALUE + "\t\t\t\t| " + Float.MAX_VALUE
                + "\t\t\t|");
        System.out.println(line3);
        System.out.println("| double| " + Double.SIZE + "\t\t\t| " + Double.MIN_VALUE + "\t\t\t\t| " + Double.MAX_VALUE
                + "|");
        System.out.println(line3);

        System.out.println(line);

        /** Task 13 */
        System.out.println("Task 13");

        Integer num1, num2;
        String Num1, Num2;
        boolean res;

        num1 = 10;
        num2 = 10;
        Num1 = num1.toString();
        Num2 = num2.toString();
        res = Num1.equals(Num2);
        System.out.println ("Если num1 = num2, то результат сравнения методом .equal = " + res);

        num2 = 20;
        Num1 = num1.toString();
        Num2 = num2.toString();
        res = Num1.equals(Num2);
        System.out.println ("Если num1 не равно num2, то результат сравнения методом .equal = " + res);

        System.out.println(line);

        /** Task 14 */
        System.out.println("Task 14");

        int number1, number2, com;

        number1 = 10;
        number2 = 10;
        com = Integer.compare(number1, number2);
        System.out.println("Если number1 = number2, то результат сравнения методом .compare = " + com);

        number2 = 20;
        com = Integer.compare(number1, number2);
        System.out.println("Если number1 = number2, то результат сравнения методом .compare = " + com);

        number2 = 5;
        com = Integer.compare(number1, number2);
        System.out.println("Если number1 = number2, то результат сравнения методом .compare = " + com);

        System.out.println(line);

        /** Task 15 */
        System.out.println("Task 15");

        Float per1;
        per1 = 234.9999F;
        System.out.println(per1.intValue());

        System.out.println(line);

        /** Task 16 */
        System.out.println("Task 16");

        Double per2, per3;
        per2 = 1.5;
        per3 = 2.5;
        System.out.println(Double.sum(per2,per3));

        System.out.println(line);

        /** Task 17 */
        System.out.println("Task 17");

        Float per4, per5;
        per4 = 1.5F;
        per5 = 2.5F;
        System.out.println(Integer.sum(per4.intValue(), per5.intValue()));

        System.out.println(line);

        /** Task 18 */
        System.out.println("Task 18");

        Short short1, short2;
        short1 = 12000;
        short2 = 12300;
        System.out.println("option 1: 12000 - 12300 = " + Short.compare(short1, short2));
        System.out.println("option 2: 12000 - 12300 = " + short1.compareTo(short2));

        short1 = 12500;
        System.out.println("12500 - 12300 = " + Short.compare(short1, short2));

        System.out.println(line);

        /** Task 19 */
        System.out.println("Task 19");

        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;
        System.out.println(doub1 - doub2);
        System.out.println(Double.sum(Double.parseDouble(str1), - Double.parseDouble(str2)));
        System.out.println(Double.sum(Double.valueOf(str1), - Double.valueOf(str2)));

        System.out.println(line);

        /** Task 20 */
        System.out.println("Task 20");

        double tempCat, tempCat1, avTempCat, avTempCatScale;

        tempCat = 41.5;
        tempCat = tempCat + 35.0;
        tempCat = tempCat / 2;
        tempCat = Math.round(tempCat);
        System.out.println("Среднее значение температуры тела кота = " + tempCat);

        tempCat = 41.5;
//        avTempCat = tempCat / 2;
//        tempCat = 35.0;
//        avTempCat = avTempCat + tempCat / 2;
        avTempCat = tempCat;
        tempCat = 35.0;
        avTempCat = (avTempCat + tempCat) / 2;
        avTempCat = Math.round(avTempCat);
        System.out.println("Среднее значение температуры тела кота = " + avTempCat);

        tempCat = 41.5;
        tempCat1 = tempCat;
        tempCat = 35.0;
        avTempCatScale = Math.round((tempCat + tempCat1) / 2 * 10);
        avTempCat = avTempCatScale / 10;
        System.out.println("Среднее значение температуры тела кота = " + avTempCat);

        System.out.println(line);

        /** Task 21 */
        System.out.println("Task 21");

        Number n;
        System.out.println("Переменная n может принимать значения:");
        n = Double.MAX_VALUE;
        System.out.println("n = " + n);
        n = 10;
        System.out.println("n = " + n);
        n = 10.999999999;
        System.out.println("n = " + n);
        System.out.println("Это возможно, потому что класс Number включает в себя все числовые классы.");

        System.out.println(line);

        /** Task 22 */
        System.out.println("Task 22");
        System.out.println("option 1");

        Integer numberInteger = 100;
        System.out.println("numberInteger имеет тип " + numberInteger.getClass());
        System.out.println("numberInteger.toString() имеет тип " + numberInteger.toString().getClass());

        System.out.println("");
        System.out.println("option 2");
        System.out.println("numberInteger имеет тип Integer - "
                + (numberInteger instanceof Integer));
        System.out.println("numberInteger.toString() имеет тип String - "
                + (numberInteger.toString() instanceof String));

        System.out.println(line);

        /** Task 23 */
        System.out.println("Task 23");

//        float tempC = 36.6F;
//        String Celcius = " градусов по Цельсию = ";
//        float tempF = tempC * 1.8F + 32F;
//        String Farenheit = " градусов по Фаренгейту";
//        System.out.println(tempC + Celcius + tempF + Farenheit);
//
//        float wKilo = 50F;
//        String kilo = " kilogram = ";
//        float wLbs = wKilo * 0.454F;
//        String lbs = " lbs";
//        System.out.println(wKilo + kilo + wLbs + lbs);
//
//        float wLb = 50F;
//        String lb = " lb = ";
//        float wKg = wLb * 2.2046F;
//        String kg = " kg";
//        System.out.println(wLb + lb + wKg + kg);

        double tempC = 36.6;
        String Celcius = " градусов по Цельсию = ";
        double tempF = tempC * 1.8 + 32;
        String Farenheit = " градусов по Фаренгейту";
        System.out.println(tempC + Celcius + tempF + Farenheit);

        double wKilo = 50;
        String kilo = " kilogram = ";
        double wLbs = wKilo * 2.2046;
        String lbs = " lbs";
        System.out.println(wKilo + kilo + wLbs + lbs);

        double wLb = 50;
        String lb = " lb = ";
        double wKg = wLb * 0.454;
        String kg = " kg";
        System.out.println(wLb + lb + wKg + kg);

        System.out.println(line);
    }
}
