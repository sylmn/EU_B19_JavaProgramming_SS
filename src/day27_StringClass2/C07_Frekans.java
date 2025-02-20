package day27_StringClass2;

import java.util.Scanner;

public class C07_Frekans {
    public static void main(String[] args) {
//        String str = "AABACCCDC";
//        char ch = 'C';
//        4

        Scanner input=new Scanner(System.in);
        System.out.println("String");
        String str=input.nextLine();
        System.out.println("Char");
        String ch=input.nextLine();


        int frekans=0;

        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i,i+1).contains(ch)){
                frekans+=1;
            }
        }

        System.out.println(frekans);

    }
}
