package day18_Rewiew_BranchmentAndLabelStatement;

public class C20_Homework_1 {
    public static void main(String[] args) {
        /**
         * Soru 1- While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari yazdirin.
         */

        int index = 10;
        while (true){
            if (index %7 == 0){
                System.out.print(index+" ");
            index++;}
            if (index == 99)
                break;
            index++;
        }
        System.out.println("\n2 basamaklı olup 7'ye bölünen sayılar bunlardır.");

    }
}
