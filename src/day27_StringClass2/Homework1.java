package day27_StringClass2;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        /** 1. Frage:
         * Schreiben Sie ein Programm, das die zweite Hälfte eines vom Benutzer eingegebenen Wortes zurückgibt.
         * Sanayagı → yagı, Mutluluk → uluk
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie ein Wort ein, ich gebe Ihnen die zweite Hälfte zurück");
        String eingegeben = scan.next();

        int halfte = eingegeben.length()/2;
        System.out.println("zweite Hälfte = " + eingegeben.substring(halfte));
    }
}
