import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArrayOptimal {
    List<Integer> findLeaders(int[] arr){
        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] > max){
                max = arr[i];
                list.add(arr[i]);
            }
        }
        Collections.reverse(list);
        return list;
    }
    public static void main(String[] args) {
        LeadersInArrayOptimal obj = new LeadersInArrayOptimal();
        int[] arr = {7,3,1,2,5,4};
        System.out.println(obj.findLeaders(arr));
    }
}
