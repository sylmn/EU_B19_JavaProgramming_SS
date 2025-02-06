package day09_Review;

public class C04_Variables {
    public static void main(String[] args) {
        /**
         iki çeşit Data type var.
         1.Primitive
         -Boolean-->Boolean
         -Character-->Char
         -Integer-->Byte/Short/int/Long
         -Floating-->Float/Double

         2.Non-Primitive
         -String
         -Array
         -Class
         -Interface

         */

        String name;  // decleration
        name = "Ahmet";  // assignment - atama

        int age = 15;  // decleration and assignment
        byte b = 5;
        short s = 300;
        long l = 2324234234234234l;


        System.out.println("age = " + age);

        float fl = 2.4f;
        double d = 213213.5;

        age = 43;

        System.out.println("age = " + age);


        boolean bl = false;

        boolean a = 10 > 9;
        boolean a1 = 10 < 9;

        System.out.println("a = " + a);
        System.out.println("a1 = " + a1);

        int num1 = 5;
        int num2 = 54;

        boolean c = num1 == num2; // true

        System.out.println("c = " + c);

        int i1, i2, i3;
        i1 = 33;
        i2 = 23;
        i3 = 12;

        int i4 = 4, i5 = 4, i6;

        System.out.println(i4 + i5);

        i5 = 56;

        System.out.println(i4 + i5);
    }
}
