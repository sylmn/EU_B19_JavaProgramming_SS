package day22_ClassObject;

public class Math2 {

    public static int pow (int num1, int num2){
        int result = 1;
        for (int i = 1; i <=num2 ; i++) {
            result*=num1;
        }
        return num1;

    }

    public int pow2 (int num3, int num4){
            int result = 1;
        for (int i = 1; i <=num4 ; i++) {
            result*=num3;
        }

        return result;
    }
}
/*
TASK
        Math2
        pow methodu yazın--  pow(num1, num2)
            iki sayı alacak ve birinci sayı taban ikinci sayı kuvvet olacak
            2 üzeri 4 = 2*2*2*2


1. obje oluşturmadan methodu  farklı bir  Main Class da çağırın
2. obje oluşturarak methodu farklı bir Main class da çağırın
 */