package day12_Switch_Case;

import java.util.Scanner;

public class C06_SwitchCaseBankMenu {
    public static void main(String[] args) {

        System.out.println("ABC Bankasına Hoş Geldiniz");
        System.out.println("---------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("1- Bakiye Görüntüleme");
        System.out.println("2- Para Çekme");
        System.out.println("3- Para Yatırma");
        System.out.println("4- Çıkış");

        int secim = input.nextInt();
        int bakiye = 5000;

        switch (secim){

        }
    }
}
