package Daily_Code.LeetCodeEasyProblems;

import java.util.Arrays;

public class LongestCommonPrefixInArray {
    static String findCommonPrefix(String[] stings){
        Arrays.sort(stings);
        String str1 = stings[0];
        String str2 = stings[stings.length - 1];
        int index = 0;

        while(index < str1.length()){
            if(str1.charAt(index) == str2.charAt(index)){
                index++;
            }
            else{
                break;
            }
        }
        return index == 0 ? "" : str1.substring(0, index);
    }
    public static void main(String[] args) {
        String[] strs = {"flock","flower","floral","flood"};
        System.out.println(findCommonPrefix(strs));
    }
}
