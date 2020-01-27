package javaapplication10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Compare {

    public static void main(String[] args) {
//        double x = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
//        double theSmallValue = 0.0000000000000001;
//        if (Math.abs(x - 0.5) < theSmallValue) {
//            System.out.println("Something");
            
            float x = 0.01f;
            DecimalFormat fmt = new DecimalFormat("0.###############");
            System.out.print(fmt.format(x));

        
    }
}
