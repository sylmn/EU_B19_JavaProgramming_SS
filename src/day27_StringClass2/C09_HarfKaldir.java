package day27_StringClass2;

public class C09_HarfKaldir {
    public static void main(String[] args) {
        System.out.println(harfKaldir("Adana", 'a'));
    }

    public static String harfKaldir(String str, char ch){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!=ch){
                result+=str.charAt(i);
            }
        }
        return result;
    }

}
//Kullanıcıdan bir kelime ve bir harf alın
// kelimenizin içinde bu harfin hepsi kaldırılmış şekilde string döndüren programı yazınız.
//(Merhaba, a) Merhb