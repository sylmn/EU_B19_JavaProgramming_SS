package day22_ClassObject;

import java.util.Scanner;

public class dd {

    public static void menu(){
        System.out.println("-------Kelime Bulma Oyunu--------");
        System.out.println("-----------Kelime Listesi--------");
        System.out.println("..elma,armut,kiraz,kavun,karpuz..");
        System.out.println("---------------------------------");
        System.out.println("Listeden rastgele bir kelime seçeceğim.Tahmin et!");
        System.out.println();
    }
    public static String rastgeleKelime(){
        int sayi = (int)(Math.random() * 5 + 1); // 1 - 5 arasında bir rastgele sayı üretir.
        switch (sayi){
            case 1:
                return "elma";
            case 2:
                return "armut";
            case 3:
                return "kiraz";
            case 4:
                return "kavun";
            case 5:
                return "karpuz";
        }
        return "Bilinmeyen kelime!!";
    }
    public static void oyunaBasla(){
        Scanner scanner = new Scanner(System.in);
        String tahmin = "";
        int tahminHakki = 3;

        String kelime = rastgeleKelime();
        System.out.println("***Rastgele bir kelime seçtim.***");
        System.out.println(tahminHakki + " tahmin hakkınız var.");

        int counter = 0;
        do {
            counter++;
            System.out.print("Tahminiz ---> ");
            tahmin = scanner.nextLine();

            if(kelime.equalsIgnoreCase(tahmin)){
                System.out.println("*******Tebrikler******");
                System.out.println(counter +  " tahminde bidiniz.");
                break;
            }else{
                System.out.println("Tahminiz yanlış!!!");
                if(tahminHakki != counter){
                    System.out.println(tahminHakki - counter + " tahmin hakkınız kaldı!!!");
                }
            }
        }while (counter < tahminHakki);
        System.out.println("Tuttuğum kelime = " + kelime);
    }


    public static void main(String[] args) {
        menu();
        oyunaBasla();
    }
}
