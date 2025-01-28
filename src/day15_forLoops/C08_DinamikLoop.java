package day15_forLoops;

public class C08_DinamikLoop {
    public static void main(String[] args) {

        int max = 5050;
        int toplam = 0;
        int i;

        for (i = 0; toplam < max; i++) {
            toplam+=i;
        }
        System.out.println("toplam = " + toplam);
        System.out.println("i = " + i);


    }
}
