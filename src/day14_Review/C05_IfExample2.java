package day14_Review;

public class C05_IfExample2 {
    public static void main(String[] args) {
        // Elimizde bellirli sayıda 5 kiloluk ve 1 kiloluk un paketleri var
        // Müşterinin talep ettiği kilo sayıda paketi verip veremeyeceğimizi kontrol eden bir program yazın

        int beslikPaketSayısı=4;
        int birlikPaketSayisi=5;
        int talep=0;
        boolean karsilanabilirMi=false;

        if (talep>0){

            if (beslikPaketSayısı*5>=talep){
                if (birlikPaketSayisi>=talep%5){
                    karsilanabilirMi=true;
                }
            }else if (birlikPaketSayisi>=talep - beslikPaketSayısı*5){
                karsilanabilirMi=true;

            } if (karsilanabilirMi) {
                System.out.println(talep+" kilo talebiniz depolarımızda mevcuttur. ");
            }else {
                System.out.println("talebiniz depolarımızda mevcut değildir.");
            }
        }else {
            System.out.println("talebiniz anlaşılamadı");
        }





    }
}
