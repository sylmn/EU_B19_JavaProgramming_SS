package day15_forLoops;

public class C07_ForLoop6 {
    public static void main(String[] args) {
        for (byte b = 0; b <= 5 ; b++) {
            System.out.println("b = " + b);
        }

        for (double d = 1; d<=10 ; d+=0.5) {
            System.out.println("d = " + d);
        }
        // birden fazla codition kullanılabilir
        for (int i = 3; i < 10 && i > 2 ; i++) {
            System.out.println("i = " + i);
        }

        // çift sayac kullanılabilir

        for (int i = 0, k =0; i <= 5 && k <= 8; i++, k+=2) {
            System.out.println("i = " + i);
            System.out.println("k = " + k);
        }
    }
}
