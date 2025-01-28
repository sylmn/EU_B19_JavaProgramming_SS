package day09_Review;

public class C06_LOgicalOperatorsExample {
    public static void main(String[] args) {
        //18+, Turkish
        //age>=18
        String name="Süleyman";
        int age=34;
        String citizenship="Turkish";

        boolean isEligibleToVote=age>=18 &&citizenship.equalsIgnoreCase("Turkish");
        boolean isEligibleToVote1=age>=18 &&citizenship.equals("Turkish");
        System.out.println("isEligibleToVote1 = " + isEligibleToVote1);
        System.out.println("isEligibleToVote = " + isEligibleToVote);

        // findexScore >1100
        // income >=25000
        // age >=18 age <70m

        String name2="Selda";
        int findexScore=1300;
        int age2= 29;
        int income=60000;

        boolean isEligibileLoan=findexScore>1100&&(age2>=18&age2<70)&&income>=25000;
        System.out.println("isEligibileLoan = " + isEligibileLoan);

        String studenName="Ayşe";
        double gpa= 3.6;
        int familyIncome=65000;

        /*
        gpa>=3.5
        fanilyIncome<20000
        */
        boolean bursAlmayaUygunMu=gpa>=3.5||familyIncome<20000;
        System.out.println(studenName+" Hanım burs almaya uygun bir adaydır : "+bursAlmayaUygunMu);



    }
}
