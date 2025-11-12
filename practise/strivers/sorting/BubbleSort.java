public class BubbleSort {
    void bubbleSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i : arr){
            System.err.print(i+" ");
        }
    }
    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();
        int[] arr = {3,1,2,5,4,0};
        obj.bubbleSort(arr);
    }
}
