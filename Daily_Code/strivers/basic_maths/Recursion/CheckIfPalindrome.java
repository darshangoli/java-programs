package Daily_Code.strivers.basic_maths.Recursion;

public class CheckIfPalindrome {
    public static boolean palindrome(String str, int i, int r){
        if(i >= r){
            return true;
        }
        if(str.charAt(i) != str.charAt(r)){
            return false;
        }
        return palindrome(str, i+1, r-1);
    }
    public static void main(String[] args) {
        String str = "madam";
        int l = 0;
        int r = str.length()-1;
        System.out.println(palindrome(str, l, r));
    }
}



