package day27_StringClass2;

public class Homework4 {
    public static void main(String[] args) {
        /** 4. Soru:
         * Bir String ve bir index  numarası alan substring metodunu yazınız.
         * "Merhaba"     substring(str, 3)=haba
         * subString(String str,int index)
         */

        System.out.println("substring(\"Merhaba\",3) = " + substring("Merhaba", 3));
    }

    public static String substring (String str, int index){
        String result ="";
        for (int i = index; i <str.length() ; i++) {

            result+=str.charAt(i);
            str.substring(0,1);
        }
        return result;
    }
}
