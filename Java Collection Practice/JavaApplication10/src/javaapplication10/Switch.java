
package javaapplication10;

import java.util.Scanner;


public class Switch {
    public static void main(String[] args) {
        
        String dayName;
        int day;
        Scanner input = new Scanner(System.in);
        System.out.print("Input day in week : ");
        day = input.nextInt();
        switch (day) {
            case 0:
                dayName = "Sunday";
                break;
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            default:
                dayName = "Please insert just 0-6";
         }       
         System.out.println("This day is : "+dayName);
    }   
}
