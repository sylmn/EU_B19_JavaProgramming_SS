package day15_forLoops;

public class C04_ForLoop4 {
    public static void main(String[] args) {
        //1 ile 100 arasında 5 ile kalansız bölünenleri yazdır


        for (int i = 1; i <= 100 ; i++) {
            if (i%5==0){
                System.out.println(i);
            }
        }
        System.out.println("// 2. yol");
        for (int i = 5; i <=100 ; i+=5) {
            System.out.println("i = " + i);
        }
        //1-50 arası 6 ya tam bölünen sayıların toplamı
        int toplam=0;
        for (int i = 1; i <= 50 ; i++) {
            if (i%6==0) {
            toplam=i+toplam;}
        }
        System.out.println(toplam);

        System.out.println("// 2. yol");
        int toplam2=0;
        for (int i = 6; i <=50 ; i+=6) {

            toplam2+=i;
        }
        System.out.println("toplam2 = " + toplam2);
    }
}
