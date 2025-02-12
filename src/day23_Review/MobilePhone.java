package day23_Review;

public class MobilePhone {
    String marka;
    String model;
    String renk;
    int fiyat;
    double boyut;
    int kapasite;
    boolean mesajAtabiliyorMu;

    public void ara() {
        System.out.println(model + " arama yapabiliyor.");
    }

    public void mesajAt() {
        System.out.println(model + " mesaj atiyor.");
    }

    public void fotoCek() {
        System.out.println(model + " foto cekiyor");

    }

    public void interneteBaglan() {
        System.out.println(model + " internete baglaniyor.");

    }
}
/*
marka
model
renk
fiyat
boyut
kapasite
mesajAtabiliyorMu


ara()
mesajAt()
fotoCek ()
interneteBaglan()
 */