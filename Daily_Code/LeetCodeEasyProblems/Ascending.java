package Daily_Code.LeetCodeEasyProblems;

public class Ascending {
    int[] ascending(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                int c = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = c;
                i=-1;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Ascending obj = new Ascending();
        int[] arr = {6,5,4,3,8};
        int[] result = obj.ascending(arr);
        for(int i : result){
            System.out.print(i+" ");
        }
    }
}
