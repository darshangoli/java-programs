package strivers.basic_maths.Recursion;

public class ReverseAnArray {
    public static void reverse(int[] arr, int l, int r){
        if(l >= r){
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverse(arr, l+1, r-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int l = 0;
        int r = arr.length-1;
        reverse(arr, l, r);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
