package day15_ForLoops;

public class C01_ForLoop1 {
    public static void main(String[] args) {

        // 5 kere "Hello World" yazdırın

        String message = "Hello World";

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
        // for (;;)
        //    System.out.println("Sonsuza kadar yada hafıza dolana kadar yazar");

        //local variable sadece tanımlı olduğu blokta erişilen yapıdadır.
        if (message.equals("dd")) {
            int j = 0;
            System.out.println("j = " + j);
        }
        //  System.out.println("j = " + j); hata verir
    }
}
