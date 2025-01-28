package day15_forLoops;

public class C05_ForLoop5 {
    public static void main(String[] args) {

        // 1'den 100'e kadar olan tek ve çift sayıların ayrı ayrı toplamlarını bulan programı yazın.

        int toplamTek=0, toplamCift = 0;

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                toplamCift += i;
                ;
            } else {
                toplamTek += i;
            }
        }
        System.out.println(toplamCift);
        System.out.println(toplamTek);

        // ternary ile boolean ? true : false;

        int tekSayilar=0, ciftSayilar =0;

        for (int i = 1; i <= 100 ; i++) {

                tekSayilar += (i % 2 != 0) ? i : 0;
                ciftSayilar += (i % 2 == 0) ? i : 0; }
        System.out.println(tekSayilar +" "+ciftSayilar);
    }
}

