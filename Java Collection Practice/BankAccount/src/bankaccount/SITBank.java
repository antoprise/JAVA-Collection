
package bankaccount;

import java.util.Scanner;

public class SITBank {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int func;
        double amount, balance = 0;
        do {
            String menu = "Select: \n\t1.for deposit\n\t2.for withdraw\n\t0.for exit";
            System.out.println(menu);
            System.out.print("Select function : ");
            func = input.nextInt();
            System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");

            switch (func) {
                case 1:
                    System.out.print("Enter money for deposit:");
                    amount = input.nextDouble();
                    balance = deposit(amount, balance);
                    System.out.println("Total balance = " + balance);
                    break;
                case 2:
                    System.out.print("Enter money for withdraw:");
                    amount = input.nextDouble();
                    balance = withdraw(amount,balance);
                    System.out.println("Total balance = "+balance);
                    break;
                case 0:
                    System.out.println("goodbye ! see you next time.");
                    break;
                default:
                    System.out.println("+++Error 404 NOT Found,Please insert just : 1,2,3!!!+++");

            }
        } while (func != 0);

    }

    public static double deposit(double depMoney, double totalMoney) {
        if (depMoney > 0) {
            totalMoney = totalMoney + depMoney;
        } else {
            System.out.println("There is something wrong ");
        }
        return totalMoney;
    }

    public static double withdraw(double depMoney,double totalMoney){
        if (depMoney>0 && totalMoney>depMoney){
            totalMoney=totalMoney-depMoney;
        }else {
            System.out.println("there is some thing wrong");
        }
            
        return totalMoney;
    }

    
}
