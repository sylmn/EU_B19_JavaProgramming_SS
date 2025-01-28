package day10_IfStatements;

public class C06_If_ElseIf {
    public static void main(String[] args) {

        int a=40;
        int b=30;

        if (a>b){
            System.out.println("a büyüktür b");
        } else if(a==b){
            System.out.println("a eşittir b");
        }else {
            System.out.println("a küçüktür b");
        }

        System.out.println("program bitti");

    }
}
