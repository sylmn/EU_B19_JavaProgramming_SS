package day10_IfStatements;

public class C02_If_Cont {
    public static void main(String[] args) {

        int x = 4;
        boolean a = (x <= 5);

        if (a) { //body olması önemli false olursa body nin içini tamamen artar
            System.out.println(x + " 5 e eşit yada küçüktür.");
            System.out.println(x++);
        }
        System.out.println(x);
    }
}
