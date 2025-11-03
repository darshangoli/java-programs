import java.util.HashSet;
import java.util.Set;

public class RemoveDupsFromString2 {
    public static String removeDups(String str){
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for(char ch : str.toCharArray()){
            if(set.add(ch)){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeDups("darshan"));
    }
}
