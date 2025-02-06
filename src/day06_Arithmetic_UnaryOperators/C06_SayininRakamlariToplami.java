package day06_Arithmetic_UnaryOperators;

import java.util.Scanner;

public class C06_SayininRakamlariToplami {
    public static void main(String[] args) {

        /**
        Kullanicidan 3 basamakli bir sayi alin ve sayinin rakamları toplamını ekrana yazdırın
        112  =1+1+2=4
        952  =9+5+2=16
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen üç basamaklı bir sayı giriniz : ");

        int number = scanner.nextInt();
        System.out.println("number = " + number);

        //567 sayısı girilmiş olsa

        int lastDigit = number % 10;    //567 den kalan 7 yi verdi
        number /= 10;                   //56
        int secondDigit = number % 10;  //6
        int thirdDigit = number / 10;   //5

        int toplam = lastDigit + secondDigit + thirdDigit;
        System.out.println("toplam = " + toplam);

        /** Basamakları bulma
        digit1 = number / 100;            Yüzler basamağı
        digit2 = (number / 10) % 10;      Onlar basamağı
        digit3 = number % 10;             Birler basamağı
         */

    }
}
