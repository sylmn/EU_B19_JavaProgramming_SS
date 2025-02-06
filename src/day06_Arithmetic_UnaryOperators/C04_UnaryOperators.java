package day06_Arithmetic_UnaryOperators;

public class C04_UnaryOperators {
    public static void main(String[] args) {
      /**  + - ++ --
        int num1 =3;
        num1=num1+3;
        System.out.println("num1 = " + num1);

        int num2 =+3;
        */

        int a = 10;
        a++;                                //a=a+1;   postincrement
        System.out.println("a = " + a);

        a--;                                //a=a-1; postdecrement
        System.out.println("a = " + a);

        ++a;                                //preincrement sayının değerini hemen bir artırıyorum.
        System.out.println("a = " + a);
        System.out.println(++a);

        --a;                                //predecrement : sayının değerini hemen bir azaltır

        System.out.println(a);      //11

        System.out.println(--a);    //10

        System.out.println(a--);    //10 önce a yı yazdırıyor sonra bir azaltıyor. döngülerde anlamlı hale gelecek
        System.out.println(a);      //9
        System.out.println(--a);    //8
        System.out.println(++a);    //9
        System.out.println(a++);    //9 a yı 9 yazar ama a ya 10 değerini yazdırdıktan sonra atadı
        System.out.println(a);      //10


        int b = 99;
        System.out.println(++b);    //100 b=100

        System.out.println("--------------");

        int c = 99;
        System.out.println(c++); // 99  c=100
        System.out.println(c);  // 100
        System.out.println(c++);// 100 c=101
        System.out.println(c);


    }
}
