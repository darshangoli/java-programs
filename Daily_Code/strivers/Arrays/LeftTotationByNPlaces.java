
public class LeftTotationByNPlaces {

    // LEFT ROTATION BY N
    int[] leftRotate(int[] arr, int n){
        n = n % arr.length;
        int[] temp = new int[n];

        // Step 1: Copy first N elements
        for(int i = 0; i < n; i++){
            temp[i] = arr[i];
        }

        // Step 2: Shift other elements to the left
        for(int i = n; i < arr.length; i++){
            arr[i - n] = arr[i];
        }

        // Step 3: Copy temp elements to end
        for(int i = 0; i < n; i++){
            arr[arr.length - n + i] = temp[i];
        }

        return arr;
    }

    // RIGHT ROTATION BY N
    int[] rightRotate(int[] arr, int n){
        n = n % arr.length;
        int[] temp = new int[n];

        // Step 1: Copy last N elements to temp
        for(int i = 0; i < n; i++){
            temp[i] = arr[arr.length - n + i];
        }

        // Step 2: Shift remaining elements to the right
        for(int i = arr.length - 1; i >= n; i--){
            arr[i] = arr[i - n];
        }

        // Step 3: Copy temp elements to the beginning
        for(int i = 0; i < n; i++){
            arr[i] = temp[i];
        }

        return arr;
    }

    public static void main(String[] args) {
        LeftTotationByNPlaces obj = new LeftTotationByNPlaces();

        int[] arr1 = {1,2,3,4,5,6,7,8};
        int[] leftResult = obj.leftRotate(arr1, 3);
        System.out.print("Left Rotation: ");
        for(int i : leftResult){
            System.out.print(i+" ");
        }

        System.out.println();

        int[] arr2 = {1,2,3,4,5,6,7,8};
        int[] rightResult = obj.rightRotate(arr2, 3);
        System.out.print("Right Rotation: ");
        for(int i : rightResult){
            System.out.print(i+" ");
        }
    }
}
