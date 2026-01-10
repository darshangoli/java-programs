import java.util.Arrays;

public class Palindromes {
    void palindrome(String str){
        char[] charArray = new char[str.length()];
        char[] revArray = new char[str.length()];
        int index1 = 0;
        int index2 = 0;
        for(char ch : str.toCharArray()){
            charArray[index1++] = ch;
        }
        for(int i=charArray.length-1; i>=0; i--){
            revArray[index2++] = charArray[i];
        }
        if(Arrays.equals(charArray, revArray)){
            System.out.println(str+" is a palindrome");
        }
        else{
            System.out.println(str+" is not a palindrome");
        }
        
    }
    public static void main(String[] args) {
        Palindromes obj = new Palindromes();
        String str = "radar";
        obj.palindrome(str);
    }
}
