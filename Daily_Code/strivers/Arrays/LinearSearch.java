package Daily_Code.strivers.Arrays;

public class LinearSearch{
    static int findPosition(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,5,6,};
        int target = 2;
        System.out.print(findPosition(arr, target));
    }
}



