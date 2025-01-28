package day14_Review;

import java.util.Scanner;

public class C07_SwitchBeden {
    public static void main(String[] args) {
        /*
        bir program yazın switch yapısını kullansın
        beden numarası alsın
        small 38, 40, 42
        medium 44, 46, 48
        large 50,52,54

        output: 50 numara bir large bedendir.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir beden girin : ");
        int beden = scan.nextInt();

        switch (beden) {
            case 38, 40, 42:
                System.out.println(beden + " numara small bedendir.");
                break;

            case 44, 46, 48:
                System.out.println(beden + " numara medium bedendir.");
                break;

            case 50, 52, 54:
                System.out.println(beden + " numara large bedendir.");
                break;

            default:
                System.out.println("Elimizde istediğiniz beden yoktur.");
        }
    }
}
