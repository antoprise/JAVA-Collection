package javaapplication9;

import java.util.Scanner;

public class NewClass1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integers: ");
        int number = input.nextInt();

        if (number % 5 == 0) {
            System.out.println(number);
            System.out.println("Hi-five");
        }
        if (number % 2 == 0) {
            System.out.println("Hi-Even");
        } else {
            System.out.println("Hi-Odd");
        }

    }
}
