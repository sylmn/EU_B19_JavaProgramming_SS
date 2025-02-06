package day19_Methods1;

import java.util.Scanner;

public class C16_Task3 {
    public static void main(String[] args) {
        /**
         * Write a method that converts Celsius to Fahrenheit:
         * convertFehreneit();
         * Formül --> (0°C × 9/5) + 32 = 32°F
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("derece değerini girin Fahrenheit'a çevireyim");
        int girilenDeğer = scan.nextInt();
        int dönenFahrenheit= convertFehreneit(girilenDeğer);
        System.out.println(convertFehreneit(girilenDeğer));
        System.out.println(dönenFahrenheit);
    }

    private static int convertFehreneit(int derce) {
        int sonucFahrenheit = (derce * 9/5) + 32;
                return sonucFahrenheit;
    }
}
