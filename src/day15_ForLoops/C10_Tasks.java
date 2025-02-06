package day15_ForLoops;

public class C10_Tasks {
    public static void main(String[] args) {
        /**
         * 1 2 3 4 5
         * 1 2 3 4 5
         * 1 2 3 4 5
         */
        // outer loop
        for (int i = 1; i < 4; i++) {

            // inner loop
            for (int j = 1; j < 6; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("////////////////////////////////");

        /**
         *
         * 1 2 3 4 5            kutu 1    fındık sayısı 1-5
         * 1 2 3 4              kutu 2    fındık sayısı 1-4
         * 1 2 3                kutu 3    fındık sayısı 1-3
         * 1 2                  kutu 4    fındık sayısı 1-2
         * 1                    kutu 5    fındık sayısı 1
         *
         */
// outer loop
        for (int i = 1; i < 6; i++) {

            // inner loop
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("////////////////////////////////");

        /**
         *      x x x x x          kutu 1   fındık sayısı 1-5
         *      x x x x            kutu 2   fındık sayısı 1-4
         *      x x x              kutu 3   fındık sayısı 1-3
         *      x x                kutu 4   fındık sayısı 1-2
         *      x                  kutu 5   fındık sayısı 1
         *
         */
        // outer loop
        for (int i = 1; i < 6; i++) {

            // inner loop
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
        System.out.println("////////////////////////////////");
        /**
         *      x
         *      x x
         *      x x x
         *      x x
         *      x
         */
// outer loop
        for (int i = 1; i < 6; i++) {
            if (i <= 3) {
                // inner loop 1
                for (int j = 1; j <= i; j++) {
                    System.out.print("x ");
                }
                System.out.println();
            } else {
                for (int k = 5; k >= i; k--) {
                    System.out.print("x ");
                }
                System.out.println();
            }
        }

    }
}
