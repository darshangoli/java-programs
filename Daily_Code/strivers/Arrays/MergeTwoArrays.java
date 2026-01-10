package Daily_Code.strivers.Arrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeTwoArrays{
    public static void main(String[] args) {
        int[] arr1 = {4,3,1,6};
        int[] arr2 = {7,8,6};
        int[] result = Stream.concat(Arrays.stream(arr1).boxed(), Arrays.stream(arr2).boxed())
                        .mapToInt(i -> i)
                        .sorted()
                        .toArray();
        for(int i : result){
            System.out.print(i+" ");
        }
    }
}


