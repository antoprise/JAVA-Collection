package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lotto;
        int bot = (int) (Math.random() * 10);
        int bot2 = (int) (Math.random() * 10);
        int bot3 = (int) (Math.random() * 10);
        int bot4 = (int) (Math.random() * 10);
        int bot5 = (int) (Math.random() * 10);
        int bot6 = (int) (Math.random() * 10);
        String sum = ""+bot+ bot2 + bot3 + bot4 + bot5 + bot6;
        System.out.println("lotto reward is :" + sum);
        do {

            System.out.print("Enter Lotto :");
            lotto = input.nextInt();
            System.out.println(compareBot(lotto, sum));

        } while (lotto != 0);
        System.out.print("End program");

    }

    public static String compareBot(int lotto, String bot) {
        String result = "";
        String strlotto = "" + lotto;
        String strbot = "" + bot;
        if (strlotto.length() == 6) {
            if (strlotto.equals(strbot)) {
                result = "Reward 1";
                //   } else if (lotto != bot) {
                //     result = "No Reward";
            } else if (strlotto.substring(3).equals(strbot.substring(3))) {
                result = "Reward 2";
            } else if (strlotto.substring(4).equals(strbot.substring(4))) {
                result = "Reward 3";
            } else if (strlotto.equals(strbot)) {
                result = "No Reward";
            }
        }
        return result;
    }

}
