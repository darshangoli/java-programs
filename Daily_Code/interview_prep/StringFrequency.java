import java.util.HashMap;
import java.util.Map;

public class StringFrequency{
    public void findFrequency(String str){
        Map<Character, Integer> freqMap = new HashMap<>();
        str = str.toLowerCase();

        for(char c : str.toCharArray()){
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        for(char key : freqMap.keySet()){
            System.out.println(key+":"+freqMap.get(key));
        }
    }

    public static void main(String[] args) {
        StringFrequency obj = new StringFrequency();
        obj.findFrequency("Darshan");
    }
}
