public class ReverseArray {
    void reverseArray(int[] arr){
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        ReverseArray obj = new ReverseArray();
        int[] nums = {4,5,3,2,7};
        obj.reverseArray(nums);
    }
}
