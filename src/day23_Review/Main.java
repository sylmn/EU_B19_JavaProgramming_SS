package day23_Review;

public class Main {
    public static void main(String[] args) {
        MobilePhone mbPhobe=new MobilePhone();
        mbPhobe.marka="nokia";
        mbPhobe.model="S42";
        mbPhobe.renk="beyaz";
        mbPhobe.fiyat=400;
        mbPhobe.boyut=2;
        mbPhobe.kapasite=128;
        mbPhobe.mesajAtabiliyorMu=true;
        mbPhobe.ara();
        mbPhobe.mesajAt();
        mbPhobe.fotoCek();
        mbPhobe.interneteBaglan();

        Cake cake1= new Cake();
        cake1.kekYapan="Ahmet";
        cake1.yumurtaliMi=false;
        cake1.agirlik=1;

        Cake cake2= new Cake();
        cake2.kekYapan="Ayse";
        cake2.yumurtaliMi=true;
        cake2.agirlik=2;
    cake1.kekYe();
    cake1.kekYe();
        System.out.println("cake1.dilim = " + cake1.dilim);
        System.out.println("cake2.dilim = " + cake2.dilim);

    }
}
