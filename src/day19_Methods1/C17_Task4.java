package day19_Methods1;

import java.util.Scanner;

public class C17_Task4 {
    public static void main(String[] args) {
        /**
         * Write a program that iterates numbers and checks if number is even or
         * odd, according to evaluation it sums even and odd numbers, displays result in
         * two different methods.
         * sumOfOddNumbers();
         * sumOfEvenNumbers();
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir aralık girin. Arasındaki Sayıları tek ve çift olarak ayrı ayrı toplamını vereyim.");

        System.out.print("İlk sayi = ");
        int sayi1 = scan.nextInt();
        System.out.println();
        System.out.print("ikinci sayı = ");
        int sayi2 = scan.nextInt();

        sumOfEvenNumbers(sayi1, sayi2);
        sumOfOddNumbers(sayi1, sayi2);
    }
    private static void sumOfEvenNumbers(int sayi1,int sayi2) {
        int sumOfEven = 0;
        for (int i = sayi1; i <= sayi2; i++) {
            if (i % 2 == 0) {
                sumOfEven += i;
            }
        }
        System.out.println("Toplam Çift Sayılar: " + sumOfEven);
    }

    private static void sumOfOddNumbers(int sayi1, int sayi2) {

        int sumOfOdd = 0;
        for (int i = sayi1; i <= sayi2; i++) {
            if (i % 2 != 0) {
                sumOfOdd += i;
            }
        }
        System.out.println("Toplam Tek Sayılar: " + sumOfOdd);
    }
}
