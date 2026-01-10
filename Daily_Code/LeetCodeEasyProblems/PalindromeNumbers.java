package Daily_Code.LeetCodeEasyProblems;

public class PalindromeNumbers {
    boolean palindrome(int num){
        int original = num;
        int reverse = 0;
        while(num > 0){
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num/10;
        }
        return original == reverse;
    }
    
}
