package day23_Review;

public class C01_DebuggingMethodCall {
    public static void main(String[] args) {

        System.out.println("main metod icerisindeyim satir 6");
        metod();
        System.out.println("main metod icerisindeyim satir 8");
        metod();
        System.out.println("main metod icerisindeyim satir 10");
        metod();
        System.out.println("main metod icerisindeyim satir 12");
    }


    public static void metod() {
        System.out.println("metod icerisindeyim satir 18");
    }
}
