package day06_Arithmetic_UnaryOperators;

public class C02_ClassTask {
    public static void main(String[] args) {
        /** Task 1
         Fatih Sultan Mehmet 1453 yılında İstanbul u fethetmiştir. İfadesini bir değişkene atayın ve yıl başka
         bir değişken ile kontrol edilsin.
         */

        int yil = 1453;

        String str = "Fatih Sultan Mehmet " + yil + " yılında İstanbul u fethetmiştir.";
        //String içindeki rakamı dinamik hale getirmiş olduk.

        System.out.println(str);

        /** Task 2
         Ali 1990 yılında doğmuştur. Ali kaç yaşındadır?

         Ali ile Ahmet kardeştir. Ali 1990 yılında doğmuştur. Ali, Ahmet den 5 yaş büyük olduğuna göre
         Ahmet kaç yaşındadır?
         */

        int dogumYili = 1990;       //Böylece kod dinamik hale geldi. Kendimiz de println içerisine elle bu yılı
        //girebilirdik ama o zaman dinamik olmazdı.
        int yasAli = 2025 - dogumYili;

        System.out.println("Ali'nin yaşı " + yasAli);
        System.out.println("yasAli = " + yasAli + " dir.");

        int yasAhmet = yasAli - 5;

        System.out.println("yasAli = " + yasAli + " dir.");
        System.out.println("Ahmet'in yası " + yasAhmet + " dir.");

        /** Task 3
         300 Fahrenheit kaç Celsius'dur?
         (°C=(°F-32)/1.8)
         */

        double f = 300;
        double c = (f - 32) / 1.8;
        System.out.println(f + " Fahrenheit" + c + " Celsius'dur.");
        
        /** Task 4
        Ali fizik dersinden 92, kimya dersinden 55, matematik dersinden 89 almıştır.
        Alinin not ortalaması kaçtır.
         */

        double fizikNotuAli = 92;
        double kimyaNotuAli = 55;
        double matNotuAli = 89;
        double notOrtalamasıAli = (fizikNotuAli + kimyaNotuAli + matNotuAli) / 3;
        System.out.println("notOrtalamasıAli = " + notOrtalamasıAli);

    }
}
