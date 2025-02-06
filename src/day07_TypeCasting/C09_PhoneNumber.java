package day07_TypeCasting;

import java.util.Scanner;

public class C09_PhoneNumber {
    public static void main(String[] args) {
        /** 1. create a class named Phone Number and declare the following variables:
         countryCode, areaCode, localNumber
         Ask user to enter each values. Use scanner class and get them one by one
         use string concatenation to display the phone number than
         ex:
         countryCode = 90
         areaCode = 532
         localNumber = 1234500

         output:
         Your phone number is +(90)532-1234500
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the country code of your phone number   : ");
        int countryCode = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter the area code of your phone number      : ");
        int areaCode = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter the local number of your phone number   : ");
        int localNumber = scan.nextInt();

        System.out.println("\n Your phone number is +(" + countryCode + ")" + areaCode + "-" + localNumber);
    }
}
