package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lotto;
        int bot = (int) (Math.random() * (999999 - 000000 + 1) + 000000);

        do {
            System.out.println("lotto reward is :" + bot);
            System.out.print("Enter Lotto :");
            lotto = input.nextInt();
            System.out.println(compareBot(lotto, bot));

        } while (lotto >= 000000 && lotto != 0);
        System.out.println("End program");
        
  }

    public static String compareBot(int lotto, int bot) {
        String result = "";
        String strlotto = "" + lotto;
        String strbot = "" + bot;
        if (lotto == bot) {
            result = "Reward 1";
     }else if (lotto != bot) {
         result = "No Reward";
        } else if (strlotto.substring(3, 5).equals(strbot.substring(3, 5))) {
            result = "Reward 2";
        } else if (strlotto.substring(4, 5).equals(strbot.substring(4, 5))) {
            result = "Reward 3";
        } else {
            result = "No Reward";
        }

        return result;
    }
}
