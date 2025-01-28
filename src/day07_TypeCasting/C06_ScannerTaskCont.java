package day07_TypeCasting;

import java.util.Scanner;

public class C06_ScannerTaskCont {
    public static void main(String[] args) {

//Kullanicidan bir sayi alin
//Sayiya iki topla karesini al

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz : ");
        int number = input.nextInt();

        input.nextLine();   //bu enter önemli yazmassak isimi giremeyiz

        System.out.println("Lütfen isim girin :");
        String isim = input.nextLine();

        System.out.println("number = " + number);
        System.out.println("isim = " + isim);


    }
}
