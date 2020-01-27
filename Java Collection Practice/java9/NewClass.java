
package javaapplication9;

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    String course1,course2,course3;
    
    
    
    System.out.print("Course#1: ");
    course1 = input.next();
    System.out.print("Credits : ");
    int a = input.nextInt();
    
    System.out.print("Course#2: ");
    course2 = input.next();
    System.out.print("Credits : ");
    int b = input.nextInt();
    
    System.out.print("Course#1: ");
    course3 = input.next();
    System.out.print("Credits : ");
    int c = input.nextInt();
    
    System.out.println("Courses : "+course1.substring(3,6)+","+course2.substring(3,6)+","+course3.substring(3,6));
    System.out.println("Total Payment: "+(a+b+c)*1000);
    
    }
    
}
