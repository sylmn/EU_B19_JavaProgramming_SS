package day21_ReturnMethods_MethodsOverloading;

public class C07_MethodOverloading2 {
    public static void main(String[] args) {
        /*CalculateArea isminde method yazın ve overload
        olsun. Birincisi kare-dikdörtgen alanını hesaplasın.
        İkincisi dairenin alanını hesaplasın. PI: 3,14*/
    }

    public static void calculateArea (int side1, int side2){
        System.out.println(side1*side2);
    }

        public static void calculateArea (int radius){
        System.out.println(3.14*radius*radius);
    }

    public static void calculateArea (double radius){
        System.out.println(3.14*radius*radius);
    }
}
