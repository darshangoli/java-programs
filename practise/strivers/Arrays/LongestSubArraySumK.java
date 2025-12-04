public class LongestSubArraySumK {
    int longestSubArray(int[] arr, int num){
        int len = 0;
        for(int i=0 ; i<arr.length; i++){
            int sum = 0;
            for(int j=i ; j<arr.length; j++){
                sum = sum + arr[j];
                if(sum == num){
                    len = Math.max(len, j-i+1);
                }
            }
        }
        return len;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,4,3,2,1};
        int num = 5;
        LongestSubArraySumK obj = new LongestSubArraySumK();
        System.out.println(obj.longestSubArray(arr, num));
    }
}
