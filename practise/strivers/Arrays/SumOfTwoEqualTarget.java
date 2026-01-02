import java.util.HashMap;
import java.util.Map;

public class SumOfTwoEqualTarget {
    public Map<Integer,Integer> complement(int[] arr, int target){
        Map<Integer,Boolean> seen = new HashMap<>();
        Map<Integer,Integer> result = new HashMap<>();
        
        for(int num : arr){
            int complement = target - num;

            if(seen.containsKey(complement)){
                result.put(complement, num);
            }
            seen.put(num, true);
        }
        
        return result;
    }
    public static void main(String[] args) {
        SumOfTwoEqualTarget obj = new SumOfTwoEqualTarget();
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int target = 9;
        System.out.println(obj.complement(arr, target));
    }
}
