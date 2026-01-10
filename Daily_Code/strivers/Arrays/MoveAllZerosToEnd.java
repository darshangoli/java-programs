package Daily_Code.strivers.Arrays;

public class MoveAllZerosToEnd {
    int[] move(int[] arr){
        int[] temp = new int[arr.length];
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                temp[index] = arr[i];
                index++;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        MoveAllZerosToEnd obj = new MoveAllZerosToEnd();
        int[] arr = {1,0,3,4,0,0,0,9,8};
        int[] result = obj.move(arr);
        for(int i : result){
            System.out.print(i+" ");
        }
    }
}



