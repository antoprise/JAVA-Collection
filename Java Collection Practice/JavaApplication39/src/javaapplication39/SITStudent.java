package javaapplication39;

import java.util.Scanner;

public class SITStudent {

    public static void main(String[] args) {
        String fname, sname;
        long stdID;
        double height, weight;
        Scanner input = new Scanner(System.in);
        Student std = new Student();

        System.out.print("Your student ID : ");
        stdID = input.nextLong();

        System.out.print("Your first name : ");
        fname = input.next();
        System.out.print("Your surname : ");
        sname = input.next();

        System.out.print("Your weight(KG.) : ");
        weight = input.nextDouble();
        System.out.print("Your height (CM.) : ");
        height = input.nextDouble();

//        System.out.println("Student ID : "+stdID+"First name : "+fname+"Surname : "+sname+"Weight :"+weight+"Height : "+height);
        std.setStdID(stdID);
        std.setFname(fname);
        std.setFname(fname);
        std.setWeight(weight);
        std.setHeight(height);
        System.out.println(std.toString());
    }

}
