package day27_StringClass2;

import java.util.Scanner;

public class C07_Uniq {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Bir cumle girin uniq olanlari vereyim");

        String str = scan.nextLine();
        String sonuc = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                sonuc += str.charAt(i);
            }
        }
        if (sonuc.length()==0){
            System.out.println("Uniq karakter yoktur");
        }
        System.out.println(sonuc);
    }
}
