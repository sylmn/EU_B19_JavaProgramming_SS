package day20_CustomMethods;

public class C05_PracticeWithReturn {


    public static void main(String[] args) {

        System.out.println(oddNumber());

        if (isEligibleToBuyAlcohol(24)) {
            System.out.println("Yapma arkadaş alkol zararlıdır");
        }
    }

    /**
     * this method returns to the odd numbers btw 1-100
     *
     * @return
     */

    public static String oddNumber() {
        String result = "";
        for (int i = 1; i <= 100; i += 2) {
            result += i + " ";
        }
        return result;
    }

    //	3. create a method that can check if a person is eligible to buy alcohol

    public static boolean isEligibleToBuyAlcohol(int age) {
        boolean isEligible;

        if (21 <= age) {
            isEligible = true;
        } else {
            isEligible = false;
        }
        return isEligible;
    }
}
