import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupsFromString {
    String removeDups(String str){
        Set<Character> seen = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(seen.add(ch)){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        RemoveDupsFromString obj = new RemoveDupsFromString();
        String str = "darshan";
        System.out.println(obj.removeDups(str));
    }
}
