package Daily_Code.LeetCodeEasyProblems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatingCharacter {
    int indexOfNonRepeatingChar(String str){
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(int i=0; i<str.length(); i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
        }
        for(int i=0; i<str.length(); i++){
            if(map.get(str.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        FindFirstNonRepeatingCharacter obj = new FindFirstNonRepeatingCharacter();
        System.out.println(obj.indexOfNonRepeatingChar("darshand"));
    }
}
