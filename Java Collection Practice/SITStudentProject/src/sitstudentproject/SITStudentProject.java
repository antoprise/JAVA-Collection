package sitstudentproject;

import java.util.Scanner;

public class SITStudentProject {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long stdID = 1111;
        String fName = "Pragit", sName = "Goodman";
        double weight = 60, height = 170;

//        System.out.print("Your student id =  ");
//        stdID=input.nextLong();        
//        System.out.print("What is your name? ");
//        fName=input.next();
//        System.out.print("What is your surname? ");
//        sName=input.next();
//        System.out.print("Input your weight: ");
//        weight=input.nextDouble();
//        System.out.print("Input your height: ");
//        height=input.nextDouble();
        Student std = new Student(stdID, fName, sName, weight, height);
//        System.out.println(std.toString());
        System.out.println(std.getfName());
        System.out.println(std.getsName());
        System.out.println(std.getWeight());

        double bmi;
        bmi = bmiCal(std.getWeight(), std.getHeight());
        System.out.println(bmiHongKong(bmi));
        System.out.println(std.signature());
        System.out.println(std.getEmail());

        Student std2 = new Student(444444, "AAAAAA", "BBBBB", 65, 170);
        System.out.println(std2.getEmail());
    }

    public static double bmiCal(double w, double h) {
        h = h / 100; // convert cm to m
        return w / (h * h);
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
