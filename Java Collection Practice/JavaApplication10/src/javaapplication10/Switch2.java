package javaapplication10;

import java.util.Scanner;

public class Switch2 {

    public static void main(String[] args) {

        String zodiac;
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year : ");
        year = input.nextInt()-543;
        year = year%12;
        switch (year) {
            case 0:
                zodiac = "Monkey";
                break;
            case 1:
                zodiac = "Rooster";
                break;
            case 2:
                zodiac = "Dog";
                break;
            case 3:
                zodiac = "Pig";
                break;
            case 4:
                zodiac = "Rat";
                break;
            case 5:
                zodiac = "Ox";
                break;
            case 6:
                zodiac = "Tiger";
                break;
            case 7:
                zodiac = "Rabbit";
                break;
            case 8:
                zodiac = "Dragon";
                break;
            case 9:
                zodiac = "Snake";
                break;
            case 10:
                zodiac = "Horse";
                break;
            case 11:
                zodiac = "Sheep";
                break;
                default:
               zodiac = "Infinite";
        }
        System.out.println("zodiac : "+zodiac);
    }
    }

    
