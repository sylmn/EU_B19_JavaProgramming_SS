package day08_Assignment_Relational_Logikal_Operators;

public class C08_LogicalOPerators {
    public static void main(String[] args) {

        //truth table
        System.out.println(true && true); //true
        System.out.println(true && false); //false
        System.out.println(false && true); //false
        System.out.println(false && false); //false

        int i1 = 15;
        int i2 = 10;

        //tekli operand
        boolean result1 = (i1 > i2) & (i1 <= i2);
        System.out.println("result1 = " + result1);  //false

        //çiftli operand
        boolean result2 = (i1 != i2) && (i1 >= i2);
        System.out.println("result2 = " + result2); //true

        // tek operator ile çift opartor arasındaki fark sonuçla ilgili değildir
        // performans ile ilgilidir.
    }
}
