package day20_CustomMethods;

import java.util.Scanner;

public class C04_MethodsTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many dollars do you have? I'll give you the exchange rate in TL.");
        int amount = scan.nextInt();
        convertDollarToTL(amount);

        System.out.println();

        System.out.println("What amount of KG do you want to convert to LB?");
        double amountOfKg = scan.nextInt();
        double convertedLb=convertKgToLb(amountOfKg);
        System.out.println(amountOfKg+" Kg converted to "+convertedLb+" Lb");

        System.out.println();

        System.out.println("Give me a number that I will say 'Pozitive' or 'Negative' or 'Zero'");
        int number = scan.nextInt();
        String result = determineNegPozOrZero(number);
        System.out.println(number+" is "+result);
    }
    /**
     * This method can convert dollar to TL. Rate: 35.98 TL
     * @param amount
     */
    public static void convertDollarToTL(int amount){
        double convertedAmount = amount*35.98;
        System.out.println(amount+" dollars is equivalent to "+convertedAmount+" TL dir. ");
    }

    /**
     * This method can convert kg to lb. kg*2.2=lb
     * @param kgAmount
     */
    public static double convertKgToLb (double kgAmount){

        double lb = kgAmount*2.2;
        return lb;
    }

    /**
     * This method can determine if the given integer is positive, negative or zero
     * @param number
     */
    public static String determineNegPozOrZero (int number){

        String mesaj = number > 0 ? "Pozitiv": number ==0 ? "Zero": "Negative";
        return mesaj;
    }
}
