package day05_Variables_Cont;

public class C03_StringConcatenation {
    public static void main(String[] args) {
        /**
         * 1. Öncelik () parantez içi
         * 2. Öncelik çarpma/bölme
         * 3. Öncelik toplama/çıkarma
         * İşlem sırası solda sağa
         * Stringe dönüştümü artık toplama olmaz.
        */

        String name = "Aslı";
        String surname = "Yılmaz";
        System.out.println(name + surname);  //AslıYılmaz

        System.out.println(name + 3); //Aslı3

        System.out.println(3 + name);  //3Aslı

        System.out.println(3 + name + 3); //3Aslı3

        System.out.println(3 + 3 + name); //6Aslı

        System.out.println(3 + 3 + name + 3 + 3); //6Aslı33

        System.out.println(3 + 3 + name + 3 * 3); //6Aslı9

        // System.out.println(3 * name - 6); bu şekilde kullanılmaz.

        System.out.println(3 * 3 + name +(3-1) * 5); //9Aslı10

        //Aslı Yılmaz

        System.out.println(name + " " + surname);

        String s = "";
        int i = 3;

        String s1 = i + s;
        System.out.println("s1 = " + s1 + 5); //35 artık String oldu.

        String str = "2528";
    }
}
