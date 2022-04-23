package lessons.lesson8;

//import static lessons.Utils.line; // способ 2
//import static lessons.Utils.line2;

import static lessons.Utils.*; // способ 3


public class Lesson8 {


    public static void main(String[] args) {

        int[] array = new int[] {1, 2, 3};
        int[] array1 = new int[3]; // создался массив длиной 3
        int[] array2 = {1, 2, 3}; //new int[] - подразумевается, просто его не видно
        int[] array3 = {}; // создался массив длиной 0

        Integer intReg = 4; //"new Integer" - подразумевается, просто его не видно
        Integer intReg1 = 4;
        Double doubleReg = 5.5; //"new Double" - подразумевается, просто его не видно

        Integer intObject = new Integer(4);
        Double doubleObject = new Double(5.5);

        String cat1 = "Cat"; //"new String" подразумевается, просто его не видно
        String cat2 = "Cat"; //а здесь нет "new String", здесь копируется ссылка
                                  // на ячейку памяти из предыдущей строки

        String catObject = new String("Cat"); // создается новый объект

        System.out.println(intReg == intReg1); //true
        System.out.println(intReg == intObject); //false
        System.out.println(doubleReg == doubleObject); //false

        System.out.println(cat1 == cat2); //true
        System.out.println(cat1 == catObject); //сравниваются ссылки на объект -> false
        System.out.println(cat1.equals(catObject)); //сравниваются значения -> true
        System.out.println(intReg.equals(intObject)); //true
        System.out.println(intReg.equals(intReg1)); //референсные типы всегда сравнивать так

//        lessons.Utils.line(); // способ 1
//        lessons.Utils.line2();

        line();
        longline();

        System.out.println(verify(cat1, cat2)); //референсные значения сравниваются через .equals,
                                                // т.е. через метод, написанный для "String" (класс Utils)



    }
}
