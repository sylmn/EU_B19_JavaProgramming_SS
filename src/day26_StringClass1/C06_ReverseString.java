package day26_StringClass1;

public class C06_ReverseString {
    public static void main(String[] args) {
        String str = "EY EDIP ADANADA PIDE YE";

        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println("reverse = " + reverse);
    }
}
