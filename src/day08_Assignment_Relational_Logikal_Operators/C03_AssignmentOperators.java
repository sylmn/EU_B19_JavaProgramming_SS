package day08_Assignment_Relational_Logikal_Operators;

public class C03_AssignmentOperators {
    public static void main(String[] args) {

        //declaration
        int num1, num2;

        //'=' assignment operator
        num1 = 10;
        num2 = 5;

        //'+=' assignment operator
        num1 += num2; //--> num1=num1+num2;
        System.out.println("num1 = " + num1);
        //'-=' assignment operator
        num1 -= num2; //num1=num1-num2;
        System.out.println("num1 - = " + num1);

        // '*=' assignment operators
        num1 *= num2;
        System.out.println("num1 *= " + num1);

        //'/=' assignment operators
        num1 /= num2;
        System.out.println("num1 /= " + num1);

        // '%=' assignment operator

        num1 %= num2;
        System.out.println("num1 % = " + num1);

        String str = "Hasan";
        String s = "Akçay";
        str += s;
        str += s;
        System.out.println("s = " + s);
    }
}
