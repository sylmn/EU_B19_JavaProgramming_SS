package day12_Switch_Case;

import java.util.Locale;
import java.util.Scanner;

public class C07_Homework1 {
    public static void main(String[] args) {

        /** TASK 1 :
        - Write a program that lets user enter Mercedes, Volvo, Opel, Sahin Car Models
            If it is Mercedes display “Good one”
            If it is Volvo display “Tough one”
            If it is Opel display “Not bad”
            If it is Sahin display “Not recommended”

            Else “Do not buy that one!”
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Car Models and I will recommend you, that which one is best. ");
        String carModel = scan.nextLine();

        /**
        if (carModel.equalsIgnoreCase("Mercedes")) {
            System.out.println("Good one");
        } else if (carModel.equalsIgnoreCase("Volvo")) {
            System.out.println("Tough one");
        } else if (carModel.equalsIgnoreCase("Opel")) {
            System.out.println("Not bad");
        } else if (carModel.equalsIgnoreCase("Sahin")) {
            System.out.println("Not recommended");
        } else {
            System.out.println("Do not buy that one!");
        }
        */

        switch (carModel.toLowerCase()) {

            case "mercedes":
                System.out.println("Good one");
                break;

            case "volvo":
                System.out.println("Tough one");
                break;

            case "opel":
                System.out.println("Not bad");
                break;

            case "sahin":
                System.out.println("Not recommended");
                break;

            default:
                System.out.println("Do not buy that one!");
        }
        /**
         switch (carModel.toLowerCase()) {
         case "mercedes" -> System.out.println("Good one");
         case "volvo" -> System.out.println("Tough one");
         case "opel" -> System.out.println("Not bad");
         case "sahin" -> System.out.println("Not recommended");
         default -> System.out.println("Do not buy that one!");
         }
         */
    }
}
