package day27_StringClass2;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        /** 2. Frage:
         * Schreiben Sie eine Methode, die vom Benutzer ein Wort,
         * den zu ersetzenden Buchstaben/die zu ersetzenden Buchstaben und
         * den neuen Buchstaben/die neuen Buchstaben erhält.
         * Die Methode soll nur die erste gefundene Stelle im Wort/String ersetzen.
         * (Merhaba, a, e) → Merheba
         * (Kasaba, a, i) → Kisaba
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie ein Wort ein, den zu ersetzenden Buchstaben/die zu ersetzenden Buchstaben und \n" +
                            "den neuen Buchstaben/die neuen Buchstaben");
        System.out.println("Benutzen Sie bitte Leerzeichen. Beispiel: Merhaba e a ---->Marhaba");

        String girilen = scan.nextLine();
        String mevcutHarf = girilen.substring(girilen.indexOf(" ")+1,girilen.lastIndexOf(" "));
        String yeniHarf = girilen.substring(girilen.lastIndexOf(" ")+1);
        girilen = girilen.substring(0,girilen.indexOf(" "));

        System.out.println(ersetzende(girilen, mevcutHarf, yeniHarf));
    }

    public static String ersetzende (String girilen, String mevcutHarf, String yeniHarf){

        for (int i = 0; i <girilen.length() ; i++) {

            if ((girilen.charAt(i) + "").equals(yeniHarf)||(girilen.charAt(i) + ""+girilen.charAt(i+1)).equals(yeniHarf)){
                girilen=girilen.replaceFirst(yeniHarf,yeniHarf);
                break;

            } else {
                girilen=girilen;
            }
        }
        return girilen;
    }
}
