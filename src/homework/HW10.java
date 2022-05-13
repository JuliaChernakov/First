package homework;

import java.util.Locale;

import static lessons.Utils.*;

public class HW10 {

    public static String capitalizeWords(String sentence) {
        if (sentence != null) {
            sentence = sentence.trim(); // убирает все пробелы вначале и в конце

            if (sentence.length() != 0) {  // null - плохо, length = 0 - нормально

//            charAt возвращает char. Его нужно перевести в String методом toString:
//            Character.toString(sentence.charAt(0)).toUpperCase();

//            substring возвращает String - удобнее
                sentence = sentence.substring(0, 1).toUpperCase() + sentence.substring(1);

                for (int i = 1; i < sentence.length(); i++) {
                    if (sentence.charAt(i) == ' ') {
                        sentence = sentence.substring(0, i + 1)
                                + sentence.substring(i + 1, i + 2).toUpperCase()
                                + sentence.substring(i + 2);
                    }
                }

                return sentence;
            }

            return "";
        }

        return "";
    }

    //        Написать метод, который принимает на вход строку.
//        Если строка не пустая (проверить методом из видео), то примените метод
//        по удалению пробелов в начале строки и в конце строки.
//        Догадаться, каким методом из видео можно проверить, были ли пробелы.
//        Если пробелы были, то метод должен вернуть сообщение: “Лишние пробелы удалены”.
//        Если пробелов не было, вернуть сообщение “Пробелов не было”.
//        Если строка пустая, вернуть сообщение “Строка пустая”.
    public static String checkSpaces(String string) {
        if (!string.isEmpty()) {
            int lengthBegin = string.length();
            string = string.trim();
            if (lengthBegin > string.length()) {

                return "Лишние пробелы удалены";
            } else if (lengthBegin == string.length()) {

                return "Пробелов не было";
            }
        }

        return "Строка пустая";
    }

    //        Написать алгоритм RemoveAlla.
//        С помощью методов из видео1, написать алгоритм, который принимает на вход строку.
//        Если строка валидная, то метод удаляет все буквы a из строки, если таковые имеются.
//        Метод возвращает обработанную строку.
    public static String removeAlla(String string) {
        if (!string.isEmpty()) {
            string = string.trim();
            string = string.replace("a", "");

            return string;
        }

        return string;
    }

    //        Написать алгоритм RemoveAllZeros.
//        С помощью методов из видео1, написать алгоритм, который принимает на вход строку,
//        состоящую из цифр. Если строка валидная, то метод удаляет все пробелы из строки,
//        если таковые имеются. Метод возвращает обработанную строку, в которой нет нулей.
    public static String removeAllZeros(String string) {
        if (!string.isEmpty()) {
            string = string.replace(" ", "");
            string = string.replace("0", "");
        }

        return string;
    }

    //        Написать алгоритм RemoveAllSpaces.
//        С помощью методов из видео1, написать алгоритм, который принимает на вход строку.
//        Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
//        Метод возвращает обработанную строку.
    public static String removeAllSpaces(String string) {
        if (!string.isEmpty()) {
            string = string.replace(" ", "");
        }

        return string;
    }

    //        Напишите метод, который принимает на вход строку и считает,
//        сколько букв а или А содержится в строке.
    public static int countAa(String string) {
        int numberA = 0;
        if (!string.isEmpty()) {
            int l = string.length();
            string = string.toLowerCase().replace("a", "");
            int l1 = string.length();
            numberA = l - l1;
        }

        return numberA;
    }

//    Напишите метод, который принимает на вход текст и проверяет,
//    содержится ли в тексте хотя бы одно слово Java.
    public static boolean findJava(String string) {
        if (!string.isEmpty()) {
            return string.contains("Java");
        }

        return false;
    }

//    Напишите метод, который принимает на вход строку, и добавляет Кавычки в начале строки,
//    точку и кавычки в конце строки с помощью метода concat()
    public static String addPunct(String string) {
        if (string != null) {
            String s = "\"";
            string = s.concat(string.trim().concat(".\""));

            return string;
        }

        return null;
    }

//    Напишите метод, кторый принимает на вход название города и исправляет написание
    public static String correctCity(String string) {
        if (!string.isEmpty()) {
            string = string.trim().toLowerCase();
            String first = string.substring(0, 1).toUpperCase();
            string = first.concat(string.substring(1));
        }

        return string;
    }

//    Напишите метод, который принимает на вход строку, и возвращает все,
//    что находится между первой и последней буквой-параметром:
    public static String between(String string, char i) {
        if (!string.isEmpty()) {
            int index1 = string.indexOf(i);
            int index2 = string.lastIndexOf(i);

            return string.substring(index1, index2 + 1);
        }

        return string;
    }

//    Напишите метод, который принимает на вход слово, и возвращает true,
//    если слово начинается и заканчивается на одинаковую букву, и false иначе
    public static boolean sameLetters (String string) {
        if (!string.isEmpty()) {
            string = string.trim().toLowerCase();
            return string.charAt(0) == string.charAt(string.length() - 1);
        }

        return false;
    }

//    Напишите метод, который принимает на вход предложение и возвращает
//    слова из этого предложения в виде массива слов
    public static String[] arrayWords (String string) {
        if (!string.isEmpty()) {

            return string.trim().split(" ");
        }

        return new String[0];
    }


