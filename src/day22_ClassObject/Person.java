package day22_ClassObject;

public class Person {

    String isim;
    int yas;
    String cinsiyet;
    String tcNo;
    double yilsonuOrtalama;

    public void uyu (){
        System.out.println(isim+" uyuyor");
    }

    public void oyunOyna (){
        System.out.println(isim+" oyun oynuyor");
    }
}
/*
özellikleri (fields) yas, ismi, cinsiyet, tcNo, yilsonuOrtalama
 aksiyonlari (metodlar) uyu (), oyunOyna (), gecmeNotu
 */