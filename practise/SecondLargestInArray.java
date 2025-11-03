public class SecondLargestInArray {
    int findSecondLargest(int[] nums){
        int max = Integer.MIN_VALUE;
        int secMax = 0;
        for(int i : nums){
            if(i > max){
                secMax = max;
                max = i;
            }
        }
        return secMax;
    }
    public static void main(String[] args) {
        SecondLargestInArray obj = new SecondLargestInArray();
        int[] nums = {2,5,4,3,8,1};
        System.out.println(obj.findSecondLargest(nums));
    }
}
