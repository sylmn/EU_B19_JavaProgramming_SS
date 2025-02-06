package day18_Rewiew_BranchmentAndLabelStatement;

import java.util.Scanner;

public class C23_Homework_4 {
    public static void main(String[] args) {
        /**
         * Soru 4- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
         While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı ve hesaplamak istediğiniz üssü girin :");
        System.out.println("0 girerseniz program sonlanır");

        int tabanSayi;
        int sayiUssu;
        double sonuc;

        while (true) {
            tabanSayi = scan.nextInt();

            if (tabanSayi == 0) {
                System.out.println("Program sonlanıyor...");
                break;
            }
            sayiUssu = scan.nextInt();
            sonuc = Math.pow(tabanSayi, sayiUssu);

            String usluIfade = tabanSayi + convertToSuperscript(sayiUssu);
            System.out.println("Girdiğiniz " + usluIfade + " işleminin sonucu = " + sonuc);
        }
    }

    private static String convertToSuperscript(int sayiUssu) { //Arrayleri henüz öğrenmedik
        String normal = "0123456789";
        String superscript = "⁰¹²³⁴⁵⁶⁷⁸⁹";
        String numberStr = String.valueOf(sayiUssu);
        StringBuilder superscriptStr = new StringBuilder();

        for (char c : numberStr.toCharArray()) {
            int index = normal.indexOf(c);
            if (index != -1) {
                superscriptStr.append(superscript.charAt(index));
            }
        }

        return superscriptStr.toString();
    }
}
