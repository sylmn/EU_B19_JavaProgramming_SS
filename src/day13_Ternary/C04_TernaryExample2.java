package day13_Ternary;

import java.util.Scanner;

public class C04_TernaryExample2 {
    public static void main(String[] args) {
        //Klavyeden bir kişinin adını ve yaşını alalım
        //Eğer yaşı 18'e eşit ve büyükse name+" oy kulanabilirsiniz" mesajı verelim
        //Eğer yaşı 18'den küçükse name+" oy kullanma hakkınız yoktur" mesajı verelim

        Scanner veriGir = new Scanner(System.in);

        String name;
        int age;

        System.out.print("Lütfen adınızı giriniz : ");
        name = veriGir.nextLine();

        System.out.print("Lütfen yaşınızı giriniz : ");
        age = veriGir.nextInt();

        String mesaj = (age >= 18) ? name+ " oy kulanabilirsiniz." : name+" oy kullanma hakkınız yoktur.";

        System.out.println("mesaj = " + mesaj);
    }
}
