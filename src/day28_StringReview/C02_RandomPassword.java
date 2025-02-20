package day28_StringReview;

import java.util.Random;

public class C02_RandomPassword {
    public static void main(String[] args) {
        System.out.println("generatePassword(8) = " + generatePassword(8));
    }
    //12 karakterli bir rasgele sifre olusturan metodu yaziniz

    public static String generatePassword (int passwordLength){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
        String password = "";
        Random random = new Random();

        for (int i = 0; i < passwordLength; i++) {
            int index = random.nextInt(characters.length());
            password+=characters.charAt(index);
        }
        return password;
    }
}
