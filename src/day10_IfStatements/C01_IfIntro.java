package day10_IfStatements;

public class C01_IfIntro {
    public static void main(String[] args) {

        if (false) {
            System.out.println("If blok çalıştı");
            System.out.println("If blok çalıştı");
            System.out.println("If blok çalıştı");
        }
        System.out.println("Program bitti");
        System.out.println("Program bitti");
        System.out.println("Program bitti");

        if (true)                   //burada true da sorun yok ancak false olursa body siz {} sadece ilk satırı kale alır.
        System.out.println("If blok çalıştı");
        System.out.println("Program bitti.");
    }
}
