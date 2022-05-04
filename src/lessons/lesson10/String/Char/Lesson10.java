package lessons.lesson10.String.Char;

import java.util.Arrays;
import java.util.Locale;

import static lessons.Utils.*;

public class Lesson10 {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "is";
        String str3 = "fun";
        String space = " ";

        char a = 'a';
        Character aa = 'a';
        Character bb = new Character('a');
        System.out.println(a == aa); //true
        System.out.println(aa == bb); //false
        System.out.println(aa.equals(bb)); // true
        line();

        String strA = "a"; // char 'a' и String "a" это совсем разные вещи!

        System.out.println(str1 + space + str2 + space + str3); //это только печать, нет новой переменной
        String str4 = str1 + space + str2 + space + str3;
        System.out.println(str4); //создание новой переменной
        line();

        System.out.print(str4.charAt(0)); // J
        System.out.print(str4.charAt(4)); // пробел
        System.out.println();

        for (int i = 0; i < 5; i++) { //первые 5 символов вместе с пробелом
            System.out.print(str4.charAt(i) + " ");
        }
        System.out.println();
        line();

        for (int i = 0; i < str4.length(); i++) {
            if (str4.charAt(i) == 'a') { //то же самое что array(i)
                System.out.print(i + " " + str4.charAt(i));
            } else {
                System.out.print("not a");
            }
            System.out.print(", ");
        }
        System.out.println();
        line();

        for (int i = 0; i < str4.length(); i++) {
            if (str4.charAt(i) >= 'i') {
                System.out.print(str4.charAt(i) + ", ");
            } else {
                System.out.print("< i, ");
            }
        }
        System.out.println();
        line();

        System.out.println('i'); // получим букву
        System.out.println('i' + 1); // из-за арифметического действия получим численное значение (ASCII)
        System.out.println(Character.toString('i' + 1)); // получим  букву
        line();

        // переводим строку в массив

        char[] arrayChar = new char[str4.length()];
        String[] arrayString = new String[str4.length()];

        for (int i = 0; i < str4.length(); i++) {
            arrayString[i] = Character.toString(str4.charAt(i)); // делаем массив String, каждый элемент - буква
            arrayChar[i] = str4.charAt(i); // делаем массив char, каждый элемент - буква
        }
        char[] charFromString1 = str4.toCharArray(); // char с помощью метода

        System.out.println(Arrays.toString(arrayString));
        System.out.println(arrayChar); // распечатывается как строка
        System.out.println(Arrays.toString(charFromString1)); // видно что это массив
        line();

        System.out.println(arrayString[0].equals(arrayChar[0])); // false потому что разный формат данных
        System.out.println(arrayString[0].equals(Character.toString(arrayChar[0]))); // true
        // метод CompareTo выдает 0, если значения равны, -1 и 1 если меньше или больше
        System.out.println(arrayString[0].compareTo(Character.toString(arrayChar[0]))); // 0
        line();

        String strLow = str4.toLowerCase(); // принято все переводить в строчные буквы
        System.out.println(strLow);
        String strUp = str4.toUpperCase();
        System.out.println(strUp);
        System.out.println(strUp.compareToIgnoreCase(strLow)); // 0 (то есть они равны)






    }
}
