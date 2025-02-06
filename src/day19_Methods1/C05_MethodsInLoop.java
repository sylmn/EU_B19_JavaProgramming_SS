package day19_Methods1;

public class C05_MethodsInLoop {
    public static void main(String[] args) {
        System.out.println("loop öncesi");
        for (int i = 1; i <=5 ; i++) {
            displayMessage();
            System.out.println("loop içi");
        }
        System.out.println("loop sonrası");
    }
    public static void displayMessage (){
        System.out.println("Message is displayed");
    }
}
