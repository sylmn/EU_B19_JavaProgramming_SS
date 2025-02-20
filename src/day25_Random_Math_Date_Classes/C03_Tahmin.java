package day25_Random_Math_Date_Classes;

import java.util.Random;
import java.util.Scanner;

public class C03_Tahmin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1-10 arasinda bir sayi girin");

        Random random = new Random();
        int sayi = random.nextInt(10)+1;
        int denemeSayisi=0;

        while (true){
            denemeSayisi++;
            int girilen = scan.nextInt();
            if (girilen==sayi){
                System.out.println("random sayiyi bildiniz");
                break;
            }
        }
    }
}
