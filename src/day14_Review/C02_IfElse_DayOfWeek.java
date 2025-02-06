package day14_Review;

import java.util.Scanner;

public class C02_IfElse_DayOfWeek {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Haftanın gününü rakamla girin : ");

        int haftaninGunu = scan.nextInt();
        String gunAdi = "";


        if (haftaninGunu == 1) {
            gunAdi = "Pazartesi ";

        } else if (haftaninGunu == 2) {
            gunAdi = "Salı ";

        } else if (haftaninGunu == 3) {
            gunAdi = "Çarşamba ";

        } else if (haftaninGunu == 4) {
            gunAdi = "Perşembe ";

        } else if (haftaninGunu == 5) {
            gunAdi = "Cuma ";

        } else if (haftaninGunu == 6) {
            gunAdi = "Cumartesi ";

        } else if (haftaninGunu == 7) {
            gunAdi = "Pazar ";
        } else {
            System.out.println("Haftada 7 gün var. ");
        }
        if (haftaninGunu >= 1 && haftaninGunu <= 7) {
            System.out.println("Bugün " + gunAdi + " dir.");
        }
    }
}