    public static void main(String[] args) {

        /** Task 0 */
//       Написать алгоритм CapitalizeWords, который принимает на вход предложение с единичным пробелом
//       между словами, и возвращает предложение, в котором все слова написаны с большой буквы
//       "        happy birthday!  " --> "Happy Birthday!"
//       "     john jacob smith jr." --> "John Jacob Smith Jr."

        System.out.println(capitalizeWords("        happy birthday!  "));
        System.out.println(capitalizeWords(""));
        System.out.println(capitalizeWords(" "));
        System.out.println(capitalizeWords(null));
        System.out.println(capitalizeWords("     john jacob smith jr."));
        line();

        /** Task 1 */
//        “   QA4Everyone   “ → “Лишние пробелы удалены”
//        “QA4Everyone“ → “Пробелов не было”
//        “” → “Строка пустая”

        printTask();
        System.out.println(checkSpaces("   QA4Everyone   "));
        System.out.println(checkSpaces("QA4Everyone"));
        System.out.println(checkSpaces(""));
        line();

        /** Task 2 */
//        “    QA4Everyone   “ →  “QA4Everyone“
//        “panda   “ → “pnd”

        printTask();
        System.out.println(removeAlla("    QA4Everyone   "));
        System.out.println(removeAlla("panda   "));
        line();

        /** Task 3 */
//        “   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 “ →  “35429764“
//        “ 0000000111“ → “111”

        printTask();
        System.out.println(removeAllZeros("   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 "));
        System.out.println(removeAllZeros(" 0000000111"));
        line();

        /** Task 4 */
//        “    QA   4  Everyone   “ →  “QA4Everyone“
//        “p a     n d a   “ → “panda”

        printTask();
        System.out.println(removeAllSpaces("    QA   4  Everyone   "));
        System.out.println(removeAllSpaces("p a     n d a   "));
        line();

        /** Task 5 */
//        “Abracadabra” → 5
//        “Homenum Revelio” → 0

        printTask();
        System.out.println(countAa("Abracadabra"));
        System.out.println(countAa("Homenum Revelio"));
        line();

        /** Task 6 */
//        true
//        false

        printTask();
        System.out.println(findJava("As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are " +
                "the current long-term support (LTS) versions. Oracle released the last zero-cost public update for " +
                "the legacy version Java 8 LTS in January 2019 for commercial use, although it will otherwise still " +
                "support Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer " +
                "zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades."));
        System.out.println(findJava("As a decrepit father takes delight\n" +
                                    "To see his active child do deeds of youth,\n" +
                                    "So I, made lame by fortune’s dearest spite,\n" +
                                    "Take all my comfort of thy worth and truth.\n" +
                                    "For whether beauty, birth, or wealth, or wit,\n" +
                                    "Or any of these all, or all, or more,\n" +
                                    "Entitled in thy parts do crownèd sit,\n" +
                                    "I make my love engrafted to this store.\n" +
                                    "So then I am not lame, poor, nor despised,\n" +
                                    "Whilst that this shadow doth such substance give\n" +
                                    "That I in thy abundance am sufficed,\n" +
                                    "And by a part of all thy glory live.\n" +
                                    "Look what is best, that best I wish in thee.\n" +
                                    "This wish I have; then ten times happy me."));
        line();

        /** Task 7 */
//        “One” → ““One.””
//        “    TWO  “ → ““TWO.””

        printTask();
        System.out.println(addPunct("One"));
        System.out.println(addPunct("    TWO  "));
        line();

        /** Task 8 */
//        “ташкент” → “Ташкент”
//        “ЧикаГО” → “Чикаго”

        printTask();
        System.out.println(correctCity("ташкент"));
        System.out.println(correctCity("ЧикаГО"));
        line();

        /** Task 9 */
//        “Abracadabra”, “b” → “bracadab”
//        “Whippersnapper”, “p” → “ppersnapp”

        printTask();
        System.out.println(between("Abracadabra", 'b'));
        System.out.println(between("Whippersnapper", 'p'));
        line();

        /** Task 10 */
//        “Abracadabra” → true
//        “Whippersnapper” → false

        printTask();
        System.out.println(sameLetters("Abracadabra"));
        System.out.println(sameLetters("Whippersnapper"));
        line();

        /** Task 11 */
//        “QA for Everyone” → {“QA”, “for”, “Everyone”}
//        “Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”

        printTask();
        printArray(arrayWords("QA for Everyone"));
        System.out.println();
        printArray(arrayWords("Александр Сергеевич Пушкин"));
        System.out.println();
        line();

        /** Task 12 */

        printTask();










    }
}
