package LeetCodeEasyProblems;

public class SearchInsertPosition{
    public int searchOrInsert(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right)/2;
            if(target == mid){
                return mid;
            }
            else if(target < nums[mid]){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        SearchInsertPosition obj = new SearchInsertPosition();
        int[] num = {1,3,5,6};
        System.out.println(obj.searchOrInsert(num, 4));
    }
}