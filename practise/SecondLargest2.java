public class SecondLargest2 {
    int findSecondLarge(int[] nums){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                secondMax = max;
                max = nums[i];
            }
            if(nums[i] > secondMax && nums[i] != max){
                secondMax = nums[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        SecondLargest2 obj = new SecondLargest2();
        int[] nums = {3,5,4,6,8,1};
        System.out.println(obj.findSecondLarge(nums));
    }
}
