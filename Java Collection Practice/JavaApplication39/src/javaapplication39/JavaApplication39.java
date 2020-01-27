
package javaapplication39;

import java.util.Scanner;


public class JavaApplication39 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2,num3;
        int count =1; 
        
        
        for (count=1 ; count<3; count++){
            System.out.println();
            System.out.println("Input Score No."+count );
            System.out.print("input No.1 (1)");
            num1 = input.nextInt();
            System.out.print("input No.2 (2)");
            num2 = input.nextInt();
            System.out.print("input No.3 (3)");
            num3 = input.nextInt();
            int multiple = num1+num2+num3;
            System.out.println("Sum Score No.1:"+multiple);
        }
    }
    
}
