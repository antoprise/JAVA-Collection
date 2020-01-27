package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tour, human;
        int hu, a1, a2, a3, a4, a5;

        System.out.println("รายการทัวร์ของเราประกอบไปด้วย : \n"
                + "1.ประเทศโปรตุเกส ราคา 50,000 บาท / คน (6 วัน 5 คืน)\n"
                + "2.ประเทศบัลแกเรีย ราคา 45,000 บาท / คน (6 วัน 5 คืน)\n"
                + "3.ประเทศโปแลนด์ ราคา 46,000 บาท / คน (6 วัน 5 คืน)\n"
                + "4.ประเทศโมนาโก ราคา 51,000 บาท / คน (6 วัน 5 คืน)\n"
                + "5.ประเทศสเปน ราคา 55,000 บาท / คน (6 วัน 5 คืน)");

        System.out.print("กรุณาเลือกทัวร์ที่ต้องการ : ");
        tour = input.next();

        switch (tour) {
            case "1":
                System.out.println("ประเทศ : โปรตุเกส ราคา 50,000 บาท / คน (6 วัน 5 คืน)");
                break;
            case "2":
                System.out.println("ประเทศ : บัลแกเรีย ราคา 45,000 บาท / คน (6 วัน 5 คืน)");
                break;
            case "3":
                System.out.println("ประเทศ : โปแลนด์ ราคา 46,000 บาท / คน (6 วัน 5 คืน)");
                break;
            case "4":
                System.out.println("ประเทศ : โมนาโก ราคา 51,000 บาท / คน (6 วัน 5 คืน)");
                break;
            case "5":
                System.out.println("ประเทศ : สเปน ราคา 55,000 บาท / คน (6 วัน 5 คืน)");
                break;
            default:
                break;
        }
        int a = 50000, b = 45000, c = 46000, d = 51000, e = 55000;

        System.out.print("จำนวนคนที่จะเดินทาง : ");
        hu = input.nextInt();

        if (tour.equals("1")) {
            System.out.println("ราคาทั้งหมด : " + (hu * a) + " " + "บาท");
        } else if (tour.equals("2")) {
            System.out.println("ราคาทั้งหมด : " + (hu * b) + " " + "บาท");
        } else if (tour.equals("3")) {
            System.out.println("ราคาทั้งหมด : " + (hu * c) + " " + "บาท");
        } else if (tour.equals("4")) {
            System.out.println("ราคาทั้งหมด : " + (hu * d) + " " + "บาท");
        } else if (tour.equals("5")) {
            System.out.println("ราคาทั้งหมด : " + (hu * e) + " " + "บาท");
        }

    }

}
