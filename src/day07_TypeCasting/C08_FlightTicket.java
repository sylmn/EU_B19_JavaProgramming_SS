package day07_TypeCasting;

import java.util.Scanner;

public class C08_FlightTicket {
    public static void main(String[] args) {
        /*
        TASKS:
        1. create a class named FlightTicket, and declare the following
            variables:
            1. from
            2. to
            3. ticketPrice
            use concatenation to display the full info of the ticket

            ex:
            From Ankara to Istanbul is 599TL
            */
        Scanner scan=new Scanner(System.in);
        System.out.println("Which airport do you want to depart from? ");
        String from = scan.nextLine();

        System.out.println("Which airport do you want to arrive? ");
        String to=scan.nextLine();

        System.out.println("Enter the estimated ticket price, specifying the currency (e.g., Tl, USD or EUR).");
        String ticketPrice=scan.nextLine();

        System.out.println("From "+from+" to "+to+" is "+ ticketPrice);

    }
}
