package Daily_Code.strivers.Arrays;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArrayElementsBySignUnequal {
    int[] rearrange(int[] arr){
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        int i = 0, p = 0, n = 0;
        // int[] result = new int[arr.length];

        for(int num : arr){
            if(num < 0){
                neg.add(num);
            }
            else{
                pos.add(num);
            }
        }

        while(n < neg.size() && p < pos.size()){
            arr[i++] = neg.get(n++);
            arr[i++] = pos.get(p++);
        }

        while(n < neg.size()){
            arr[i++] = neg.get(n++);
        }

        while(p < pos.size()){
            arr[i++] = pos.get(p++);
        }

        return arr;
    }

    public static void main(String[] args) {
        RearrangeArrayElementsBySignUnequal obj = new RearrangeArrayElementsBySignUnequal();
        int[] arr = {1,3,2,-4,-7,-9,6,7,8,-1,-2};
        int[] result = obj.rearrange(arr);
        for(int i : result){
            System.out.print(i+" ");
        }
    }
}



