package day05_Variables_Cont;

public class C05_VariablesTypes {
    public static void main(String[] args) {

        int i = 49/10;
        System.out.println("i = " + i);
        // eğer int (byte /short).a atanan değerin ondalık kısmı varsa,
        // bu kısım atılır. yuvarlama yapılmaz.

        byte b = 9/2;
        System.out.println("b = " + b);

        char ch = 'A';

        String str = "Ahmet";

        char ch1 = 89;  //Y
        System.out.println("ch1 = " + ch1);

        char ch2 = 10+39;

        System.out.println("ch2 = " + ch2);

        char rose1 = '\uD83C';
        char rose2 = '\uDF39';
        System.out.println("Gül: " + rose1 + rose2);

        String name, surname;
        String name1 ; String surname1;

        int x = 10;

        x = x + 5; //eşitliğin sağ tarafı önce yapar

        System.out.println("x = " + x);

        x = x + 5;

        System.out.println("x = " + x);
    }
}
