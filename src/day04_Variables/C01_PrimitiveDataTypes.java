package day04_Variables;

public class C01_PrimitiveDataTypes {
    public static void main(String[]args){

        // age = 48 years old
        byte myAge; //declaration
        myAge = 48; //assignment--atama
        System.out.println(myAge);

        myAge = 55;
        System.out.println(myAge);
        System.out.println("-------------------------");

        // weight
        short myWeight = 95; //decleration and assignment
        System.out.println(myWeight);
        System.out.println("-------------------------");

        // Annual salary =75000 euro
        int mySalary = 75000;
        System.out.print("My salary is:");
        System.out.println(mySalary);
        System.out.println("-------------------------");

        // world population
        long worldPopulation = 869_999_955_452_212L;
        System.out.println(worldPopulation);
        /**
         * l veya L /okumayı kolaylaştırmak için _ kullanılır
         * Sondan üçlü gruplarla ayrılabilir
         */


    }

}
