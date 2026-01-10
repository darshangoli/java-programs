package Daily_Code.interview_prep;

public class SmallestLargestInArray {
    int[] arr;
    public SmallestLargestInArray(int[] arr){
        this.arr = arr;
    }
    public int smallest(){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public int largest(){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,6,5,8,7,1};
        SmallestLargestInArray obj = new SmallestLargestInArray(arr);
        
        System.out.println("Smallest Number : "+obj.smallest());
        System.out.println("Largest Number : "+obj.largest());
    }
}



