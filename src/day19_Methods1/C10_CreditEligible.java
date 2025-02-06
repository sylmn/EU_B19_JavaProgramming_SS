package day19_Methods1;

import java.util.Scanner;

public class C10_CreditEligible {
    public static void main(String[] args) {
        /**
         * Write a program that checks if user is eligible for credit card according to
         * users monthly income and displays result in two different methods.
         * userEligible()
         * ;
         * userNotEligible()
         */

        kredi();
    }
    public static void kredi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aylık gelirinizi giriniz ");
        int aylikGelir = scanner.nextInt();
        if (aylikGelir >= 100_000) {
            userEligible();
        } else {
            userNotEligible();
        }
    }

    public static void userEligible() {
        System.out.println("Kredi alabilir");
    }

    public static void userNotEligible() {
        System.out.println("Kredi alamaz");
    }
}
