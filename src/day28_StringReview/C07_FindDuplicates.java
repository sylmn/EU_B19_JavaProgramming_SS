package day28_StringReview;

public class C07_FindDuplicates {
    public static void main(String[] args) {

        System.out.println("findDublicate(\"Merhaba\") = " + findDublicate("Merhaba"));

    }

    public static String findDublicate (String str) {
        str=str.toLowerCase();
        String result ="";
        while (!str.isEmpty()){
            String firstLetter = str.substring(0,1);
            if (str.length()- str.replace(firstLetter,"").length()>1){
                result+=firstLetter;
            }
            str=str.replace(firstLetter,"");
        }

        return result;
    }
}
