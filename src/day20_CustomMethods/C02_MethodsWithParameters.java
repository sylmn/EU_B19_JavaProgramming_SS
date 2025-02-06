package day20_CustomMethods;

import java.util.Scanner;

public class C02_MethodsWithParameters {
    public static void main(String[] args) {

        oddOrEven((int) Math.pow(2, 4));
        oddOrEven(54);  //

        System.out.println(Math.pow(2, 4));

        System.out.println("-----------------");

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen doğum tarihini giriniz :");

        ageOfPerson(scanner.nextInt());

        printNumbers(45,68);
    }

    /**
     * this method checks whether a number is odd or even number
     *
     * @param number
     */

    public static void oddOrEven(int number){
        if (number%2==0){
            System.out.println(number+" is an even number");
        }else {
            System.out.println(number+" is an odd number");
        }
    }

    /**
     * this method displays the age of the person from the birtyear
     *
     * @param birthYear
     */

    public static void ageOfPerson(int birthYear){
        int age=2025-birthYear;
        System.out.println("Your age is : "+age);
    }

    /**
     * this method prints all the numbers between minNumber and maxNumber
     *
     * @param minNumber
     * @param maxNumber
     */
    public static void printNumbers(int minNumber,int maxNumber){
        for (int i = minNumber; i < maxNumber; i++) {
            System.out.print(i+" ");
        }
    }
}
