package Daily_Code.LeetCodeEasyProblems;

public class MoveZerosToEnd {
    int[] moveEnd(int[] arr){
        int[] result = new int[arr.length];
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                result[index++] = arr[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        MoveZerosToEnd obj = new MoveZerosToEnd();
        int[] arr = {0,1,0,3,12};
        int[] result = obj.moveEnd(arr);
        for(int i : result){
            System.out.print(i+" ");
        }
    }
}
