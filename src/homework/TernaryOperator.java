package homework;

public class TernaryOperator {

    public static boolean findBig(int a, int b) {

        return a >= b;
    }

    public static String whatIsBigger (int a, int b){

        return a > b ? "a bigger than b" : "b bigger than a";
    }

//    statement ? "answer 1" : "answer 2"

    public static void main(String[] args) {
        System.out.println(findBig(5, 5));
        System.out.println(whatIsBigger(5, 6));
    }
}
