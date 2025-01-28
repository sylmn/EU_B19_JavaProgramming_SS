package day08_Assignment_Relational_Logikal_Operators;

public class C13_LogicalORveANDOperator {
    public static void main(String[] args) {

/*
 * highest
 * !
 * &&
 * ||
 * lowest
 */

        int a=20;
        int b=30;
        int c=40;
        System.out.println((a>b)&& (a++<c) );
        System.out.println("a = " + a);
        System.out.println((a>b)& (a++<c) );

        // OR için
        int a2=20;
        int b2=30;
        int c2=40;
        System.out.println((a2<b2)|| (a2++<c2) );
        System.out.println("a2 = " + a2);

        int a3=20;
        int b3=30;
        int c3=40;
        System.out.println((a3>b3)| (a3++<c3) );
        System.out.println("a3 = " + a3);

    }
}
