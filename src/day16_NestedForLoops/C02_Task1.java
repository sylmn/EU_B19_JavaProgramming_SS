package day16_NestedForLoops;

public class C02_Task1 {
    public static void main(String[] args) {
        /**
         * 1 yil = 12 ay
         * 1 ay = 30 gün varsayimina göre
         * 40 yil yasamis birisi
         *  - Kac ay yasamistir?
         *  - Kac gün yasamistir?
         */
        int yas = 40;
        int yilSayisi=0;
        int aySayisi=0;
        int günSayisi=0;

        for(int yil=1; yil<41; yil++){
            yilSayisi++;

            for(int ay=1;ay<13;ay++){
                aySayisi++;

                for(int gün=1; gün < 31; gün++){
                    günSayisi++;
                }
            }
        }

        System.out.println("yilSayisi = " + yilSayisi);
        System.out.println("aySayisi = " + aySayisi);
        System.out.println("günSayisi = " + günSayisi);
    }
}
