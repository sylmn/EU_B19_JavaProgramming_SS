package day03_Comments_EscapeChars;

public class C05_EscapeCharacters {
    public static void main(String[] args) {

        System.out.println("Merhaba \\ Dünya");

        /**
            \n   --> Yeni satır   new line
            \t  ---> bir tab boşluk bırakır
            \b   --> Backspace
            \"   -->  "  double quote
            \r   ---> satır başı
            \\   --> \ back slash

         */


        System.out.println("One\tTwo\tThree");
        System.out.println("One\bTwo\bThree");
        System.out.println("One\nTwo\nThree");

        System.out.println("---------------");
        System.out.println("One Two\rThree");

        System.out.println("-------------------");

        System.out.println("\"One\" \"Two\" \"Three\"");
        System.out.println("One \\Two\\ Three");

    }
}
// Metin "Merhaba Dünya"   "One""Two""Three"