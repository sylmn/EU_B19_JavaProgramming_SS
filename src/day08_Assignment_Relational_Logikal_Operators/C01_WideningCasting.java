package day08_Assignment_Relational_Logikal_Operators;

public class C01_WideningCasting {
    public static void main(String[] args) {

        byte b = 25;
        short s;

        s = b;      //short un kovası byte dan büyük olduğu için sorun yok atanabilir.

        int i = s;  //problem yapmıyor
        long l = i;  //problem yapmıyor
        double d = l;

        double sayi1 = 10 / 3;
        System.out.println("sayi1 = " + sayi1);
        /**
         * 3.0 yazar çünkü eşitliğin sağ tarafını yapar ve noktalı sayı olmadığı için int olarak yapar.
         */

        double sayi2 = 10.0 / 3;
        System.out.println("sayi2 = " + sayi2); //3.33333333335

        // String name = "Yasemin";
        // double db = name; bu data tipleri tamamen farklıdır ve cast olmaz

    }
}
