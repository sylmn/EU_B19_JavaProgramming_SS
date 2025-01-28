package Day06_Arithmetic_UnaryOperators;

public class C01_ArithmeticOperators {
    public static void main(String[] args) {
        /*
        + - * / % (Mod işlemi) bu beş operator bizim aritmetik operatörlerimiz. Beş işlem.

        İŞlem Önceliği:
        1. () içindeki işlemler
        2. * / %
        3. + -
         */
        System.out.println("90"+10); //9010
        System.out.println(10+"90"); //1090
        System.out.println(10+10+"90"); //2090
        System.out.println(10+"90"+10); //109010
        System.out.println("90"+10+10); //901010 String concatenation olduğu için toplanmaz. Birleştirme
        System.out.println(10+20+30+"90"+10+20); //60901020
        System.out.println(""+10+20+"90"); //102090

        int x=5;
        int y=2;
        int z=x+y; //7
        System.out.println("z = " + z);
        System.out.println("Merhaba"+x+y); //Merhaba52
        //System.out.println("Merhaba"+x-y); x ile y nin arasına - işlem olmaz. Hata verir
        System.out.println(x-y+"Merhaba"); //x ile y nin arasına - burada olur. Stringten sonra birleştirme yapar
        System.out.println("Merhaba"+" Dünya");

        //     5 / 2 * 4 % (12-9)
        double num = (double) 5 / 2 * 4 % (12-9); //önce parantez içini yapar
        //                    5 / 2 * 4 % 3   sonra soldan sağa doğru çarpma bölme yada moddan ilkini yapar
        //                      2.5 * 4 % 3
        //                           10 % 3  onun üçe bölümünden kalanı verir
        //                              1
        System.out.println("num = " + num);

    }
}
