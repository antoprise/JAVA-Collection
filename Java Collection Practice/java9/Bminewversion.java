package javaapplication9;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Bminewversion {

    public static void main(String[] args) {

        double weight, height, bmi;
        Scanner input = new Scanner(System.in);
        DecimalFormat numFormat = new DecimalFormat("0.####");

        System.out.println("This is a Body Mass Index(BMI) calculator");

        System.out.print("Input your weight in kg: ");
        weight = input.nextDouble();

        System.out.print("Input your height in cm: ");
        height = input.nextDouble();
        bmi = bmiCal(weight, height);

        System.out.println("Your BMI = " + numFormat.format(bmi));

        String message = bmiMessage(bmi);

//        if (bmi < 18.5) {
//            message = "Underweight";
//        } else if (bmi < 25) {
//            message = "Normal weight";
//        } else if (bmi < 30) {
//            message = "Over weight";
//        } else {
//            message = "Obese";
//        }
        System.out.println(message);
    }

    public static double bmiCal(double weight, double height) {
        height = height / 100;
        return weight / (height * height);
    }

    public static String bmiMessage(double bmi) {
        String message;

        if (bmi < 18.5) {
            message = "Underweight";
        } else if (bmi < 25) {
            message = "Normal weight";
        } else if (bmi < 30) {
            message = "Over weight";
        } else {
            message = "Obese";
        }
       return message;
    }
       
    
}