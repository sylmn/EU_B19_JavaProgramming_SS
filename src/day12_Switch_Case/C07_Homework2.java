package day12_Switch_Case;

import java.util.Scanner;

public class C07_Homework2 {
    public static void main(String[] args) {

        /** TASK 2 :
         - Write a program that shows students English Level
         If Beginner display level=1
         If Elementary display level=2
         If Intermediate display level=3
         If Advance display level=4
         If Expert display level=5
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("I will show your English level. Choose your level below:\n" +
                "Beginner\n" +
                "Elementary\n" +
                "Intermediate\n" +
                "Advance\n" +
                "Expert");

        String choose = scan.nextLine();
        if (choose.equalsIgnoreCase("beginner")) {
            System.out.println("Your English level is \"LEVEL 1\"");

        } else if (choose.equalsIgnoreCase("elementary")) {
            System.out.println("Your English level is \"LEVEL 2\"");

        } else if (choose.equalsIgnoreCase("intermediate")) {
            System.out.println("Your English level is \"LEVEL 3\"");

        } else if (choose.equalsIgnoreCase("advance")) {
            System.out.println("Your English level is \"LEVEL 4\"");

        } else if (choose.equalsIgnoreCase("expert")) {
            System.out.println("Your English level is \"LEVEL 5\"");
        }


    }
}
