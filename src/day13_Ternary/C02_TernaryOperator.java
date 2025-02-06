package day13_Ternary;

public class C02_TernaryOperator {
    public static void main(String[] args) {

        /**
         * if'in basit hali
         * (condition) ? code (true) : code (false)
         * Örn: Sayının çift mi tek mi olduğunu yazdıran kod nedir?
         */

        int number = 15;

        if (number % 2 == 0) {
            System.out.println(number + " sayısı çifttir.");
        } else {
            System.out.println(number + " sayısı tektir.");
        }

        //ternary
        System.out.println(number % 2 == 0 ? "sayısı çifttir." : "sayısı tektir.");
        String mesaj = number % 2 == 0 ? "sayısı çifttir." : "sayısı tektir.";
        System.out.println("mesaj = " + mesaj);

        /**
         * kod hata verir.
         * number % 2 == 0 ? System.out.println("sayısı çifttir.") : System.out.println("sayısı tektir.");
         * Eğer ternary sonucunda oluşan değer bir değişkene atanmayacaksa,
         * ? ve : sonraki değerlerin data tipi farklı olabilir
         */

        System.out.println(number % 2 == 0 ? "sayısı çifttir." : number * 2);

        //  int s =   number % 2 == 0 ? "sayısı çifttir." : number*2; hata verir..
        // bir şartın gerçekleşmesi durumunda birden fazla  kod satırı çalışacaksa mutlaka if-else kullanılmalıdır.
        // ternary'de sadece tek statement kullanılır.

        if (number % 2 == 0) {
            System.out.println(number + " sayısı çifttir.");
            System.out.println(number + " sayısı çifttir.");
            System.out.println(number + " sayısı çifttir.");
            System.out.println(number + " sayısı çifttir.");
        } else {
            System.out.println(number + " sayısı tektir.");
            number = number * number;
        }
    }
}
