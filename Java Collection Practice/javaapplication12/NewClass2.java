package javaapplication12;

public class NewClass2 {

    public static void main(String[] args) {
        System.out.println("Multiplication Table");
        System.out.print("  ");
        for (int j = 1; j <= 12; j++) {
            System.out.printf("%4d", j);
        }
        System.out.println("\n----------------------------------------------------");

        for (int i = 1; i <= 12; i++) {
            System.out.print(i + "|");

            for (int a = 1; a <= 12; a++) {
                System.out.printf("%4d", a*i);

            }
            System.out.println();
        }
    }
}
