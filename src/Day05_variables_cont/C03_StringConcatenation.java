package Day05_variables_cont;

public class C03_StringConcatenation {
    public static void main(String[] args) {
/*
1.öncelik () parantez içi
2.öncelik çarpma/bölme
3. öncelik toplama/çıkarma
* işlem sırası solda sağa
* Stringe dönüştümü artık toplama olmaz.
*/

        String name="Aslı";
        String surname="Yılmaz";
        System.out.println(name+surname);
        System.out.println(name+3);
        System.out.println(3+name+3);
        System.out.println(3+3+name);
        System.out.println(3+3+name+3+3);//6Aslı33
        System.out.println(3+3+name+3*3);//6Aslı9

        String s="";
        int i=3;
        String s1=i+s;
        System.out.println("s1+5 = " + s1+5);//35 artık String oldu.
    }
}
