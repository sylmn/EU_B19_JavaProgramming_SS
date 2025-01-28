package Day06_Arithmetic_UnaryOperators;

public class C07_ClassTask3 {
    public static void main(String[] args) {
        /*
        Toplantı salonunda 15 adet sıra ve her sırada 12 adet koltuk vardır.
        Toplantıya 113 kişi katılmıştır.
         */
        
        int sira=15;
        int siraKoltukSayisi=12;
        int katilim=113;
        
        //1. Toplantı salonunun kapasitesi nedir?
        int kapasite=sira*siraKoltukSayisi;
        System.out.println("kapasite = " + kapasite);
        
        //2.Kaç adet boş koltuk vardır?
        int boşKoltuk=kapasite-katilim;
        System.out.println("boşKoltuk = " + boşKoltuk);
        
        //3.Kaç adet sırada oturulmaktadır?
        int oturulanSira=sira*siraKoltukSayisi/katilim;
        System.out.println("oturulanSira = " + oturulanSira);


    }
}
