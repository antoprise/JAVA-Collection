package javaapplication39;

import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        System.out.println("This is BMI");
        Scanner input = new Scanner(System.in);
        double weight, height;
        String answer, national;

        do {
            System.out.println("Insert your national : ");
            national = input.next();
            
                System.out.print("Input your weight :");
                weight = input.nextDouble();
                System.out.print("Input your height :");
                height = input.nextDouble() / 100;

                double bmi = bmi(weight, height);
                if (national.equalsIgnoreCase("hongkong")) {
                    System.out.println("Hongkong : " + bmiHongKong(bmi)); // ฮ่องกง
                } else {
                    System.out.println("General : " + bmiToString(bmi)); // ระดับโลก
                }

                System.out.print("Do you want use again (y/n) :");
                answer = input.next();
            }
            while (answer.equalsIgnoreCase("y"));
            System.out.println("Good bye !!!");

        }

    public static double bmi(double w, double h) {
        double bmi;
        bmi = w / (Math.pow(h, 2));
        return bmi;
    }

    public static String bmiToString(double bmi) {
        String str = "";
        if (bmi <= 15) {
            str = "Very severely underweight";
        } else if (bmi <= 16) {
            str = "Severely underweight";
        } else if (bmi <= 18.5) {
            str = "Underweight";
        } else if (bmi <= 25) {
            str = "Normal (healthy weight)";
        } else if (bmi <= 30) {
            str = "Overweight";
        } else if (bmi <= 35) {
            str = "Obese Class I (Moderately obese)";
        } else if (bmi <= 40) {
            str = "Obese Class II (Severely obese)";
        } else if (bmi > 40) {
            str = "Obese Class III (Very severely obese)";
        }
        return str;
    }

    public static String bmiHongKong(double bmi) {
        String message;
        if (bmi < 18.5) {
            message = "Underweight";
        } else if (bmi < 23) {
            message = "Normal Range";
        } else if (bmi < 25) {
            message = "Overweight - At Risk";
        } else if (bmi < 30) {
            message = "Overweight - Moderately Obese";
        } else {
            message = "Obese - Serverely Obese";
        }
        return message;
    }
}
