package day28_StringReview;

public class C05_MiddleTwo {
    public static void main(String[] args) {

        System.out.println("middleTwo(\"String\") = " + middleTwo("String"));
        System.out.println("middleTwo(\"code\") = " + middleTwo("code"));
        System.out.println("middleTwo(\"uc\") = " + middleTwo("uc"));
        System.out.println("middleTwo(\"merhaba\") = " + middleTwo("merhaba"));
        System.out.println("middleTwo(\"\") = " + middleTwo(""));
    }
    /**
Given a string of even length, return a string made of the
middle two chars, so the string "string" yields "ri".
The string length will be at least 2.

middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
*/

    public static String middleTwo (String str){

        if (str.length()%2==1) return "";
        if (str.length()==0) return "";
        int middleIndex = str.length()/2;
        return str.substring(middleIndex-1,middleIndex+1);
    }
}
