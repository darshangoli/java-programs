package Daily_Code.strivers.Arrays;

import java.util.*;

public class UnionOfSortedOptimal {
    Set<Integer> union(int[] arr1, int[] arr2){
        Set<Integer> list = new HashSet<>();
        int i = 0;
        int j = 0;
        while(i <arr1.length && j < arr2.length){
            if(i > 0 && arr1[i] == arr1[i-1]){
                i++;
                continue;
            }
            if(j > 0 && arr2[j] == arr2[j - 1]){
                j++;
                continue;
            }
            if(arr1[i] < arr2[j]){
                list.add(arr1[i]);
                i++;
            }
            else if(arr2[j] < arr1[i]){
                list.add(arr2[j]);
                j++;
            }
            else{
                list.add(arr1[i]);
                i++;
                j++;
            }
            while(i < arr1.length){
                if(i==0 || arr1[i] != arr1[i-1]){
                    list.add(arr1[i]);
                }
                i++;
            }
            while(j < arr2.length){
                if(j==0 || arr2[j] != arr2[j-1]){
                    list.add(arr2[j]);
                }
                j++;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        UnionOfSortedOptimal obj = new UnionOfSortedOptimal();
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {4,5,6,7,8,9};
        System.out.println(obj.union(arr1, arr2));
    }
}



