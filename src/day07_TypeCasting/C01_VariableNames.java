package day07_TypeCasting;

public class C01_VariableNames {
    public static void main(String[] args) {
        /**
         -Değişken isimleri rakam ile başlamaz
         -@ ve *  işaretleri hiçbir yerde kabul etmez
         -boşluk olmaz
         */

        int a1bc1 = 5;
        // int age@=5; //kabul etmez
        // int a*ge=5;  //kabul etmez

        //String ad Soyad = "Ahmet Kocal";      //boşluk kabul etmez

        /**
         $ ve _ ile başlayabilir
         */
        int $maas = 490000;
        int _maas = 500000;

        String ad_soyad = "Ahmet Çakar";
        int total_pay = 50000;
        int totalPay = 40000;

        final double PI = 3.14;     // büyük harf ile başlayıp büyük harf ile devam eden  değişkenler sabittir
        //final dedikten sonra PI 'ye değer atanamıyor

        //Java'ya ait rezerve kelimeler var onlar da değişken ismi olarak kullanılamaz.
        //int case=5; kabul etemez


    }
}
