package day21_ReturnMethods_MethodsOverloading;

public class C03_NameOfMonth {
    public static void main(String[] args) {
        System.out.println("nameOfMonth(3) = " + nameOfMonth(3));
    }


    /**
     * This method give the name of the month
     * @param num
     * @return
     */

    public static String nameOfMonth (int num){

        String ay ="";

        switch (num){
            case 1 : ay = "Ocak"; break;
            case 2 : ay ="Şubat"; break;
            case 3 : ay = "Mart"; break;
            case 4 : ay = "Nisan"; break;
            case 5 : ay = "Mayıs"; break;
            case 6 : ay = "Haziran"; break;
            case 7 : ay ="Temmuz"; break;
            case 8 : ay ="Austos"; break;
            case 9 : ay = "Eylül"; break;
            case 10 : ay = "Ekim"; break;
            case 11 : ay = "Kasım"; break;
            case 12 : ay = "Aralık"; break;
            default: System.out.println("Geçersiz giriş");
        }
        return ay;
    }
}
