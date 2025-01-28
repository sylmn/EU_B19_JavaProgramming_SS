package day08_Assignment_Relational_Logikal_Operators;

public class C02_NarrowingCasting {
    public static void main(String[] args) {
        short s=5;
        byte b= (byte) s;
        System.out.println("b = " + b);

        s=128;
        byte b2= (byte) s;
        System.out.println("b2 = " + b2); //128 bir sonraki basamak olan -128 gider. sayı arttıkça başa sarar.
        
        int i=45545;
        short sh= (short) i;
        System.out.println("sh = " + sh); //-19991 veri kaybı olur. başa sarar.

        short num1=25;
        short num2=55;
        short num3= (short) (num1+num2);

        double x=25+2+8*.5; // işlemlerde bir yerde double varsa sonuç double dır.

        
        double d=2.4;
        int i1= (int) d;
        System.out.println("i1 = " + i1); //2

        double z=25/3;//veri kaybı olur 8.0

        char c1='A';
        char c2='a';
        int v=c1+c2;
        System.out.println("v = " + v);
        System.out.println(c1>c2);  //genelde sıralama yaparken böyle kullanılabilir.

        System.out.println(true); //yanına String eklersem concatination yapıyor
        System.out.println(true+"String");

        var h="Ali";
        var h1=55;   //algılayan bir veri tipi

        
        
    }
}
