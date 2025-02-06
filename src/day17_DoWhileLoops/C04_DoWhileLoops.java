package day17_DoWhileLoops;

public class C04_DoWhileLoops {
    public static void main(String[] args) {
        /**
         * Do-While Loops
         * do {
         *   En az 1 kez calistiriliyor
         * } while(kosul)
         */

        do {
            // 1. step code
        } while (false); // 2.step kosul kontrol ediliyor, ve dogru ise kod calistirilmaya devam ediliyor

        int input = 5;
        do {
            if (input == 8) {
                System.out.println("Sayi 8 oldugu icin program sonlanacak!");
                break;
            }
            if (input == 7) {
                System.out.println("Sayi 7 oldugu icin continue calisacak!");
                input++;
                continue;
            }
            System.out.println("Girilen sayi " + input);
            input++;
        } while (input < 10);
    }
}
