package day18_Rewiew_BranchmentAndLabelStatement;

public class C03_Alfabe {
    public static void main(String[] args) {
        // Alfabenin tüm harflerini for loop kullanarak yazdırınız.

        for (char harf = 'A'; harf <= 'z'; harf++) {
            int siraNo = harf;
            System.out.println(harf + "--> " + siraNo);
        }
    }
}
