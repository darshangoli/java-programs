package Daily_Code.interview_prep;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupsFromArray {
    public Set<Integer> reomveDups(int[] arr){
        Set<Integer> set = new LinkedHashSet<>();
        for(int i = 0; i< arr.length; i++){
            set.add(arr[i]);
        }
        return set;
    }
    public static void main(String[] args) {
        RemoveDupsFromArray obj = new RemoveDupsFromArray();
        int[] arr = {1,4,4,2,5,2,6,6,1};
        System.out.println(obj.reomveDups(arr));
    }
}



