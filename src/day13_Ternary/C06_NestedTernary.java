package day13_Ternary;

public class C06_NestedTernary {
    public static void main(String[] args) {
        // verilen üç rakamdan en büyüğünü yazdıran kod nedir?

        int x = 1000;
        int y = 200;
        int z = 30;
        int max;

        //if-else

        if (x > y) {
            if (x > z) {
                max = x;
            } else {
                max = z;
            }
        } else if (y > z) {
            max = y;
        } else {
            max = z;
        }

        System.out.println("max = " + max);

        //else if 2. yol

        if (x > y && x > z) {
            max = x;
        } else if (y > z) {
            max = y;
        } else {
            max = z;
        }

        System.out.println("max = " + max);

        //ternary

        int max1 = x > y ? x > z ? x : z : y > z ? y : z;

        System.out.println("max1 = " + max1);

        int max2 = (x > y && x > z) ? x : y > z ? y : z;

        System.out.println("max2 = " + max2);

        int max3 = (x > y)
                ? (x > z) ? x : z
                : (y > z) ? y : z;

        System.out.println("max3 = " + max3);
    }
}
