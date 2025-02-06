package day19_Methods1;

public class C09_DeepDeeper {
    public static void main(String[] args) {
        System.out.println("start");
        deep();
        deep();
        deeper();
        C02_BuyukSayi.buyukSayi();
        System.out.println("finish");
    }
    public static void deep(){
        System.out.println("deep metodunun içi");
        deeper();
    }
    public static void deeper (){
        System.out.println("deeper metodunun içi");
    }
}
