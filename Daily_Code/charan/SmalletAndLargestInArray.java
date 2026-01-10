package charan;

public class SmalletAndLargestInArray {
    int[] arr;
    public SmalletAndLargestInArray(int[] arr){
        this.arr = arr;
    }
    int smallest(){
        int mini = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < arr[mini]){
                mini = i;
            }
        }
        return arr[mini];
    }
    int largest(){
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return arr[max];
    }
    public static void main(String[] args) {
        int[] arr = {5,1,3,2,7,6};
        SmalletAndLargestInArray obj = new SmalletAndLargestInArray(arr);
        System.out.println(obj.smallest());
        System.out.println(obj.largest());
    }
}
