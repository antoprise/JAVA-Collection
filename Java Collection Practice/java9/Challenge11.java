
package javaapplication9;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Challenge11 {
    public static void main(String[] args) {
    
    String fName,sName;
    double weight,height,bmi;
    Scanner input = new Scanner(System.in);
    DecimalFormat fmt = new DecimalFormat("0.#####");
    
    System.out.println("-----This program will bw save your Basic Information-----");
    System.out.println("Please insert your Name: ");
    fName = input.next();
    System.out.print("Plase insert your Surname: ");
    sName = input.next();
    System.out.print("Your Email : "+fName+"."+sName.substring(0,2)+"@mail.kmutt.ac.th");
    
    
    
    System.out.println("Please input your BMI");
    System.out.print("Please Input your weight (Kg.): ");
    weight = input.nextDouble();
    System.out.print("Please input your height (Cm.): ");
    height = input.nextDouble() / 100;
    bmi = weight / (height*height);
    System.out.println("Your BMI : "+fmt.format(bmi));
    
    
    
    
}
    
}
