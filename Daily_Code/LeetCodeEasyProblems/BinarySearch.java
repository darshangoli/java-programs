package Daily_Code.LeetCodeEasyProblems;

public class BinarySearch {
    boolean search(int[] arr, int target){
        int start = arr[0];
        int end = arr[arr.length - 1];
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid == target){
                return true;
            }
            else if(target > mid){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 1;
        BinarySearch obj = new BinarySearch();
        System.out.println(obj.search(arr, target));
    }
}
