package day04_variables;

public class C02_VariablePractice {
    public static void main(String[] args) {

        byte sinifMevcudu=10;
        System.out.println(sinifMevcudu);

        short num1=30000;
        int num2=814578;
        System.out.print("Sınıf mevcudu:");
        System.out.println(sinifMevcudu);
        System.out.println("--------------");  /*"------".sout -> yapınca değişkeni println parantezinin
                                                içine alır*/

        System.out.println(5+4); //5 ile 4 ü toplar

        System.out.println("Sınıf Mevcudu = "+sinifMevcudu);
        System.out.println("sinifMevcudu = " + sinifMevcudu); //soutv ile otomatik

        char ch1='A';
        System.out.println("ch1 = " + ch1);
        System.out.println();
        System.out.println("ch1 = " + ch1);

        boolean isMarried=true;
        System.out.println("isMarried = " + isMarried); //Burada true yada false yazılmaz genelde
        //öğretmek için mesela 4<5 dersen true çıkar
        boolean isGros=4<5;
        System.out.println("isGros = " + isGros);

        //PI=3,14
        double PI=3.14; //constants names can be all capital
        float kalemUcu=0.5f;
        System.out.println("kalemUcu = " + kalemUcu);

        String str="Eurotech Study is good";
        System.out.println("str = " + str);  //ctrl+alt+l aynı hizaya sokar


    }
}
