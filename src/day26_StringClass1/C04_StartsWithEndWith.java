package day26_StringClass1;

public class C04_StartsWithEndWith {
    public static void main(String[] args) {
        String str = "Hersey cok guzel";
        System.out.println("str.startsWith(\"H\") = " + str.startsWith("H"));
        System.out.println("str.startsWith(\"h\") = " + str.startsWith("h"));
        System.out.println("str.startsWith(\"Her\") = " + str.startsWith("Her"));

        System.out.println("str.endsWith(\"\") = " + str.endsWith(""));
        System.out.println("str.startsWith(\"\") = " + str.startsWith(""));
        //burada her iki metod da boolean verir


    }
}
