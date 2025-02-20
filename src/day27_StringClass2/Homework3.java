package day27_StringClass2;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        /** 3. Soru:
         * Kullanıcıdan bir kelime alın ve her harfini 3 defa yazdırın.
         * Merhaba MMMeeerrrhhhaaabbbaaa Ali AAAllliii
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir kelime girin ve her harfini uc defa yazdirayim");
        String girilen = scan.next();
        System.out.println("girilen = " + girilen);
        String result ="";


        System.out.println("tripleWord(\"ali\") = " + tripleWord(girilen));
        System.out.println("tripleWord_1(girilen) = " + tripleWord_1(girilen));
    }
    public static String tripleWord (String str){
        String result ="";
        for (int i = 0; i <str.length() ; i++) {
            result+=""+str.charAt(i)+str.charAt(i)+str.charAt(i);
        }
        return result;
    }
    public static String tripleWord_1 (String str){
        String result ="";
        for (int i = 0; i <str.length() ; i++) {
            String temp = str.substring(i,i+1);
            result=result.concat(temp.repeat(3));
        }
        return result;
    }
}
