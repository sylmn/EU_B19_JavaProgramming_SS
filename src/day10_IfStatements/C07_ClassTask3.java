package day10_IfStatements;

import java.util.Scanner;

public class C07_ClassTask3 {
    public static void main(String[] args) {
        /*
Class Task 2
kullanıcıdan bir tam sayı alın
ekrana tek mi çift mi olduğunu yazdırın
*/
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz : ");
        int sayi= scan.nextInt();
        boolean result=(sayi%2==1);
        if (result){
            System.out.println("Girdiğiniz sayı tek bir sayıdır. ");
        } else {
            System.out.println("Girdiğiniz sayı çift bir sayıdır.");
        }
    }
}
