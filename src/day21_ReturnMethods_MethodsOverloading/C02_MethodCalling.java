package day21_ReturnMethods_MethodsOverloading;

import day20_CustomMethods.C01_CustomMethods;

import java.util.Scanner;

public class C02_MethodCalling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen faktöryel hesaplanacak sayıyı girin");
        int num = scan.nextInt();

        if (num < 0){
            System.out.println("lütfen pozitif bir sayı girin");
        }else {
            System.out.println("C01_Faktoriyel.faktoriel(num) = " + C01_Faktoriyel.faktoriel(num));
        }
        C01_CustomMethods.helloWorld5Times();
    }
}
