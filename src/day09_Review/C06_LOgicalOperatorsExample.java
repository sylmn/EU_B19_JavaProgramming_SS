package day09_Review;

public class C06_LOgicalOperatorsExample {
    public static void main(String[] args) {

        //18+, Turkish
        //age>=18


        String name = "Süleyman";
        int age = 13;
        String citizenship = "Turkish";

        boolean isEligibileToVote = age >= 18 && citizenship.equalsIgnoreCase("turkiSh");
        boolean isEligibileToVote1 = age >= 18 && citizenship.equals("turkish");

        System.out.println("isEligibileToVote = " + isEligibileToVote);
        System.out.println("isEligibileToVote1 = " + isEligibileToVote1);

        System.out.println("------------");

        // findexScore >1100       income >=25000
        // age >=18    age <70m

        String name2 = "Selda";
        int findexScore = 1300;
        int age2 = 29;
        int income = 60000;

        boolean isEligibileLoan = findexScore > 1100 && income >= 25000 && age2 >= 18 && age2 < 70;
        System.out.println(name2 + " is eligible to loan from Bank of Java : " + isEligibileLoan);

        System.out.println("--------------------------");

        String name3 = "Mike";
        int age3 = 75;
        char gender = 'E'; // Male Female

        boolean isEligibileToBuyAlcohol = age3 >= 21 && (gender == 'M' || gender == 'F');

        System.out.println("isEligibileToBuyAlcohol = " + isEligibileToBuyAlcohol);

        System.out.println("-------------------");

        String studenName = "Ayşe";
        double gpa = 3.1;
        int familyIncome = 19999;

        /**
        gpa>=3.5
        familyIncome<20000
         */

        boolean isEligibleForScholorship = gpa >= 3.5 || familyIncome < 20000;

        System.out.println("isEligibleForScholorship = " + isEligibleForScholorship);

        System.out.println("---------------------");


        boolean result = false;
        System.out.println("result = " + result);
        System.out.println("!result = " + !result);


        System.out.println("---------------------");

        int examScore = 85;

        boolean isPassed = examScore >= 60;
        boolean isFailed = !isPassed;

        System.out.println("isPassed = " + isPassed);
        System.out.println("isFailed = " + isFailed);
        System.out.println("!isPassed = " + !isPassed);
    }
}
