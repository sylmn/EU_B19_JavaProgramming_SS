package day08_Assignment_Relational_Logikal_Operators;

public class C07_RelationalOperator {
    public static void main(String[] args) {
        int num1 = 125, num2 = 45;
        boolean b = num1 == num2;

        //'=='boolean b=(num1==num2);cbu şekilde gösterim daha okunaklı
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
