package Daily_Code.LeetCodeEasyProblems;

public class NextBiggestElement {
    int[] findNextBiggest(int[] arr){
        int result[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            result[i] = -1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] > arr[i]){
                    result[i] = arr[j];
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        NextBiggestElement obj = new NextBiggestElement();
        int[] arr = {9,4,7,2,5,8,1};
        int[] result = obj.findNextBiggest(arr);
        for(int num : result){
            System.out.print(num+" ");
        }
    }
}
