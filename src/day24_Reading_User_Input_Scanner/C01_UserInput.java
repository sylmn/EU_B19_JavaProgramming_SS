package day24_Reading_User_Input_Scanner;

import java.util.Scanner;


public class C01_UserInput {
    public static void main(String[] args) {

        System.out.println("User Input in Java");

        Scanner klavye = new Scanner(System.in);

        System.out.print("Klavyeden isminiz giriniz : ");
        String name = klavye.nextLine();

        System.out.println("İsminiz : " + name);
    }
}
