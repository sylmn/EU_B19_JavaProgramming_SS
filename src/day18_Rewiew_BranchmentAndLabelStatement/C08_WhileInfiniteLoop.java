package day18_Rewiew_BranchmentAndLabelStatement;

public class C08_WhileInfiniteLoop {
    public static void main(String[] args) {
        int count = 10;

        while (true){
            System.out.println("count : "+count);
            count--;

            if (count == 0 ) break;
        }
    }
}
