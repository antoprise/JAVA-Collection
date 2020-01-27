package teststudent;

import java.util.Scanner;

public class TestStudent {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Student std0= new Student(44444444,"dsadsadsa");
        Student std = new Student();
        Student std2 = new Student();
        Student std3 = new Student();
        
        
        String temp;
        long idStd,idStd2,idStd3;
        String idStr,idStr2,idStr3;
 ////////////////////////////  ตัวแปร  ////////////////////////////////////       

        System.out.print("Enter your Name : ");
        idStr = input.nextLine();

        System.out.print("Enter your ID : ");
        idStd = input.nextLong();

        std.setId(idStd);
        std.setName(idStr);
//////////////////////////////////////////////////////////////////////////
        System.out.print("Enter your Name : ");
        temp = input.nextLine();
        idStr2 = input.nextLine();

        System.out.print("Enter your ID : ");
        idStd2 = input.nextLong();

        std2.setId(idStd2);
        std2.setName(idStr2);
/////////////////////////////////////////////////////////////////////////
        System.out.print("Enter your Name : ");
        temp = input.nextLine();
        std3.setName(input.nextLine());

        System.out.print("Enter your ID : ");
        std3.setId(input.nextLong());

        System.out.println(std.toString());
        System.out.println(std2.toString());
        System.out.println(std3.toString());
        System.out.println(std0.toString());
        
        
        System.out.println(Student.getNumOfStudent());

    }

}
