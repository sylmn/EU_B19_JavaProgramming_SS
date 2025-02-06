package day15_ForLoops;

public class C07_ForLoop4 {
    public static void main(String[] args) {

        // tüm nümerik data tipleri loopta kullanılabilir;

        for (byte b = 0; b <= 5; b++) {
            System.out.println("b = " + b);
        }

        //double kullanalalım

        for (double d = 1; d <= 10; d += 0.5) {
            System.out.println("d = " + d);
        }
        System.out.println("-------------");

        // birden fazla condition kullanılabilir
        for (int i = 3; i < 10 && i > 2; i++) {
            System.out.println("i = " + i);
        }

        // başlangıç değeri loop dışından gelebilir
        int x = 5;
        for (x = 10; x < 20; x++) {
            System.out.println(x);
        }

        // artırma ya da eksiltme kod blokunun içinde de olabbilir
        for (int i = 10; i >= 0; ) {
            i--;
            System.out.println(i);
        }

        //çift sayaç (index) kullanılabilir
        for (int i = 0, k = 0; i <= 5 && k <= 8; i++, k += 2) {
            System.out.println("i = " + i);
            System.out.println("k = " + k);
        }

        // for i loopta sadece for kelimesi ve iki adet ;; koymak zorunludur
        for (; ; ) {
        }
    }
}
