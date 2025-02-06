package day09_Review;

import java.util.Scanner;

public class C07_Tasks {
    public static void main(String[] args) {
        /** Tasks 1:

         1. Get name and age from the user, declare a variable (byte) age,
         write a program that can check if the person is eligible to buy Cigarettes.
         In the USA it is illegal to sell tobacco under age 21.

         print console : Ahmet is eligible to buy cigarettes: true/false
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name : ");
        String name = scan.nextLine();
        System.out.print("Enter the age : ");

        byte age = scan.nextByte();
        boolean eligibleToBuyCigar = age >= 21;
        System.out.println(name + " is eligible to buy cigarettes : " + eligibleToBuyCigar);

        /**
         2. Kullanicidan aldigimiz boy ve kiloda Beden Kitle Endeksi body mass index hesaplanacak
         * Body Mass Index (bmi) = kilo / (Boy(m)*Boy(m))
         */

        System.out.println("Diğer Task");
        System.out.print("Lütfen boyunuzu girin (metre) : ");
        double boy = scan.nextDouble();
        System.out.print("Lütfen kilonuzu girin : ");

        double kilo = scan.nextDouble();
        System.out.println("Girmiş olduğunuz verilere göre : ");
        double bodyMassIndex = kilo / (boy * boy);
        System.out.println("Beden Kitle Endeksiniz = " + bodyMassIndex);

        if (age >= 19 && age <= 24) {
            System.out.println("19-24 yaş aralığı için olması gereken Beden Kitle Endeksi : 19-24");

            if (bodyMassIndex >= 24) {
                System.out.println("Dikkatli olmalısın, sınırların dışındasın.!!!");

            } else if (bodyMassIndex <= 21) {
                System.out.println("Dikkatli ol rüzgarda uçarsın");

            } else {
                System.out.println("Harikasın....");}

        } else if (age >= 25 && age <= 44) {
            System.out.println("25-44 yaş aralığı için olması gereken Beden Kitle Endeksi : 20-25");

            if (bodyMassIndex >= 25) {
                System.out.println("Dikkatli olmalısın, sınırların dışındasın.!!!");

            } else {
                System.out.println("Harikasın....");}

        } else if (age >= 45 && age <= 54) {
            System.out.println("45-54 yaş aralığı için olması gereken Beden Kitle Endeksi : 22-27");

            if (bodyMassIndex >= 27) {
                System.out.println("Dikkatli olmalısın, sınırların dışındasın.!!!");
            } else {
                System.out.println("Harikasın....");}

        } else if (age >= 55 && age <= 64) {
            System.out.println("55-64 yaş aralığı için olması gereken Beden Kitle Endeksi : 23-28");

            if (bodyMassIndex >= 28) {
                System.out.println("Dikkatli olmalısın, sınırların dışındasın.!!!");

            } else {
                System.out.println("Harikasın....");}

        } else if (age >= 65) {
            System.out.println("65 yaş ve üzeri için olması gereken Beden Kitle Endeksi : 24-29");

            if (bodyMassIndex >= 29) {
                System.out.println("Dikkatli olmalısın, sınırların dışındasın.!!!");

            } else {
                System.out.println("Harikasın....");}

        } else {
            System.out.println("Harikasın, gençliğinin kıymetini bil.");}

    }
}
