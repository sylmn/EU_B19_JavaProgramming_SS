package Day06_Arithmetic_UnaryOperators;

public class C03_ClassTask2 {
    public static void main(String[] args) {
        /*
        int i=10;
        int j=3;
        int k=i/j;  // 3.56 --> eğer bir int değişkene atıyorsanız küsürattan sonrasını atar
        System.out.println("k = " + k);
         */


        //4500 dakika kaç saattir?

        int dk = 4530; //bana verilen bu değeri bir değişkene atamalıyım çünkü her seferinde değişebilir
        int saat = dk / 60;
        int kalanDk = dk % 60;
        System.out.println(dk + " dakika " + saat + " saat " + kalanDk + " dakikadır.");

        /*
        31502 saniye kaç saat kaç dakika kaç saniyedir?
         */

        int totalSecond=31502;
        int hour=totalSecond/3600;
        int minute=totalSecond%3600/60;
        int second=totalSecond%60;
        System.out.println(totalSecond+" saniye = "+hour+" saat "+minute+ " dakika "+second+" saniyedir.");



    }
}
