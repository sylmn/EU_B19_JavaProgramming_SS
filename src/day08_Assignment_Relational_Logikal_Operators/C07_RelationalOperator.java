package day08_Assignment_Relational_Logikal_Operators;

import java.util.Scanner;

public class C07_RelationalOperator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("İki tam sayı giriniz : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        // Aşağıdaki true/false durumları num1 = 125 ve num2 =45 değerleri içidir.

        //'==' is equal operator
        boolean b = num1 == num2;
        //'=='boolean b=(num1==num2); bu şekilde gösterim daha okunaklı

        System.out.println("b = " + b);
        System.out.println("num1==num2 " + (num1 == num2));

        // '!=' is not equal operator
        System.out.println("num1!=num2 " + (num1 != num2));

        //'>' larger operator
        System.out.println("num1 > num2 ? " + (num1 > num2)); //true

        //'<' is smaller operator
        System.out.println("num1 < num2 ? " + (num1 < num2)); //false

        //'>=' is larger or equal operator
        System.out.println("num1 >= num2 ? " + (num1 >= num2)); //true

        //'<=' is smaller or equal operator
        System.out.println("num1 <= num2 ? " + (num1 <= num2)); //false
    }
}
