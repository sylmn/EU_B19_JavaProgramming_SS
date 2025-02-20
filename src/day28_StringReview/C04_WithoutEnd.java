package day28_StringReview;

public class C04_WithoutEnd {
    public static void main(String[] args) {
        System.out.println(withoutBegAndEnd("Merhaba"));
        System.out.println("withoutBegAndEnd(\"\") = " + withoutBegAndEnd(""));
        System.out.println("withoutBegAndEnd(\"av\") = " + withoutBegAndEnd("av"));
        System.out.println("withoutBegAndEnd(\"avlanmak\") = " + withoutBegAndEnd("avlanmak"));

    }
   /**
    Given a string, return a version without both the first and
    last char of the string. The string may be any length, including 0.

    withouEnd2("Hello") → "ell"
    withouEnd2("abc") → "b"
    withouEnd2("ab") → ""
    withouEnd2("a") → ""
    */
   public static String withoutBegAndEnd (String str){

       if (str.length()<=2) return "";
       return str.substring(1,str.length()-1);
   }
}
