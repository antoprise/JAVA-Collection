package javaapplication10;

import java.util.Scanner;

public class JavaApplication10 {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String red, yellow, blue,color,color2;
//
//        System.out.print("Enter Color1: ");
//        color = input.next();
//
//        System.out.print("Enter Color2: ");
//        color2 = input.next();
//
//        if (red && yellow) {
//            System.out.println("Orange");
//        } else if (yellow && blue) {
//            System.out.println("Green");
//        } else if (blue && red) {
//            System.out.println("");
        System.out.println("Welcome to color system");
        Scanner color = new Scanner(System.in);

        System.out.println("Enter your color1");

        String color1 = color.next();

        System.out.println("Enter your color2");

        String color2 = color.next();

        //Chack color
        if (color1.equals("red") && color2.equals("yellow")) {
            System.out.println("orange");
        } else if (color1.equals("yellow") && color2.equals("blue")) {
            System.out.println("Green");
        } else if (color1.equals("blue") && color2.equals("red")) {
            System.out.println("purple");

        }

    }

}
