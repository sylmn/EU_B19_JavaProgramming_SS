package day08_Assignment_Relational_Logikal_Operators;

public class C04_BasamaklaraAyirma {
    public static void main(String[] args) {
        int sayi=2395;
        int birler,onlar,yuzler,binler;
        birler=sayi%10;
        sayi/=10;

        onlar=sayi%10;
        sayi/=10;

        yuzler=sayi%10;
        sayi/=10;
        binler=sayi%10;
        System.out.println("birler = " + birler);
        System.out.println("onlar = " + onlar);
        System.out.println("yuzler = " + yuzler);
        System.out.println("binler = " + binler);
    }
}
