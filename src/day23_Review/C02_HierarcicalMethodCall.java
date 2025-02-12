package day23_Review;

public class C02_HierarcicalMethodCall {
    public static void main(String[] args) {
        System.out.println("main method");
        mesajGoster();
        System.out.println("tekrar main metod");
    }

    public static void mesajGoster() {
        System.out.println("Merhaba dünya");
        hesapMakinasi();
        System.out.println("tekrar mesajGoster metodu");
    }

    public static void hesapMakinasi() {
        System.out.println(10 * 3 / 2 + 1);
    }
}
