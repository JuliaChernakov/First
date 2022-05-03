package lessons.String.Char;

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

        String strA = "a"; // char 'a' и String "a" это совсем разные вещи!



        System.out.println(str1 + space + str2 + space + str3); //это только печать, нет новой переменной
        String str4 = str1 + space + str2 + space + str3;
        System.out.println(str4); //создание новой переменной

        System.out.println(str4.charAt(0));
        System.out.println(str4.charAt(4)); // пробел

        for (int i = 0; i < 5; i++) { //первые 5 символов вместе с пробелом
            System.out.println(str4.charAt(i));
        }

        for (int i = 0; i < str4.length(); i++) {
            if (str4.charAt(i) == 'a') { //то же самое что array(i)
                System.out.println(str4.charAt(i));
            } else {
                System.out.println("not a");
            }
        }






    }
}
