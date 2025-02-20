package day26_StringClass1;

public class C07_Initials {
    public static void main(String[] args) {
        String str ="Ayse Betul";
        //A.B.

        char c1 = str.charAt(0);
        char c2 = str.charAt(str.indexOf(" ")+1);
        System.out.println(c1+"."+c2+".");


    }
}
