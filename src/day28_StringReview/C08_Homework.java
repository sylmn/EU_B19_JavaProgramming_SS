package day28_StringReview;

public class C08_Homework {
    public static void main(String[] args) {
         /** 1-Given a string and an int n, return a string
          * made of the first and last n chars from the string.
          * The string length will be at least n.
          * nTwice("Hello", 2) → "Helo"
          * nTwice("Chocolate", 3) → "Choate"
          * nTwice("Chocolate", 1) → "Ce"
          */

        System.out.println("nTwice(\"Mem\",2) = " + nTwice("Mem", 2));
    }

    public static String nTwice (String str, int n){
        String result = "";
        if (str.length()<=2){
            result=str;
        }else {
            result = str.substring(0,n)+str.substring(str.length()-n);
        }
        return result;
    }
}
