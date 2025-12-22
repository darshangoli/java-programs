public class LongestConsecutiveSequence {
    public static int sequence(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        int maxCount = 1;
        int currentCount = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i] == arr[i-1]+1){
                currentCount++;
            }
            else if(arr[i] != arr[i-1]){
                currentCount = 1;
            }
            maxCount = Math.max(maxCount, currentCount);
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,7,11,45,56,57,58,59};
        System.out.println(sequence(arr));
    }
}
