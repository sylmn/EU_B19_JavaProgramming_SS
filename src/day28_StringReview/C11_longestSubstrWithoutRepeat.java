package day28_StringReview;

public class C11_longestSubstrWithoutRepeat {
    public static void main(String[] args) {
        /** 4-Given a string s, find the length of the longest substring without repeating characters.
         * Example 1:
         * Input: s = "abcabcbb"
         * Output: 3
         * Explanation: The answer is "abc", with the length of 3.

         * Example 2:
         * Input: s = "bbbbb"
         * Output: 1
         * Explanation: The answer is "b", with the length of 1.

         * Example 3:
         * Input: s = "pwwkew"
         * Output: 3
         * Explanation: The answer is "wke", with the length of 3.

         * Input: s = "pwrwkew"
         * Output: 4
         * Explanation: The answer is "rwke", with the length of 3.
         */

        System.out.println("longestSubstringWithoutRepeat(\"pwrwkew\") = " + longestSubstringWithoutRepeat("pwrwkew"));
    }

    public static int longestSubstringWithoutRepeat(String str) {
        String result = "";
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            result = str.substring(i, i + 1);//p
            for (int j = i + 1; j < str.length(); j++) {
                if (!result.contains(str.substring(j, j + 1))) {//w
                    result += str.substring(j, j + 1);//pw
                } else {
                    break;
                }
                max = Math.max(max,result.length());
            }
        }
        return max;
    }
}

