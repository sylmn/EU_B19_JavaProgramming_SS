package day07_TypeCasting;

public class C02_WideningCasting {
    public static void main(String[] args) {
        /*
        Bir veri türünün başka bir veri türüne atanması
        widening  bu otomatik oluyor
        narrowing
         */

        //byte<short<int<long<float<double

        byte b=5;
        short sh=45;
        sh=b; //widening casting yada implicit casting

        int i =14;
        i=sh;

        long l=62656595595l;
        l=i;

        float f =2.5f;
        double d=5.6;
        d=f;




    }
}
