package day10_IfStatements;

import java.util.Scanner;

public class C05_ClassTask_2 {
    public static void main(String[] args) {
        /**
         Hava sıcaklığı isminde bir değişken deklere edin ve değer atayın.
         Sıcaklık 20 derece üzerinde ise 'hava sıcak' yazsın.
         Sıcaklık 20 derece ve altında ise 'hava soğuk' yazsın.
         */

        int temp = 25;
        if (temp > 20) {
            System.out.println("hava sıcak");

        } else {
            System.out.println("hava soğuk");
        }
        System.out.println("--------------");


        /**
         Kullanıcıdan bir tam sayı alın. Ekrana tek mi çift mi olduğunu yazdırın
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir Sayı giriniz :");
        int number = input.nextInt();

        boolean result = (number % 2 == 1);

        if (result) {
            System.out.println("Sayı tektir");

        } else {
            System.out.println("Sayi çifttir");
        }
        System.out.println("program bitti");
    }
}
