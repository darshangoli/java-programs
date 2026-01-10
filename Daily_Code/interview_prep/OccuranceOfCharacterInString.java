import java.util.HashMap;
import java.util.Map;

public class OccuranceOfCharacterInString {
    public Map<Character,Integer> occurance(String str){
        str = str.toLowerCase();
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }
    public static void main(String[] args) {
        OccuranceOfCharacterInString obj = new OccuranceOfCharacterInString();
        String str = "Ddarshan";
        System.out.println(obj.occurance(str));
    }
}
