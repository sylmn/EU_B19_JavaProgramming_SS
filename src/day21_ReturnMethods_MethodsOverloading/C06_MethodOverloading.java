package day21_ReturnMethods_MethodsOverloading;

public class C06_MethodOverloading {
    public static void main(String[] args) {

        System.out.println(sum(2,5));
    }


    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
    /**
    public static int sum(int a, int b) {   // Burada return tipi de double olsa yine hata verir.
    return a + b;                         // parantez içi değişkenlerin tipi değişmeli eğer aynı isimli metod olacaksa
    }
     */

    public static int sum (int i, int i1, int i2){

        return i+i1+i2;
    }

    public static int sum (double num1, double num2){

        return  (int) (num1+num2);
    }
}
