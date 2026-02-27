package Daily_Code.Interview_Programs;

// Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k. Return true if such indices exist, otherwise return false.

//   Input: nums = [1,2,3,1], k = 3
//   Output: true
//   Explanation: nums[0] == nums[3] and abs(0 - 3) = 3 <= k

//   Input: nums = [1,0,1,1], k = 1
//   Output: true
//   Explanation: nums[2] == nums[3] and abs(2 - 3) = 1 <= k

//   Input: nums = [1,2,3,1,2,3], k = 2
//   Output: false
//   Explanation: All duplicates are farther than k indices apart.

public class DSA{
    boolean find(int[] nums, int k){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j])
                {
                    if(Math.abs(i - j) <= k){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        DSA obj = new DSA();
        int[] num = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(obj.find(num, k));
    }
}
 