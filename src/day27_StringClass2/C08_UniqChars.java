package day27_StringClass2;

public class C08_UniqChars {
    public static void main(String[] args) {

        String str="AABBCC!!";
        String result="";




        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                result+=str.charAt(i);
            }
        }

        if(result.length()==0){
            System.out.println("Uniq karakter yoktur");
        }


        System.out.println(result);


    }
}
/*Write a program that can return the unique characters from a String

        Ex:
        input:AABCCDDDE
        output:BE

        input:AA 1212BC
        output: BC

        input:AABC!! ??1233
        output:BC 12


        Hint: You will need indexOf() and lastIndexOf()
        if the first and last index numbers of the character are same, then it's unique
        */