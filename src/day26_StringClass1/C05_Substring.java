package day26_StringClass1;

public class C05_Substring {
    public static void main(String[] args) {
        String str = "Merhaba Dunya Hava Cok Guzel";
        //            1234567890123456789012345678
        System.out.println("str.length() = " + str.length());
        System.out.println("str.substring(12) = " + str.substring(12));
        System.out.println("str.substring(12,25) = " + str.substring(12, 25));
        //12.index dahil ama 25. index haric tutuluyor.
        System.out.println("str.substring(23) = " + str.substring(23));
        System.out.println("str.substring(str.length()-5) = " + str.substring(str.length() - 5));

        System.out.println("str.substring(str.length()-1) = " + str.substring(str.length() - 1));
        //son harfi aliriz

        //System.out.println("str.substring(5,3) = " + str.substring(5, 3)); //hata verir

    }
}
