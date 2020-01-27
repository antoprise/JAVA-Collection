package javaapplication12;

import java.util.Scanner;

public class JavaApplication12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please choose Paper(0) or Rock(1) or Scissor(2) : ");
        int human = input.nextInt();

        int bot = (int) (Math.random() * (2 - 0 + 1) + 0);

        if (human == 0) {
            if (bot == 0) {
                System.out.println("l'm choose paper,You choose paper,WE DARW.");
            } else if (bot == 1) {
                System.out.println("L'm choose rock,You choose paper,YOU WIN!!!");
            } else if (bot == 2) {
                System.out.println("L'm choose scissor.You choose scissor,YOU LOSE.");
            }
        }
        if (human == 1) {
            if (bot == 0) {
                System.out.println("l'm choose paper,You choose rock,YOU LOSE.");
            } else if (bot == 1) {
                System.out.println("L'm choose rock,You choose rock,WE DARW.");
            } else if (bot == 2) {
                System.out.println("L'm choose scissor.You choose rock,YOU WIN!!.");
            }
        }
        if (human == 2) {
            if (bot == 0) {
                System.out.println("l'm choose paper,You choose scissor,YOU WIN!!!");
            } else if (bot == 1) {
                System.out.println("L'm choose rock,You choose scissor,YOU LOSE.");
            } else if (bot == 2) {
                System.out.println("L'm choose scissor.You choose scissor,WE DARW.");
            }
        }
    }

}
