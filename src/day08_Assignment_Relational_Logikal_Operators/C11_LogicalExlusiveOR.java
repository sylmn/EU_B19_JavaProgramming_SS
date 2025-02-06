package day08_Assignment_Relational_Logikal_Operators;

public class C11_LogicalExlusiveOR {
    public static void main(String[] args) {

        System.out.println(true ^ true); //false
        System.out.println(true ^ false); //true
        System.out.println(false ^ true);  //true
        System.out.println(false ^ false); //false

        int sayi1 = 20;
        int sayi2 = 22;

        System.out.println("(sayi1 ^ sayi2) = " + (sayi1 ^ sayi2)); // 2  // aradaki farkı verir..

        System.out.println("Github deneme");
    }
}
