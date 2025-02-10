package day21_ReturnMethods_MethodsOverloading;

import java.util.Scanner;

public class C11_Task2 {
    public static void main(String[] args) {
        /**
         * Task: Create a method that returns calculate the grade of the student based on the score
         *
         * score >= 90 grade 'A'
         * score >= 80 grade 'B'
         * score >= 70 grade 'C'
         * score >= 60 grade 'D'
         * score < 60 grade 'F'
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Adinizi girin : ");
        String name = scan.nextLine();
        System.out.println(name + " notunuzun harf karsiligi = " + gradeOfStudent());
    }

    public static char gradeOfStudent() {
        Scanner scan = new Scanner(System.in);

        char grade = 'F';
        while (true) {
            System.out.print("Not ortalamanizi girin : ");
            int notOrt = scan.nextInt();
            if (notOrt >= 90 && notOrt <= 100) {
                grade = 'A';
                break;
            } else if (notOrt >= 80 && notOrt < 90) {
                grade = 'B';
                break;
            } else if (notOrt >= 70 && notOrt < 80) {
                grade = 'C';
                break;
            } else if (notOrt >= 60 && notOrt < 70) {
                grade = 'D';
                break;
            } else if (notOrt < 60 && notOrt >= 0) {
                grade = 'F';
                break;
            } else {
                System.out.println("Yanlis not ortalamasi girildi");
            }
        }
        return grade;
    }
}
