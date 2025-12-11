public class MaxSubArraySumOptimal {
    int[] maxSum(int[] arr){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int start = 0;
        int tempstart = 0;
        int end = 0;

        for(int i=0; i<arr.length; i++){

            sum += arr[i];

            if(sum > max){
                max = sum;
                start = tempstart;
                end = i;
            }

            if(sum < 0){
                sum = 0;
                tempstart = i + 1;
            }
        }
        int[] result = new int[end - start+1];
        int index = 0;
        for(int i=start; i<=end; i++){
            result[index++] = arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        MaxSubArraySumOptimal obj = new MaxSubArraySumOptimal();
        int[] arr = {-1, 3, -4, 3, 2, 0, -9, -4, 4};
        int[] result = obj.maxSum(arr);
        for(int i : result){
            System.out.print(i+" ");
        }
    }
}
