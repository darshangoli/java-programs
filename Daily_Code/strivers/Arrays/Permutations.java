package Daily_Code.strivers.Arrays;

import java.util.*;

public class Permutations {

    public static void permute(int[] arr, int index, List<List<Integer>> result) {

        // base case
        if (index == arr.length) {
            List<Integer> temp = new ArrayList<>();
            for (int num : arr) temp.add(num);
            result.add(temp);
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);          // choose
            permute(arr, index + 1, result); // explore
            swap(arr, index, i);          // un-choose (backtrack)
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();

        permute(arr, 0, result);

        System.out.println(result);
    }
}



