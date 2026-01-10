package Daily_Code.interview_prep;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class NonRepeatingCharacter {
    char findNonRepChar(String str){
        Set <Character> set = new LinkedHashSet<>();
        for(char c : str.toCharArray()){
            set.add(c);
        }
        Iterator<Character> itr = set.iterator();
        Character prev = null;
        while(itr.hasNext()){
            Character current = itr.next();
            if(prev != null && !prev.equals(current) ){
                return prev;
            }
            prev = current;
        }
        return '\0';
    }
    public static void main(String[] args) {
        NonRepeatingCharacter obj = new NonRepeatingCharacter();
        String str = "ajinkya";
        System.out.println(obj.findNonRepChar(str));
    }
}



