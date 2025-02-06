package day21_ReturnMethods_MethodsOverloading;

public class C04_ReturnTheBiggest {
    public static void main(String[] args) {
        System.out.println(theBiggestOne(15,16));
    }


    /**
     * This method returns the biggest number of two given numbers
     * @param num1,num2
     * @return
     */
    public static int theBiggestOne (int num1,int num2){
        int max = 0;
        if (num1>num2){
            max = num1;
        }else {
            max = num2;
        }
        return max;

        //ikinci yol
        //return (num1>num2) ? num1:num2;
    }

}
