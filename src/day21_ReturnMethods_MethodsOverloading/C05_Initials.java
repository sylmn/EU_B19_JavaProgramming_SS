package day21_ReturnMethods_MethodsOverloading;

public class C05_Initials {
    public static void main(String[] args) {
        //1. Create a method that can display the initials of the person.
        // initials(String firstName, String lastName)
        // Syuleyman Ahmet --> S.A.

        System.out.println("initials(\"Syuleyman\",\"Ahmet\") = " + initials("Syuleyman", "Ahmet"));
    }

    public static String initials (String firstName,String lastName){
        String result ="";
        result = firstName.charAt(0)+"."+lastName.charAt(0)+".";
        return result;
    }
}
