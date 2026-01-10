package Daily_Code.strivers.sorting;

public class SelectionSort{
    public void sorting(int[] arr){
        for(int i=0; i<arr.length; i++){
            int mini = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[mini]){
                    mini = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();
        int[] arr = {4,23,6,5,9,1};
        obj.sorting(arr);
    }
}


