package day04_Variables;

public class C05_Circle {
    public static void main(String[] args) {
        //declare variables
        //PI, radius,area,perimeter

        double PI = 3.14;
        double r = 8;

        double area = PI*r*r;
        double perimeter=2*PI*r;

        System.out.println("PI = " + PI);
        System.out.println("r = " + r+" cm");
        System.out.println("area = " + area+" cm\u00B2"); // Unicode karakteri \u00B2
        System.out.println("area = " + area+" cm\u00B3");
        System.out.println("perimeter = " + perimeter+" cm");

    }
}
