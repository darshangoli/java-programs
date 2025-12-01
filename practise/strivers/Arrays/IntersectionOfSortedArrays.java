import java.util.ArrayList;
import java.util.List;

public class IntersectionOfSortedArrays {
    int[] intersection(int[] arr1, int[] arr2){
        List<Integer> list = new ArrayList<>();
        int i=0; 
        int j=0;
        while(i < arr1.length && j < arr2.length){
            if(i > 0 && arr1[i] == arr1[i-1]){
                i++;
                continue;
            }
            if(j > 0 && arr2[j] == arr2[j-1]){
                j++;
                continue;
            }
            if(arr1[i] < arr2[j]){
                i++;
            }
            else if(arr1[i] > arr2[j]){
                j++;
            }
            else{
                list.add(arr1[i]);
                i++;
                j++;
            }
        }
        int[] result = new int[list.size()];
        for(int k=0; k<result.length; k++){
            result[k] = list.get(k);
        }
        return result;
    }
    public static void main(String[] args) {
        IntersectionOfSortedArrays obj = new IntersectionOfSortedArrays();
        int[] arr1 = {1,2,3,4,4,5,6};
        int[] arr2 = {4,4,5,6,7,8,9};
        int[] result = obj.intersection(arr1, arr2);
        for(int i : result){
            System.out.print(i+" ");
        }
    }
}
