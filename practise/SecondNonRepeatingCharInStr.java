import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SecondNonRepeatingCharInStr {
    static char letsFind(String str){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch, 0) + 1);
        }
        List<Character> li = new ArrayList<>();
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                li.add(entry.getKey());
            }
        }
        return li.get(1);
    }
    public static void main(String[] args) {
        System.out.println(letsFind("darshan"));
    }
}
