package day09_Review;

public class C03_EscapeChars {
    public static void main(String[] args) {
        /*
        escape chars
        \b    backspace
        \n      new line
        \t     tab
        \r     satır başı
        \"

         */
        String name ="Yusuf";
        int birthDay=30;
        String monthOfBirth="August";
        int birthYear=1985;
        System.out.println(name+" was born on "+monthOfBirth+"\\"+birthDay+"\\"+birthYear);

    }
}
