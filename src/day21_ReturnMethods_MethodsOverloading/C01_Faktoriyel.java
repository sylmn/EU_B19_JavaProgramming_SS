package day21_ReturnMethods_MethodsOverloading;

public class C01_Faktoriyel {
    public static void main(String[] args) {
        /**
         * Verdiğiniz bir sayının faktoryileni hesaplayın
         * 0! = 1      yada     4! = 4*3*2*1
         */
        System.out.println("faktoriel(5) = " + faktoriel(5));
    }

    /**
     * This method returns the faktorial value of a given number
     * @param number
     * @return
     */
    public static double faktoriel(int number) {
        double sonuc = 1;
        for (int i = 1; i <= number; i++) {
            sonuc *= i;
        }
        return sonuc;
    }
}
