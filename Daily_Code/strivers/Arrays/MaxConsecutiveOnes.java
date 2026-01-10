package Daily_Code.strivers.Arrays;

import java.util.HashMap;
import java.util.Map;

public class MaxConsecutiveOnes {
    int maxConsOne(int[] arr){
        int count = 0;
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                count++;
                max = Math.max(max, count);
            }
            else{
                count = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        MaxConsecutiveOnes obj = new MaxConsecutiveOnes();
        int[] arr = {2,1,1,1,5,4,1,1,1,4,1,1,8};
        System.out.println(obj.maxConsOne(arr));
    }
}



