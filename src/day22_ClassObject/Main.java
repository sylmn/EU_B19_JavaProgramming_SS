package day22_ClassObject;

public class Main {
    public static void main(String[] args) {

        int i1 = 6;
        int i2 = 4;
        Calculator calculator = new Calculator();
        System.out.println("calculator.cikart(i1,i2) = " + calculator.cikart(i1, i2));
        System.out.println("calculator.add(i1,i2) = " + calculator.add(i1, i2));

        Calculator calculator1 = new Calculator();
        System.out.println("calculator1.add(34,45) = " + calculator1.add(34, 45));

        Circle circle = new Circle();
        circle.r=5;
        System.out.println("circle.r = " + circle.r); //default degerini getirir. Cünkü deger atamadik.
        circle.alanHesapla();

        Circle circle1 =new Circle();
        circle1.r = 3;
        circle1.alanHesapla();

        System.out.println("circle1.cevreHesapla() = " + circle1.cevreHesapla());

        System.out.println("-------------------------------");

        Person tulay = new Person();
        tulay.isim="Tulay";
        tulay.yas=23;
        tulay.cinsiyet="Kadin";
        tulay.tcNo="12345678912";

        tulay.uyu();
        System.out.println("tulay.yas = " + tulay.yas);
        System.out.println("tulay.isim = " + tulay.isim);
        System.out.println("tulay.tcNo = " + tulay.tcNo);
        System.out.println("tulay.cinsiyet = " + tulay.cinsiyet);

        Person ahmet = new Person();
        ahmet.isim="Ahmet";
        ahmet.yas=25;
        ahmet.cinsiyet="Erkek";
        ahmet.tcNo="9987456321";
        ahmet.yilsonuOrtalama=79;
        ahmet.uyu();
        ahmet.oyunOyna();
        System.out.println("Math2.pow(2,3) = " + Math2.pow(2, 3));

    }
}
