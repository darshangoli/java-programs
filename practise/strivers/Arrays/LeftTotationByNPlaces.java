package strivers.Arrays;

public class LeftTotationByNPlaces {
    int[] leftRotate(int[] arr, int n){
        n = n % arr.length;
        int[] temp = new int[n];
        for(int i=0; i<n; i++){
            temp[i] = arr[i];
        }
        for(int i=n ; i<arr.length; i++){
            arr[i-n] = arr[i];
        }
        for(int i=0; i<n; i++){
            arr[arr.length-n+i] = temp[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        LeftTotationByNPlaces obj = new LeftTotationByNPlaces();
        int[] arr = {1,2,3,4,5,6,7,8};
        int[] result = obj.leftRotate(arr, 3);
        for(int i : result){
            System.out.print(i+" ");
        }
    }
}
