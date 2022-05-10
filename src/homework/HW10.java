package homework;

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

    public static String removeAlla(String string) {
        if (!string.isEmpty()) {
            string = string.trim();
            string = string.replace("a", "");

            return string;
        }

        return string;
    }

    public static String removeAllZeros(String string) {
        if (!string.isEmpty()) {
            string = string.replace(" ", "");
            string = string.replace("0", "");
        }

        return string;
    }

    public static String removeAllSpaces(String string) {
        if (!string.isEmpty()) {
            string = string.replace(" ", "");
        }

        return string;
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
//        Написать метод, который принимает на вход строку.
//        Если строка не пустая (проверить методом из видео), то примените метод
//        по удалению пробелов в начале строки и в конце строки.
//        Догадаться, каким методом из видео можно проверить, были ли пробелы.
//        Если пробелы были, то метод должен вернуть сообщение: “Лишние пробелы удалены”.
//        Если пробелов не было, вернуть сообщение “Пробелов не было”.
//        Если строка пустая, вернуть сообщение “Строка пустая”.
//        “   QA4Everyone   “ → “Лишние пробелы удалены”
//        “QA4Everyone“ → “Пробелов не было”
//        “” → “Строка пустая”

        printTask();
        System.out.println(checkSpaces("   QA4Everyone   "));
        System.out.println(checkSpaces("QA4Everyone"));
        System.out.println(checkSpaces(""));
        line();

        /** Task 2 */
//        Написать алгоритм RemoveAlla.
//        С помощью методов из видео1, написать алгоритм, который принимает на вход строку.
//        Если строка валидная, то метод удаляет все буквы a из строки, если таковые имеются.
//        Метод возвращает обработанную строку.
//        “    QA4Everyone   “ →  “QA4Everyone“
//        “panda   “ → “pnd”

        printTask();
        System.out.println(removeAlla("    QA4Everyone   "));
        System.out.println(removeAlla("panda   "));
        line();

        /** Task 3 */
//        Написать алгоритм RemoveAllZeros.
//        С помощью методов из видео1, написать алгоритм, который принимает на вход строку,
//        состоящую из цифр. Если строка валидная, то метод удаляет все пробелы из строки,
//        если таковые имеются. Метод возвращает обработанную строку, в которой нет нулей.
//        “   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 “ →  “35429764“
//        “ 0000000111“ → “111”

        printTask();
        System.out.println(removeAllZeros("   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 "));
        System.out.println(removeAllZeros(" 0000000111"));
        line();

        /** Task 4 */
//        Написать алгоритм RemoveAllSpaces.
//        С помощью методов из видео1, написать алгоритм, который принимает на вход строку.
//        Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
//        Метод возвращает обработанную строку.
//        “    QA   4  Everyone   “ →  “QA4Everyone“
//        “p a     n d a   “ → “panda”

        printTask();
        System.out.println(removeAllSpaces("    QA   4  Everyone   "));
        System.out.println(removeAllSpaces("p a     n d a   "));
        line();

        /** Task 5 */

        printTask();








    }
}
