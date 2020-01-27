
package javaapplication7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        
        double weight, height, bmi;
        Scanner input = new Scanner(System.in);
        DecimalFormat fmt=new DecimalFormat ("0.####");
        
        System.out.println("This is a Body Mass Index(BMI) calculator");
        System.out.print("Input your weight in kg: ");
        weight = input.nextDouble();
        System.out.print("Input your height in cm: ");
        height = input.nextDouble() / 100;
        bmi = weight / (height * height);
        System.out.println("Your BMI = " + fmt.format(bmi));
    
    }
    
}
