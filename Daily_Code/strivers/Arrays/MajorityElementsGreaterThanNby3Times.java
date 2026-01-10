package Daily_Code.strivers.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementsGreaterThanNby3Times {
    private static List<Integer> findMajority(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int threshHold = arr.length/3;
        for(int num : arr){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num, 1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > threshHold){
                list.add(entry.getKey());
            }
        }
        return list;
    } 
    public static void main(String[] args) {
        int[] arr = {2,1,2,2,3,2,5,5,5,5};
        System.out.println(findMajority(arr));
    }
}



