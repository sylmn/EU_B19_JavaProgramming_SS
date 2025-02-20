package day27_StringClass2;

public class C04_Empty {
    public static void main(String[] args) {
 /*
        Write a method that asks user to enter a string.  --- Kullanıcıdan bir string alın
        if the string is empty, print: string is empty  ---   boş ise --- String is empty
        if the string has more than 3 characters, print the last three characters   -- 3 den fazla karakteri varsa son 3 karakteri yazdırsın
        if the string has less than or equal 3 characters, print the string itself  -- 3 ve daha az karakteri varsa stringin kendisini yazdırsın

        ali---> ali
        ak----->ak
        ankara----> ara
        ""----> empty
         */

        String str="Merhaba Dünya";

        if (str.length()==0){
            System.out.println("empty");
        } else if (str.length()>3) {
            System.out.println(str.substring(str.length()-3));
        }else {
            System.out.println(str);
        }

    }
}
