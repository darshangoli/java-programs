package strivers.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingCharInString {
    char find(String str){
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue().equals(1)){
                return (char)entry.getKey();
            }
        }
        return '-';
    }
    public static void main(String[] args) {
        String str = "ddarrsshnhan";
        NonRepeatingCharInString obj = new NonRepeatingCharInString();
        System.out.println(obj.find(str));
    }
}
