
package javaapplication12;

import java.util.Scanner;


public class NewClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aa = 0;
        
        System.out.println("Enter number : ");
        int insert = input.nextInt();
        
       
        while (aa <= 12) {
           aa++;
           int minus = insert*aa;
           System.out.println("2x"+aa+"="+minus);
            
        }
    }
    
}
