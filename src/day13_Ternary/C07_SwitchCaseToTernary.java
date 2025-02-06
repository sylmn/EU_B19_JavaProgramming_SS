package day13_Ternary;

import java.util.Scanner;

public class C07_SwitchCaseToTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int not;
        String harfNotu;

        System.out.print("Lütfen notunuzu giriniz : ");
        not = sc.nextInt();

        //switch-case

        switch (not) {
            case 90:
                harfNotu = "Geçme notunuz - A";
                break;
            case 80:
                harfNotu = "Geçme notunuz - B";
                break;
            case 70:
                harfNotu = "Geçme notunuz - C";
                break;
            case 60:
                harfNotu = "Geçme notunuz - D";
                break;
            case 50:
                harfNotu = "Geçme notunuz - E";
                break;
            default:
                harfNotu = "Geçersiz not / Kaldınız";
        }

        System.out.println("harfNotu = " + harfNotu);
        System.out.println("---------------------------");

        //ternary

        harfNotu = (not >= 90) ? "Geçme notunuz - A"
                : (not >= 80) ? "Geçme notunuz - B"
                : (not >= 70) ? "Geçme notunuz - C"
                : (not >= 60) ? "Geçme notunuz - D"
                : (not >= 50) ? "Geçme notunuz - E"
                : "Geçersiz not / Kaldınız";

        System.out.println("harfNotu = " + harfNotu);

    }
}
