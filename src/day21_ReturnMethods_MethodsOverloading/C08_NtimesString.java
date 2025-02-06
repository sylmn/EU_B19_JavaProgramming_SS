package day21_ReturnMethods_MethodsOverloading;

public class C08_NtimesString {
    public static void main(String[] args) {
        stringNTimes("Ali", 5);
        System.out.println("stringTimes(\"Ayse\",3) = " + stringTimes("Ayse", 3));
    }

    public static void stringNTimes(String str, int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(str);
        }
        System.out.println();
    }

    public static String stringTimes(String str, int num) {
        String result = "";
        for (int i = 0; i < num; i++) {
            result += str;
        }
        return result;
    }
}
