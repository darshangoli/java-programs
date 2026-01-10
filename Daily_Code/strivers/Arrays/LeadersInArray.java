import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    List<Integer> findLeaders(int[] arr){
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            boolean leader = true;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] > arr[i]){
                    leader = false;
                }
            }
            if(leader == true){
                list.add(arr[i]);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        LeadersInArray obj = new LeadersInArray();
        int[] arr = {7,3,1,2,5,4};
        System.out.println(obj.findLeaders(arr));
    }
}
