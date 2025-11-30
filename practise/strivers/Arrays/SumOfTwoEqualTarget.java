
public class SumOfTwoEqualTarget {
    public void complement(int[] arr, int target){
        for(int i : arr){
            for(int j : arr){
                if(arr[i] + arr[j] == target){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        SumOfTwoEqualTarget obj = new SumOfTwoEqualTarget();
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int target = 9;
        obj.complement(arr, target);
    }
}
