package day28_StringReview;

public class C09_Homework2 {
    public static void main(String[] args) {
         /** 2-Return true if the string "cat" and "dog" appear the same number of times in the given string.
          * catDog("catdog") → true
          * catDog("catcat") → false
          * catDog("1cat1cadodog") → true
          * catDog("catcatdogdog") → true
          */

        System.out.println("catDog(\"1cat1cadodog\") = " + catDog("1cat1cadodog"));
    }
    public static boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 3);
            if (sub.equals("cat")) {
                catCount++;
            } else if (sub.equals("dog")) {
                dogCount++;
            }
        }

        return catCount == dogCount;
    }
}
