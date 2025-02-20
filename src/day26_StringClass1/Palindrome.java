package day26_StringClass1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
        Herhangi bir metin tersten de ayni ise bu metne palindrom denir.
        Kullanicidan bir metin alin ve bu metin palindrom ise true degil ise false yazin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir metin girin, metnin palindrom olup olmadigini söyleyeyim");
        String girilen = scan.nextLine();

        String reverse = reverse(girilen);
        System.out.println(isPalindrome(girilen, reverse));
    }

    public static String reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static boolean isPalindrome(String girilen, String reverse) {
        boolean palindromMu;
        if (girilen.equalsIgnoreCase(reverse)) {
            palindromMu = true;
        } else {
            palindromMu = false;
        }
        return palindromMu;
    }
}
