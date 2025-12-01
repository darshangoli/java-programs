import java.util.HashMap;
import java.util.Map;

public class MaxConsecutiveOnes {
    int maxConsOne(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        while(i < arr.length - 1){
            while(arr[i] == 1){
                map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
                
            }
        }
    }
}
