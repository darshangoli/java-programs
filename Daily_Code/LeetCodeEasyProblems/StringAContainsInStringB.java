package Daily_Code.LeetCodeEasyProblems;

import java.util.HashMap;
import java.util.Map;

public class StringAContainsInStringB {
    boolean canConstruct(String str1, String str2){
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : str2.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(char ch : str1.toCharArray()){
            if(!map.containsKey(ch) || map.get(ch) == 0){
                return false;
            }
            map.put(ch, map.get(ch)-1);
        }
        return true;
    }
    public static void main(String[] args) {
        StringAContainsInStringB obj = new StringAContainsInStringB();
        System.out.println(obj.canConstruct("han", "darshan"));
    }
}
