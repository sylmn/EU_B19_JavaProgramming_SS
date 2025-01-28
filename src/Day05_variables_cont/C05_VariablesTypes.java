package Day05_variables_cont;

public class C05_VariablesTypes {
    public static void main(String[] args) {
        char rose1 = '\uD83C';
        char rose2 = '\uDF39';
        System.out.println("Gül: " + rose1 + rose2);
        
        int x=10;
        x=x+5; //eşitliğin sağ tarafı önce yapar
        System.out.println("x = " + x);
        x=x+5;
        System.out.println("x = " + x);

    }
}
