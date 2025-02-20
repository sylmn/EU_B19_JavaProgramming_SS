package day28_StringReview;

public class C03_Reverse {
    public static void main(String[] args) {

        System.out.println("reverse(\"katakulli\") = " + reverse("katakulli"));
        System.out.println("reverse1(\"merhaba\") = " + reverse1("merhaba"));
        System.out.println("reverse2(\"deneme\") = " + reverse2("deneme"));
    }

    public static String reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static String reverse1(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse.concat(str.substring(i, i + 1)); //+= yerine concat yazdik.+= daha performansli
        }
        return reverse;
    }

    public static String reverse2(String str) {
        String reverse = "";

        while(!str.isEmpty()){
            String lastLetter = str.substring(str.length()-1);
            reverse+=lastLetter;
            str = str.substring(0,str.length()-1);
        }
        return reverse;
    }
}
