package day21_ReturnMethods_MethodsOverloading;

import java.util.Scanner;

public class C09_Davetiye {
    public static void main(String[] args) {
        davetiye();
    }

    public static void davetiye() {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("1.kelime");
            String kelime1 = scan.nextLine();
            System.out.println("2.kelime");
            String kelime2 = scan.nextLine();

            if (kelimeKontrol(kelime1, kelime2)) {
                System.out.println("kelimeler farklı olmalıdır.");
                continue;
            } else {
                davetiyeYazdır(kelime1, kelime2);
                break;
                //burada return; de yazılabilir.
            }
        }
    }

    public static boolean kelimeKontrol(String kelime1, String kelime2) {
        return kelime1.equals(kelime2);
    }

    public static void davetiyeYazdır(String str, String str2) {
        System.out.println("**********" + str + "*********" + str2 + "***********");
    }
}
