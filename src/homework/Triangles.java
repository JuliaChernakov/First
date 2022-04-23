package homework;

public class Triangles {

    public static void main(String[] args) {
        String line = "----------------------------------";
        int i, j, k;
        for (i = 0; i < 10; i++) {
            for (j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        System.out.println(line);
        for (i = 0; i < 10; i++) {
            for (k = i; k <= 10; k++) {
                System.out.print(" ");
            }
            for (j = i; j >= 0; j--) {
               System.out.print(j + " ");
            }
            System.out.println("");
        }
        System.out.println(line);
        for (i = 0; i < 10; i++) {
            for (k = i; k <= 10; k++) {
                System.out.print("  ");
            }
            for (j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        System.out.println(line);
        for (i = 9; i >= 0; i--) {
            for (j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        System.out.println(line);
        for (i = 9; i >= 0; i--) {
            for (k = 0; k <= 9 - i; k++) {
                System.out.print(" ");
            }
            for (j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        System.out.println(line);
        for (i = 9; i >= 0; i--) {
            for (k = 0; k <= 9 - i; k++) {
                System.out.print("  ");
            }
            for (j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        System.out.println(line);
        for (i = 9; i >= 0; i--) {
            for (j = 9; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        System.out.println(line);
        for (i = 9; i >= 0; i--) {
            for (k = 9; k >= 9 - i; k--) {
                System.out.print(" ");
            }
            for (j = 9; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        System.out.println(line);
        for (i = 9; i >= 0; i--) {
            for (k = 9; k >= 9 - i; k--) {
                System.out.print("  ");
            }
            for (j = 9; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        System.out.println(line);
        for (i = 9; i >= 0; i--) {
            for (j = 9 - i; j <= 9; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }








    }
}
