package day07_TypeCasting;

import java.time.Month;
import java.util.Scanner;

public class C10_BirthDay {
    public static void main(String[] args) {
        /* 3. Create a class named BirthDay and create the following variable and
        get the variables INORDER as name, birthDay(int), birthMonth(String), birthYear(int)
        (Degiskenler kullanicidan sirasiyla alinacak). Use concatenation to display the birthday
        of the person.

        if the user enters the followings
        name = "John"
        birthDay = 23
        Month = "April"
        birthYear = 1990;
        date convention 10/15/2020

        output:
        1. John was born on April/23/1990
        2. John was born on "April\23\1990"
         */
        Scanner scan =new Scanner(System.in);

        System.out.print("Please enter your name : ");
        String name=scan.nextLine();

        System.out.print("Enter the day of your birth : ");
        int birthDay=scan.nextInt();
        scan.nextLine();

        System.out.print("Enter your month of birth : ");
        String month= scan.nextLine();

        System.out.print("Enter your year of birth : ");
        int birthYear= scan.nextInt();
        scan.nextLine();

        System.out.println("1. "+name+" was born on "+month+"/"+birthDay+"/"+birthYear);
        System.out.println("2. "+name+" was born on "+"\""+month+"\\"+birthDay+"\\"+birthYear+"\"");
    }
}
