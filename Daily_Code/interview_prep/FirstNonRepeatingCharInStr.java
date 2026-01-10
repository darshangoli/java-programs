package Daily_Code.interview_prep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FirstNonRepeatingCharInStr {
    static char letsFind(String str){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch, 0) + 1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return '\0';
    }
    public static void main(String[] args) {
        System.out.println(letsFind("darshan"));
    }
}



