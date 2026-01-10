package Daily_Code.charan;

public class RemoveElementFromArray {
    static void remove(int[] arr, int num){
        int[] newArray = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(num != arr[i]){
                newArray[i] = arr[i];
            }
        }
        for(int i : newArray){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,3,1,2};
        remove(arr, 4);
    }
}



