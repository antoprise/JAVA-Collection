package javaapplication1;

import java.util.Scanner;

public class NewClass1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer;
        int insert;
        int random = (int) (Math.random() * (100 - 1) + 1);
        int count = 1;
        do {

            System.out.print("Enter your number : ");
            insert = input.nextInt();
            if (insert == 0) {
                System.out.println("End game Random num is :" + random);
            } else if (insert != 0) {
                System.out.println(compareBot(insert, random));
            }
            
            System.out.print("Do you want play again (y/n) ? :");
            answer = input.next();
            while (answer.equalsIgnoreCase("y")) {
                
                
            }
               
            
        
        } while (random != insert && insert != 0);

    }

    public static String compareBot(int insert, int random) {
        String ans = "";
        if (insert > random) {
            ans = "+++ High +++";
        } else if (insert < random) {
            ans = "--- Low ---";
        } else if (insert == random) {
            ans = "=== Match ===";
        }
        return ans;
    }
}
