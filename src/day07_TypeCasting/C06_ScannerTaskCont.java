package day07_TypeCasting;

import java.util.Scanner;

public class C06_ScannerTaskCont {
    public static void main(String[] args) {

        //Kullanicidan bir sayi alin
        //Sayiya iki topla karesini al

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz : ");
        int number = input.nextInt();

        input.nextLine();   //bu enter önemli yazmazsak isimi giremeyiz

        System.out.println("Lütfen isim girin :");
        String isim = input.nextLine();     // Java da scanner clasında nextInt(), nextDouble, next() kullandıktan sonra,etc
                                            // nextLine() kullanıyorsan fazladan bir tane daha nextLine() kullanman gerekir

        System.out.println("number = " + number);
        System.out.println("isim = " + isim);
    }
}
