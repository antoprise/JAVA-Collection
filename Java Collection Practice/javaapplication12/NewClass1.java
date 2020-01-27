package javaapplication12;

import java.util.Scanner;

public class NewClass1 {

    public static void main(String[] args) {
//        int i;
//        for (i = 0; i < 100; i=i+2) {
//            System.out.println("Welcom to JAVA!"+i);            
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number :");
        int number = input.nextInt();
        //        mulTable(number);
        System.out.println(factorial(number));
//        int a;
        //     for (a = 1; a <= 12; a++) {
        //        int koon = number * a;
        //        System.out.println(number + "x" + a + "=" + koon);
    }

    public static void mulTable(int input1) {
        int a = 1;
        for (a = 1; a <= 12; a++) {
            int koon = input1 * a;
            System.out.println(input1 + "x" + a + "=" + koon);

        }
    }

    public static int factorial(int num) {
        int a = 1;
//        for (int b = 1; b >= num; a++) {
//            a= a*b;
        if (num < 0) {
            a = -1;
        } else {
            for (int b = num; b > 0; b--) {
                a = a * b;
            }
        }
        return a;
    }

}
