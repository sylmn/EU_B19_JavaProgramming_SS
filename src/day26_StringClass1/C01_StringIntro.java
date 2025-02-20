package day26_StringClass1;

import day22_ClassObject.Car;

public class C01_StringIntro {
    public static void main(String[] args) {
        // 1. By String literal way
        //    stack = heap
        String str1 = "Java";
        String str3 = "Java";

        System.out.println("Str1------->) = " + System.identityHashCode(str1));
        System.out.println("Str3------->) = " + System.identityHashCode(str3));

        //2. By new keyword (new String())

        String str2 = new String("Merhaba");
        String str4 = new String("Merhaba");

        System.out.println("Str2------->) = " + System.identityHashCode(str2));
        System.out.println("Str4------->) = " + System.identityHashCode(str4));

        System.out.println(str1 == str3);  //true
        System.out.println(str2 == str4);  //false iki metin ayni olsa da false cunku heap icinde
        System.out.println(str2.equals(str4));

        //String te iki metnin ayni olup olmadigina bakmak istiyorsak equals metodu kullanilmali. Bu metod objeye
        //bakmaz
        str2 =str4;
        System.out.println(str2 == str4);   //true

        Car car = new Car();
        car.marka = "Tesla";
        car.model = "Model X";
        car.dur();
    }
}
