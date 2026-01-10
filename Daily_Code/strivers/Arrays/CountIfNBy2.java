import java.util.HashMap;
import java.util.Map;

public class CountIfNBy2 {
    int countIfNBy2(int[] arr){
        if(arr == null || arr.length == 0){
            return -1;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > arr.length/2){
                return entry.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        CountIfNBy2 obj = new CountIfNBy2();
        int[] arr = {1,3,2,5};
        int result = obj.countIfNBy2(arr);
        System.out.println(result);
    }
}
