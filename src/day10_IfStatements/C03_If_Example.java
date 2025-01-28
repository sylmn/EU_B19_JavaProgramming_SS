package day10_IfStatements;

public class C03_If_Example {
    public static void main(String[] args) {
        /*  alinin fizik notu 50
            kimya notu 30
            ortalaması 50 üzerinde ise ekrana geçti yazsın
            50 altında ise herhangi bir şey yazdırmasız
            */
         double fizik =50;
         double kimya=30;
         double ortalama=(fizik+kimya)/2;
        System.out.println("ortalama = " + ortalama);
        if (ortalama>50) {
            System.out.println("Ali geçti.");
            System.out.println("öğretmen aliyi tebrik etti");
        } else{
            System.out.println("Ali kaldı");
        System.out.println("öğretmen aliye çok çalışmasını söyledi.");}
    }
}
