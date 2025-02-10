package day21_ReturnMethods_MethodsOverloading;

import java.util.Scanner;

public class C10_Task1 {
    public static void main(String[] args) {
        /**
         * Task: Create return  method that can check if a person is eligible to vote
         * Ex:
         * eligibleToVote(19, "TR");
         * output:
         * You are not eligible to vote!
         */
        System.out.println("mesage() = " + mesage());
    }

    public static String mesage (){
        Scanner scan = new Scanner(System.in);
        System.out.print("Adinizi girin : ");
        String adi = scan.nextLine();
        System.out.print("yasinizi girin : ");
        int yas = scan.nextInt();
        scan.nextLine();
        System.out.println("TR vatansadi misiniz? evet/hayir");
        String vatandasTr = scan.nextLine().toLowerCase();
        String message;

        if (yas>=19 && vatandasTr.equals("evet")) {
        message = adi+" is eligible to vote.";
        } else {
            message = adi+ ", you are not eligible to vote!";
       }
        return message;
    }
}
