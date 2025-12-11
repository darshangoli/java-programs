public class MaxSubArraySum {
    int[] subArray(int [] arr){
        int max = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum = sum + arr[j];
                if(sum > max){
                    max = sum;
                    start = i;
                    end = j;
                }
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
        MaxSubArraySum obj = new MaxSubArraySum();
        int[] arr = {-1, 3, -4, 5, 2, 0, -9, -4, 7};
        int[] result = obj.subArray(arr);
        for(int i : result){
            System.out.print(i+" ");
        }
    }
}
