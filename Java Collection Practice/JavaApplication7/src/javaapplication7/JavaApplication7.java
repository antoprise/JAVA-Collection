
package javaapplication7;

import java.util.Scanner;

public class JavaApplication7 {
   public static void main(String[] args) {
        double x;
        double y;
        double result;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("สวัสดีนี่คือโปรแกรมคำนวณขั้นพื้นฐาน");
        
        System.out.println("กรุณาใส่เลขที่ต้องการนำมาบวก");
        x=input.nextDouble();
        y=input.nextDouble();
        result= (x+y);
        
        System.out.println("result :"+result);
        
        System.out.println("กรุณาใส่เลขที่ต้องการนำมาลบ");
        x=input.nextDouble();
        y=input.nextDouble();
        result= (x-y);
        
        System.out.println("result :"+result);
        
        System.out.println("กรุณาใส่เลขที่ต้องการนำมาคูณ");
        x=input.nextDouble();
        y=input.nextDouble();
        result= (x*y);
        
        System.out.println("result :"+result);
        
        System.out.println("กรุณาใส่เลขที่ต้องการนำมาหาร");
        x=input.nextDouble();
        y=input.nextDouble();
        result= (x/y);
        
        System.out.println("result :"+result);
        
        System.out.println("*Created by Antoprise*");
        System.out.println("V.0.0.0.0.1 (beta)");
        
        
        
    }
    
}
