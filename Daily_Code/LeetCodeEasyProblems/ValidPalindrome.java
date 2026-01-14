package Daily_Code.LeetCodeEasyProblems;

import java.util.logging.Logger;

public class ValidPalindrome {
    private static final Logger log = Logger.getLogger(ValidPalindrome.class.getName());

    static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    static boolean checkIfPalindrome(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch) || Character.isDigit(ch)) {
                sb.append(ch);
            }
        }
        String result = sb.toString().toLowerCase();
        log.info(result);
        String palindrome = reverse(result);
        log.info(palindrome);
        return result.equals(palindrome);
    }

    public static void main(String[] args) {
        System.out.println(checkIfPalindrome(""));
    }
}
