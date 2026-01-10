package Daily_Code.LeetCodeEasyProblems;

import java.util.Arrays;
import java.util.logging.Logger;

public class SearchInsertPosition {
    private static final Logger log = Logger.getLogger(SearchInsertPosition.class.getName());

    public int searchOrInsert(int[] nums, int target) {
        Arrays.sort(nums);
        log.info(Arrays.toString(nums));
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        SearchInsertPosition obj = new SearchInsertPosition();
        int[] num = { 1, 3, 5, 6, 9, 8, 2 };
        System.out.println("result: "+obj.searchOrInsert(num, 4));
    }
}



