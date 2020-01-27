package javaapplication15;

import java.util.Scanner;

public class JavaApplication15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lotto;
        int bot = (int) (Math.random() * 100000);

        System.out.print("Enter lotto");
        lotto = input.nextInt();
    }
}

