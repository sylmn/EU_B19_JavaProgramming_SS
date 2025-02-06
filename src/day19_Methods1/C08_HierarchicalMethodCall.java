package day19_Methods1;

public class C08_HierarchicalMethodCall {
    public static void main(String[] args) {
        System.out.println("start");
        displayMessage();
        calculation();
        System.out.println("finish");
    }
    public static void displayMessage(){
        System.out.println("Hello world");
        calculation ();
        System.out.println("message displayed");
        //displayMessage(); sonsuz döngüye girer
    }

    private static void calculation() {
        System.out.println(5*8/2+9);
    }

}
