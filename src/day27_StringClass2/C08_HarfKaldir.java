package day27_StringClass2;

import java.util.Scanner;

public class C08_HarfKaldir {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Bir kelime girin");
        String str = scan.nextLine();
        System.out.println("Bir harf girin");
        char harf = scan.next().charAt(0);

        String sonuc = "";
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i)!=harf) {
                sonuc += str.charAt(i);
            }
        }
        if (sonuc.length()==0){
            System.out.println("Uniq karakter yoktur");
        }
        System.out.println(sonuc);
    }
}
