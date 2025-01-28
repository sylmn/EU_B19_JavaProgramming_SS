package day07_TypeCasting;

public class C03_NarrowingCasting {
    public static void main(String[] args) {

        byte b=5;
        short sh=3456;
        b= (byte) sh; //narrowing

        float fl=2.5f;
        int i= (int) fl;
        System.out.println("i = " + i);

        byte b1=10;
        byte b2=4;
        byte z= (byte) (b1+b2);
        System.out.println("z = " + z);

        int sayi1=b1*b2;
        byte byt=127;
        byte by2=10;
        byte l= (byte) (byt+by2);

        double d=5.2;
        int y=2;
        int z1 = (int) (d+y);
        System.out.println("z1 = " + z1);


    }
}
