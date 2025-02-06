package day20_CustomMethods;

public class C01_CustomMethods {
    public static void main(String[] args) {
        helloWorld5Times();
        System.out.println("------------------");
        countDownTenToZero();
        System.out.println();
        countDownTenToZero2();
        System.out.println();
        evenNumbers();
    }

    public static void helloWorld5Times() {

        for (int i = 1; i <= 5; i++) { // initialition -- condition -- increment or decrement
            System.out.println("Hello world");
        }
    }

    public static void countDownTenToZero() {
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void countDownTenToZero2() {
        int i = 10;
        while (i > 0) {
            System.out.print(i + " ");
            i--;
        }
    }

    public static void evenNumbers() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

}
