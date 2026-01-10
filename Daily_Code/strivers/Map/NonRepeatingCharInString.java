package strivers.Map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class NonRepeatingCharInString {
    List<Character> find(String str){
        List<Character> chars = new ArrayList<>();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue().equals(1)){
                chars.add(entry.getKey());
            }
        }
        return chars;
    }
    public static void main(String[] args) {
        String str = "darshan";
        NonRepeatingCharInString obj = new NonRepeatingCharInString();
        System.out.println(obj.find(str));
    }
}
