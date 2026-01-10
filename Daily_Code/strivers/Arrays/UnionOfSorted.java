import java.util.*;

public class UnionOfSorted {
    Set<Integer> union(int[] arr1, int[] arr2){
        Set<Integer> set = new TreeSet<>();
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            set.add(arr2[i]);
        }
        return set;
    }
    public static void main(String[] args) {
        UnionOfSorted obj = new UnionOfSorted();
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {4,5,6,7,8,9};
        System.out.println(obj.union(arr1, arr2));
    }
}
