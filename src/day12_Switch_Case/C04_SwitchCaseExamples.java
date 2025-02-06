package day12_Switch_Case;

import java.util.Scanner;

public class C04_SwitchCaseExamples {
    public static void main(String[] args) {
        /**
         Write a program to display traffic light colors using following logic:
         if code (R/r)—>"Red"
         if code (A/a)—>"Amber"
         if code (G/g)—>"Green"
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Trafik lambası rengini tek harf olarak gir : ");
        String color = scan.nextLine();
        //char color1=scan.nextLine().charAt(0);

        switch (color) {
            case "R": //'R'
                System.out.println("Red");
                break;
            case "r":
                System.out.println("Red");
                break;
            case "A":
                System.out.println("Amber");
                break;
            case "a":
                System.out.println("Amber");
                break;
            case "G":
                System.out.println("Green");
                break;
            case "g":
                System.out.println("Green");
                break;
            default:
                System.out.println("Trafik lambasında böyle bir renk yok");

        }
        /**
         * ////////////////////////////////////////
         *
         *                 Scanner renkGir1 = new Scanner(System.in);
         *                 System.out.print("Trafik lambası rengini tek harf olarak giriniz : ");
         *                 char color1 = renkGir1.nextLine().charAt(0);
         *
         *                 switch (color1){
         *                     case 'R' :
         *                         System.out.println("Red");
         *                         break;
         *                     case 'r' :
         *                         System.out.println("Red");
         *                         break;
         *                     case 'A' :
         *                         System.out.println("Amber");
         *                         break;
         *                     case 'a' :
         *                         System.out.println("Amber");
         *                         break;
         *                     case 'G' :
         *                         System.out.println("Green");
         *                         break;
         *                     case 'g' :
         *                         System.out.println("Green");
         *                         break;
         *                     default:
         *                         System.out.println("Trafik lambasında böyle bir renk yoktur");
         *         }
         */
    }
}
