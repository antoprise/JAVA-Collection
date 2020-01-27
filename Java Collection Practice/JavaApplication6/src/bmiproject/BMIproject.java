
package bmiproject;

import java.util.Scanner;

public class BMIproject {
    public static void main(String[] args) {
        
        double weight,height,bmi;
        Scanner input = new Scanner(System.in);
//        System.out.println("กรุณาใส่น้ำหนัก");
        weight=input.nextDouble();
//        System.out.println("กรุณาใส่ส่วนสูง");
        height=input.nextDouble();
        
        bmi= weight/(height*height);
        System.out.println("BMI: "+bmi);
        
        
        
                
    }
    
}
