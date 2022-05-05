package homework;

public class HW10 {

// Написать алгоритм CapitalizeWords, который принимает на вход предложение с единичным пробелом
// между словами, и возвращает предложение, в котором все слова написаны с большой буквы
// "        happy birthday!  " --> "Happy Birthday!"
// "     john jacob smith jr." --> "John Jacob Smith Jr."

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

    public static void main(String[] args) {

        System.out.println(capitalizeWords("        happy birthday!  "));
        System.out.println(capitalizeWords(""));
        System.out.println(capitalizeWords(" "));
        System.out.println(capitalizeWords(null));
        System.out.println(capitalizeWords("     john jacob smith jr."));
    }


//    Написать метод, который принимает на вход строку.
//    Если строка не пустая (проверить методом из видео), то примените метод
//    по удалению пробелов в начале строки и в конце строки.
//    Догадаться, каким методом из видео можно проверить, были ли пробелы.
//    Если пробелы были, то метод должен вернуть сообщение: “Лишние пробелы удалены”.
//    Если пробелов не было, вернуть сообщение “Пробелов не было”.
//    Если строка пустая, вернуть сообщение “Строка пустая”.


}
