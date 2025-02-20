package day28_StringReview;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class C01_Birthday {
    public static void main(String[] args) {
        //Dogum gununuzu belirtilen formata gore girdiginizde
        //haftanin hangi gunu dogdugunuzu gosteren kodu yaziniz

        System.out.println("Dogum gununuzu yyyy-MM-dd formatinda giriniz");
        Scanner sc =new Scanner(System.in);
        String dateStr = sc.nextLine();

        //Girilen Stringi tarih bilgisine donusturelim
        LocalDate date =LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("Your birthday "+dateStr+" is on "+dayOfWeek);

    }
}
