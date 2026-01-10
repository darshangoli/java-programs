import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumBrute {
    static Set<List<Integer>> triplets(int[] arr, int target){
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                }
            }    
        }
        return set;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int target = 9;
        System.out.println(triplets(arr, target));
    }
}
