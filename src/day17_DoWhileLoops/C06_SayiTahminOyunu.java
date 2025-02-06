package day17_DoWhileLoops;

import java.util.Scanner;

public class C06_SayiTahminOyunu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomSayi = 43;
        int girilenSayi = 0;
        do{
            System.out.print("Lütfen 1-100 araliginda bir sayi giriniz! : ");
            girilenSayi = scanner.nextInt();
        } while(girilenSayi != randomSayi);

        /**
         * Eger kosulda kullanilan input, belirli degilse, ve code calisinca elde edielcekse, do-while kullanilir
         */
        System.out.println("+++++++++++++++++++++++");


        System.out.println("Lütfen 1-100 araliginda bir sayi giriniz! : ");
        girilenSayi = scanner.nextInt();
        while(girilenSayi != randomSayi){
            System.out.println("Lütfen 1-100 araliginda bir sayi giriniz! : ");
            girilenSayi = scanner.nextInt();
        }
    }
}
