package day08_Assignment_Relational_Logikal_Operators;

public class C05_SwappingTwoNumbers {
    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 30;

        System.out.println("Öncesi -> sayi1: " + sayi1 + ", sayi2: " + sayi2);

        // Geçici değişken kullanarak değişim
        int temp = sayi1;
        sayi1 = sayi2;
        sayi2 = temp;

        System.out.println("Sonrası -> sayi1: " + sayi1 + ", sayi2: " + sayi2);

        //2.çözüm
        int sayi01 = 20;
        int sayi02 = 30;

        System.out.println("Öncesi -> sayi01: " + sayi01 + ", sayi02: " + sayi02);

        // Toplama ve çıkarma ile değişim
        sayi01 = sayi01 + sayi02; // sayi01 = 50
        sayi02 = sayi01 - sayi02; // sayi02 = 20
        sayi01 = sayi01 - sayi02; // sayi01 = 30

        System.out.println("Sonrası -> sayi01: " + sayi01 + ", sayi02: " + sayi02);

    }
}
