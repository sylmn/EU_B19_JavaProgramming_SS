package day04_variables;

public class C08_Rectangle {
    public static void main(String[] args) {
        /*Create a class named Rectangle, write a program that can calculate the area & perimeter of any
        given Rectangle.  length, width

        area = length * width
        perimeter = 2 * (length + width)*/
        double lenght =6;
        double widht=4;
        double area=lenght*widht;
        double perimeter=2*(lenght+widht);
        System.out.println("lenght = " + lenght);
        System.out.println("widht = " + widht);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

        System.out.printf("perimeter: %.0f%n", perimeter);


    }
}
