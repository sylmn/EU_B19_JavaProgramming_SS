package day23_Review;

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog();

        Dog dog3 = new Dog();
        dog.ad="Karabas";
        dog.cins="Kangal";
        dog.renk="Beyaz";
        dog.yas=5;
        System.out.println("dog.ad = " + dog.ad);
        System.out.println("dog.cins = " + dog.cins);
        System.out.println("dog.renk = " + dog.renk);
        System.out.println("dog.yas = " + dog.yas);

        dog.havla();
        dog.isir();
        dog.mamaYe();
        dog.suruGut();

        //obje uzerinden fielda yeni atama yapabiliriz
        dog.yas = 7;
        System.out.println("dog.yas = " + dog.yas);

        System.out.println("-------------");
        Dog dog2 = new Dog();
        //default degerler
        //null

        System.out.println("dog2.ad = " + dog2.ad);   //null
        System.out.println("dog2.yas = " + dog2.yas); //0
        System.out.println("dog2.evcilMi = " + dog2.evcilMi);// false
        System.out.println("dog2.cinsiyet = " + dog2.cinsiyet);

        dog3.ad="Pamuk";
        dog3.havla();
        dog3.mamaYe();

    }
}
