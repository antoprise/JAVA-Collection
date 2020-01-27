package javaapplication13;

import java.util.Scanner;

public class JavaApplication13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int key;

        String menu = "Select 1.for deposit,2.for withdraw,0.for exit";
        System.out.println(menu);

        do {
            System.out.print("Select funtion:");
            key = input.nextInt();
            switch (key) {
                case 1:
                    System.out.print("Enter money for deposit:");
                    int choose1 = input.nextInt();
                    System.out.print("Total money:" + choose1);
                case 2:
                    System.out.print("Enter money for withdraw:");
                    int choose2 = input.nextInt();

                    System.out.println("Total money:");

            }
        } while (key != 0);
        System.out.println("Goodbye !");

    }

    public static double deposit(double depMoney, double TotalMoney) {
        System.out.println("Enter money for deposit:");
        return 0;

    }
}
