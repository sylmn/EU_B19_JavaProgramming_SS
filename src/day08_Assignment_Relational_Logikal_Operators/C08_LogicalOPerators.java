package day08_Assignment_Relational_Logikal_Operators;

public class C08_LogicalOPerators {
    public static void main(String[] args) {
        //truth table
        System.out.println(true&&true); //true
        System.out.println(true&&false); //false
        System.out.println(false&&true); //false
        System.out.println(false&&false); //false
        
        int i1=15;
        int i2=10;
        
        boolean result1=(i1>i2)& (i1<=i2);
        System.out.println("result1 = " + result1);

        //tek operatör ile çift (& yada &&) operatör arasındaki fark performans açısındadır.
    }
}
